package com.ryanhuen.rockutils

import com.ryanhuen.rockutils.language.container.ArrayUtil
import org.junit.Test

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
 * 2020/5/20 : 17:55
 */
class ArrayUtilUnitTest {

    @Test
    fun arrayUtilUnitTest() {

        val emptyArray = arrayOfNulls<Int>(0)
        println("数组是否为空: ${ArrayUtil.isEmpty(emptyArray)}")

        val nullElementArray = arrayOfNulls<Int>(6)
        println("数组是否为空: ${ArrayUtil.isEmpty(nullElementArray)}")

        val testArray = arrayOf(1, 2, 3, 4, 5, 6)
        val empty = ArrayUtil.isEmpty(testArray)
        println("数组是否为空: $empty")

        println("获取第3个item: ${ArrayUtil.getItem(testArray, 3)}")

        println("获取第10个item: ${ArrayUtil.getItem(testArray, 10)}")

        println("第3个item是否存在: ${ArrayUtil.checkIndex(testArray, 3)}")

        println("第10个item是否存在: ${ArrayUtil.checkIndex(testArray, 10)}")
    }
}