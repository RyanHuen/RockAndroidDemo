package com.ryanhuen.rockutils.language

object TextUtil {

    const val EMPTY_TEXT = ""

    fun isEmpty(filePath: String?): Boolean {
        return filePath == null || filePath.isEmpty()
    }

    fun filterNull(msg: String?): String {
        if (isEmpty(msg)) {
            return EMPTY_TEXT
        }
        return msg!!
    }
}
