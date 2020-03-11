
package com.test.utilities


const val EMPTY = ""
const val COMMA = ","
const val DASH = "-"
const val UNAVAILABLE = "Unavailable"

// Local Repository
//const val PRODUCTS_DATABASE_NAME = "products.db"
const val PRODUCTS_DATABASE_NAME = "users.db"
const val GET_ALL_PRODUCTS_QUERY = "SELECT * FROM Product"

// Model
//const val KEY_PRODUCT_ID = "gtin14"
//const val KEY_PRODUCT_BRAND = "brand_name"
//const val KEY_PRODUCT_NAME = "name"
//const val KEY_PRODUCT_SIZE = "size"
//const val KEY_PRODUCT_IMAGES = "images"
//const val KEY_PRODUCT_IMAGE_URL = "url"
const val KEY_PRODUCT_ID = "id"
const val KEY_PRODUCT_BRAND = "html_url"
const val KEY_PRODUCT_NAME = "login"
const val KEY_PRODUCT_SIZE = "site_admin"
const val KEY_PRODUCT_IMAGES = "avatar_url"
const val KEY_PRODUCT_IMAGE_URL = "url"

// Web service
const val API_BASE_URL = "https://api.github.com/"
const val PATH_ALL_PRODUCTS = "users?since=0"

const val DEVICE_WIDTH_PER_SPAN_COUNT_UNIT = 400