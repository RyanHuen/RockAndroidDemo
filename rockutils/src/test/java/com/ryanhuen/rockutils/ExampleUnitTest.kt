package com.ryanhuen.rockutils

import com.ryanhuen.rockutils.language.io.FileUtil
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val result = FileUtil.isFileExist(file = null);
        println("MuXi$result")

        RockUtilConfig.debug = true;
        println("MuXi" + RockUtilConfig.debug)
        RockUtilConfig.debug = false;
        println("MuXi" + RockUtilConfig.debug)
    }
}
