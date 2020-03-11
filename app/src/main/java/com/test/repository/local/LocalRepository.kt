package com.test.repository.local

import com.test.repository.model.Product

class LocalRepository(private val productsDao: ProductsDao) {

    fun getProducts() = productsDao.getAllProducts()

    fun saveProducts(products: Array<Product>) = productsDao.saveProducts(products)
}