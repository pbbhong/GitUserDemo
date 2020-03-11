package com.test.features.productslist

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.test.R
import com.test.repository.model.Product
import com.test.repository.model.ProductImage
import com.test.utilities.DASH
import com.test.utilities.EMPTY
import com.test.utilities.UNAVAILABLE
import kotlinx.android.synthetic.main.layout_products_item.view.*

class ProductsItemViewHolder(
        parent: ViewGroup,
        @LayoutRes itemViewLayoutId: Int
) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(itemViewLayoutId, parent, false)) {

    fun render(product: Product) {
        renderProductImage(product.images?: EMPTY)
        renderProductName(product.name ?: DASH)
        renderProductBrand(product.brand ?: EMPTY)
        renderProductSize(product.size ?: EMPTY)
    }

    private fun renderProductImage2(images: List<ProductImage>) {
        if (!images.isEmpty())
            Picasso.get()
                    .load(images[0].url)
                    .placeholder(R.drawable.background_no_image)
                    .into(itemView.productsItemImageView)
    }
    private fun renderProductImage(image_url: String) {
        if (!image_url.isEmpty())
            Picasso.get()
                    .load(image_url)
                    .placeholder(R.drawable.background_no_image)
                    .into(itemView.productsItemImageView)
    }

    private fun renderProductName(name: String) {
        itemView.productsItemNameTextView.text = name
    }

    private fun renderProductBrand(brand: String) {
        itemView.productsItemBrandTextView.text = itemView.context.getString(R.string.product_item_brand, if (brand.isBlank()) UNAVAILABLE else brand)
    }

    private fun renderProductSize(size: String) {
        itemView.productsItemSizeTextView.text = itemView.context.getString(R.string.product_item_size, if (size.isBlank()) UNAVAILABLE else size)
    }
}