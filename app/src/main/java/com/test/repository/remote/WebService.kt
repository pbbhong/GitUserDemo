
package com.test.repository.remote

import com.test.repository.model.Product
import com.test.utilities.PATH_ALL_PRODUCTS
import retrofit2.Call
import retrofit2.http.GET


interface WebService {

    @GET(PATH_ALL_PRODUCTS)
    fun getProducts(): Call<List<Product>>
}