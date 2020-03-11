package com.test.features.productslist

import android.arch.lifecycle.ViewModel
import com.test.repository.ProductsRepository

class ProductsViewModel(private val repository: ProductsRepository) : ViewModel() {

    private val products = repository.getProducts()

    fun getProducts() = products

    fun refreshProducts() = repository.refreshProducts()
}