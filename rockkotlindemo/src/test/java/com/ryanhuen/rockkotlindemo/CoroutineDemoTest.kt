package com.ryanhuen.rockkotlindemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
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
 * 2020/5/21 : 17:08
 */
class CoroutineDemoTest {

    @Test
    fun coroutineDemoTest() {

        GlobalScope.launch {
            println("current thread" + Thread.currentThread().name)
        }
    }


}