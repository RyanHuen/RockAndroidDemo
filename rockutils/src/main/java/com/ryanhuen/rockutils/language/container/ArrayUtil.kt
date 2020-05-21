package com.ryanhuen.rockutils.language.container

/**
 *
 * <p>
 * <b>NOTE：注意事项</b>
 *
 * <h3>版本迭代说明</h3>
 *
 * <h4>V版本号 版本 版本编辑作者 : MuXi</h4>
 * <ul>
 *  <li>功能或重要字段说明
 * </ul>
 *
 * @author MuXi
 * 2020/5/20 : 17:39
 */
object ArrayUtil {

    fun <T> isEmpty(array: Array<T>?): Boolean {

        return length(array) <= 0
    }

    fun <T> length(array: Array<T>?): Int {
        return array?.size ?: 0
    }

    fun <T> getItem(array: Array<T>, index: Int): T? {

        return array.getOrNull(index)
    }

    fun <T> checkIndex(array: Array<T>, index: Int): Boolean {
        return index >= 0 && index < length(array)
    }
}