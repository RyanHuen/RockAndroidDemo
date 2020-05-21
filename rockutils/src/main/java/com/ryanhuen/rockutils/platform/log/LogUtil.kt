package com.ryanhuen.rockutils.platform.log

import android.util.Log
import com.ryanhuen.rockutils.language.TextUtil

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
 * 2020/5/20 : 16:55
 */
object LogUtil {

    private const val INNER_TAG = "L_DEF"

    private fun filterTag(tag: String? = INNER_TAG): String? {
        var tmp = tag
        if (TextUtil.isEmpty(tmp)) {
            tmp = INNER_TAG
        }
        return tmp
    }

    fun d(tag: String? = INNER_TAG, msg: String?) {
        val tmp = filterTag(tag)
        Log.d(tmp, TextUtil.filterNull(msg))
    }

    fun d(tag: String? = INNER_TAG, msg: String?, t: Throwable?) {
        if (t == null) {
            d(tag, msg)
        } else {
            val tmp = filterTag(tag)
            Log.d(tmp, TextUtil.filterNull(msg), t)
        }
    }

    fun w(tag: String? = INNER_TAG, msg: String?) {
        val tmp = filterTag(tag)
        Log.w(tmp, TextUtil.filterNull(msg))
    }

    fun w(tag: String? = INNER_TAG, msg: String?, t: Throwable?) {
        if (t == null) {
            w(tag, msg)
        } else {
            val tmp = filterTag(tag)
            Log.w(tmp, TextUtil.filterNull(msg), t)
        }
    }

    fun v(tag: String? = INNER_TAG, msg: String?) {
        val tmp = filterTag(tag)
        Log.w(tmp, TextUtil.filterNull(msg))
    }

    fun v(tag: String? = INNER_TAG, msg: String?, t: Throwable?) {
        if (t == null) {
            v(tag, msg)
        } else {
            val tmp = filterTag(tag)
            Log.v(tmp, TextUtil.filterNull(msg), t)
        }
    }

    fun i(tag: String? = INNER_TAG, msg: String?) {
        val tmp = filterTag(tag)
        Log.i(tmp, TextUtil.filterNull(msg))
    }

    fun i(tag: String? = INNER_TAG, msg: String?, t: Throwable?) {
        if (t == null) {
            i(tag, msg)
        } else {
            val tmp = filterTag(tag)
            Log.i(tmp, TextUtil.filterNull(msg), t)
        }
    }

    fun e(tag: String? = INNER_TAG, msg: String?) {
        val tmp = filterTag(tag)
        Log.e(tmp, TextUtil.filterNull(msg))
    }

    fun e(tag: String? = INNER_TAG, msg: String?, t: Throwable?) {
        if (t == null) {
            e(tag, msg)
        } else {
            val tmp = filterTag(tag)
            Log.e(tmp, TextUtil.filterNull(msg), t)
        }
    }
}