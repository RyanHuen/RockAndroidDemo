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
 * 2020/5/21 : 16:24
 */
object MapUtil {

    fun <K, V> size(map: Map<K, V>?): Int {

        return map?.size ?: 0
    }

    fun <K, V> isEmpty(map: Map<K, V>?): Boolean {
        return map?.isEmpty() ?: true
    }
}