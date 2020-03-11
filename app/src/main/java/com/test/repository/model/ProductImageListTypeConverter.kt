
package com.test.repository.model

import android.arch.persistence.room.TypeConverter
import com.test.utilities.COMMA
import com.test.utilities.EMPTY

class ProductImageListTypeConverter {

    @TypeConverter
    fun fromListToString(list: List<ProductImage>): String {
        var result = EMPTY
        list.forEach { result += "${it.url}$COMMA" }
        return result.substringBeforeLast(COMMA)
    }

    @TypeConverter
    fun fromStringToList(string: String): List<ProductImage> {
        val result = mutableListOf<ProductImage>()

        if (!string.isBlank()) {
            string.split(COMMA).forEach { result += ProductImage(it) }
        }

        return result
    }
}