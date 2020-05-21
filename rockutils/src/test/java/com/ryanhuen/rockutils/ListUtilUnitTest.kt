package com.ryanhuen.rockutils

import com.ryanhuen.rockutils.language.container.ListUtil
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
class ListUtilUnitTest {

    @Test
    fun unitTest() {


        val nullList: List<Int>? = null
        var testList: List<Int>? = listOf<Int>(1, 2, 3, 4, 5)
        var go = null
        testList = nullList
        var result = ListUtil.getItem(testList, 0)
        println("空集合时获取任意index的结果 :$result")

        result = ListUtil.getFirstItem(testList);
        println("空集合时获取first item :$result")

        result = ListUtil.getLastItem(testList);
        println("空集合时获取last item :$result")

        var modifyList = mutableListOf(1, 2, 3, 4, 5)
        var removeResult = ListUtil.remove(modifyList, item = 2);
        println("空集合时删除$removeResult")
        removeResult = ListUtil.remove(modifyList, index = 60);
        println("空集合时删除$removeResult")

        println("source List: $modifyList")
        println("普通sub List: " + ListUtil.subList(modifyList, 1, 3))
        println("只有Start sub List: " + ListUtil.subList(modifyList, 1))
        println("只有End sub List: " + ListUtil.subList(modifyList, toIndex = 50))
        println("都不传 sub List: " + ListUtil.subList(modifyList))

        testList = listOf<Int>(1, 2, 3, 4)
        result = ListUtil.getItem(testList, 4);
        println("空数据集合时获取超index:$result")

        var equalsA: List<Int>? = listOf<Int>(1, 2, 3, 4, 5)
        var equalsB: List<Int>? = listOf<Int>(1, 2, 3, 4, 5)
        equalsA = nullList
        equalsB = nullList
        println("null null equals比较：" + ListUtil.equals(equalsA, equalsB))
        println("null 非null比较：" + ListUtil.equals(equalsA, modifyList))
        println("非null null比较：" + ListUtil.equals(modifyList, equalsB))
        println("源和sub之后相同数据的源equals比较：" + ListUtil.equals(modifyList, ListUtil.subList(modifyList, toIndex = 50)))
        println("源和sub之后新数据equals比较：" + ListUtil.equals(modifyList, ListUtil.subList(modifyList, 1, 3)))

    }
}