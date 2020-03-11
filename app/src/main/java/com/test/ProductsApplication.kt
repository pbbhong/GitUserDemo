package com.test

import android.app.Application
import com.test.features.productslist.productsListModule
import org.koin.android.ext.android.startKoin

class ProductsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(repositoryModule, productsListModule))
    }
}