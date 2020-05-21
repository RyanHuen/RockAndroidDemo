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
 * 2020/5/20 : 18:03
 */
object ListUtil {

    fun <T> isEmpty(list: List<T>?): Boolean {

        return length(list) <= 0;
    }

    fun <T> length(list: List<T>?): Int {

        return list?.size ?: 0;
    }

    fun <T> checkIndex(list: List<T>?, index: Int): Boolean {
        return index >= 0 && index < length(list)
    }

    fun <T> getItem(list: List<T>?, index: Int): T? {

        return list?.getOrNull(index)
    }

    fun <T> getFirstItem(list: List<T>?): T? {
        return getItem(list, 0)
    }

    fun <T> getLastItem(list: List<T>?): T? {

        return getItem(list, length(list) - 1)
    }

    fun <T> remove(list: MutableList<T>?, index: Int): Boolean {

        val item = getItem(list, index)
        return remove(list, item)
    }

    fun <T> remove(list: MutableList<T>?, item: T?): Boolean {
        return if (item == null) false else list?.remove(item) ?: false
    }

    fun <T> subList(list: List<T>?, fromIndex: Int = 0, toIndex: Int = list?.size ?: 0): List<T> {
        val realFromIndex = if (fromIndex < 0) 0 else fromIndex
        if (!checkIndex(list, realFromIndex)) {
            return listOf()
        }
        var realToIndex = toIndex
        if (toIndex > length(list)) {
            realToIndex = length(list)
        }

        return if (realFromIndex < realToIndex) list?.subList(realFromIndex, realToIndex)
                ?: listOf() else listOf()
    }

    fun <T> equals(list1: List<T>?, list2: List<T>?): Boolean {
        return list1?.equals(list2) ?: list2?.equals(list1) ?: true
    }

}