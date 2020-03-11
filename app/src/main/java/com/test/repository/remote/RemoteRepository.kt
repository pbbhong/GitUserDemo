
package com.test.repository.remote

class RemoteRepository(private val webService: WebService) {

    fun getProducts() = webService.getProducts()
}