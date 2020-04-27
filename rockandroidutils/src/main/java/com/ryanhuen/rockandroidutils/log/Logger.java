package com.ryanhuen.rockandroidutils.log;

import android.util.Log;

import com.ryanhuen.rockandroidutils.RockAndroidUtil;

/**
 * Android Log工具
 *
 * @author MuXi
 * 2020/4/27 : 10:37
 */
public class Logger {

    public static void d(String tag, String message) {

        if (RockAndroidUtil.isDebugMode()) {
            Log.d(tag, message);
        }
    }

    public static void i(String tag, String message) {

        if (RockAndroidUtil.isDebugMode()) {
            Log.i(tag, message);
        }
    }

    public static void v(String tag, String message) {


        if (RockAndroidUtil.isDebugMode()) {
            Log.v(tag, message);
        }
    }

    public static void w(String tag, String message) {


        if (RockAndroidUtil.isDebugMode()) {
            Log.w(tag, message);
        }
    }

    public static void e(String tag, String message) {


        if (RockAndroidUtil.isDebugMode()) {
            Log.e(tag, message);
        }
    }

    public static void exception(Throwable t) {

        if (RockAndroidUtil.isDebugMode()) {
            Log.e(Logger.class.getName(), "exception : ", t);
        }
    }

    public static void exception(String tag, Throwable t) {

        if (RockAndroidUtil.isDebugMode()) {
            Log.d(tag, "exception : ", t);
        }
    }

}
