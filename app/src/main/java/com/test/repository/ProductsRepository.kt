
package com.test.repository

import android.arch.lifecycle.LiveData
import com.test.repository.local.LocalRepository
import com.test.repository.model.Product
import com.test.repository.remote.RemoteRepository
import com.test.utilities.ConnectivityAgent
import java.util.concurrent.Executor

class ProductsRepository(
        private val connectivityAgent: ConnectivityAgent,
        private val localRepository: LocalRepository,
        private val remoteRepository: RemoteRepository,
        private val executor: Executor) {

    fun getProducts(): LiveData<List<Product>> {
        refreshProducts()
        return localRepository.getProducts()
    }

    fun refreshProducts() {
        if (!connectivityAgent.isDeviceConnectedToInternet())
            return

        executor.execute {
            val response = remoteRepository.getProducts().execute()
            response.body()?.toTypedArray()?.let {
                localRepository.saveProducts(it)
            }
        }
    }
}