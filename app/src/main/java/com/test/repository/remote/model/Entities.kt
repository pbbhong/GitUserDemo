
package com.test.repository.remote.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.test.utilities.*

@Entity
/*
data class Product(
        @PrimaryKey @SerializedName(KEY_PRODUCT_ID) val id: String,
        @SerializedName(KEY_PRODUCT_BRAND) var brand: String?,
        @SerializedName(KEY_PRODUCT_NAME) val name: String?,
        @SerializedName(KEY_PRODUCT_SIZE) var size: String?,
        @SerializedName(KEY_PRODUCT_IMAGES) val images: List<ProductImage>
)
*/
data class Product(
 @PrimaryKey @SerializedName(KEY_PRODUCT_ID) val id: Int,
@SerializedName(KEY_PRODUCT_BRAND) var brand: String?,
@SerializedName(KEY_PRODUCT_NAME) val name: String?,
@SerializedName(KEY_PRODUCT_SIZE) var size: String?,
@SerializedName(KEY_PRODUCT_IMAGES) val images: String?
)

@Entity
data class ProductImage(
        @PrimaryKey @SerializedName(KEY_PRODUCT_IMAGE_URL) val url: String
)