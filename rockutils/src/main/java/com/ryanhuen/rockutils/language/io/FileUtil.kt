package com.ryanhuen.rockutils.language.io

import com.ryanhuen.rockutils.language.TextUtil
import java.io.File

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
 * 2020/5/20 : 16:11
 */
object FileUtil {

    fun newFile(path: String): File {
        return File(path)
    }

    fun isFile(file: File?): Boolean {

        return try {
            file?.isFile ?: false
        } catch (e: Exception) {
            false
        }
    }

    fun isFile(filePath: String?): Boolean {
        return isFile(newFile(TextUtil.filterNull(filePath)))
    }

    fun isDir(file: File?): Boolean {

        return try {
            file?.isDirectory ?: false
        } catch (e: Exception) {
            false
        }
    }

    fun isDir(filePath: String?): Boolean {
        return isDir(newFile(TextUtil.filterNull(filePath)))
    }


    fun isFileExist(file: File?): Boolean {
        return file?.exists() ?: false
    }

    fun isFileExist(filePath: String?): Boolean {

        return if (TextUtil.isEmpty(filePath)) false else isFileExist(File(filePath!!))//!!表示非空断言
    }

    fun ensureFileExists(file: File?): Boolean {

        if (isFileExist(file)) {
            return true
        }
        val parent = file?.parentFile
        return if (ensureDirExists(parent)) {
            createNewFile(file);
        } else {
            false;
        }
    }

    fun createNewFile(file: File?): Boolean {
        return try {
            return file?.createNewFile() ?: false
        } catch (e: Exception) {
            false
        }
    }

    fun ensureDirExists(dir: File?): Boolean {
        return if (isFileExist(dir)) {
            true
        } else {
            makeDirs(dir)
        }
    }

    fun makeDirs(dir: File?): Boolean {
        return try {
            return dir?.mkdirs() ?: false
        } catch (e: Exception) {
            false
        }
    }


}