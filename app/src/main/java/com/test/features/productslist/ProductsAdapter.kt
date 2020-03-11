package com.test.features.productslist

import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.test.R
import com.test.repository.model.Product
import com.test.repository.model.ProductDiffUtilCallback

class ProductsAdapter : RecyclerView.Adapter<ProductsItemViewHolder>() {

    private val products: MutableList<Product> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ProductsItemViewHolder(parent, R.layout.layout_products_item)

    override fun onBindViewHolder(holder: ProductsItemViewHolder, position: Int) {
        holder.render(products[position])
    }

    override fun getItemCount() = products.size

    override fun getItemViewType(position: Int) = position

    fun updateProducts(products: List<Product>) {
        val diffResult = DiffUtil.calculateDiff(ProductDiffUtilCallback(this.products, products))
        diffResult.dispatchUpdatesTo(this)
        this.products.clear()
        this.products.addAll(products)
    }
}