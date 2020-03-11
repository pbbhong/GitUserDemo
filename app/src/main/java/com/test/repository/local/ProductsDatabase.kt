package com.test.repository.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import com.test.repository.model.Product
import com.test.repository.model.ProductImageListTypeConverter
import com.test.utilities.PRODUCTS_DATABASE_NAME

@Database(entities = [(Product::class)], version = 1, exportSchema = false)
@TypeConverters(ProductImageListTypeConverter::class)
abstract class ProductsDatabase : RoomDatabase() {

    abstract fun productsDao(): ProductsDao

    companion object {
        private var INSTANCE: ProductsDatabase? = null
        fun instance(context: Context): ProductsDatabase {
            synchronized(ProductsDatabase::class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, ProductsDatabase::class.java, PRODUCTS_DATABASE_NAME).build()
                }
                return INSTANCE!!
            }
        }
    }
}