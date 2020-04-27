package com.ryanhuen.rocknet;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
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
 * 2020/4/24 : 18:19
 */
public class RockOkPractice {

    public static void rockSimpleGet() {

        final OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addInterceptor(new LogInterceptor())
                .build();
        String url = "https://wanandroid.com/wxarticle/chapters/json";

        Request.Builder builder = new Request.Builder();
        final Request request = builder
                .url(url)
                .get()
                .build();
        final Call call = okHttpClient.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.d(RockNetTag.RN_T_TEST, "RockOkPractice" + " : onFailure: ");
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

                ResponseBody body = response.body();
                if (body == null) {
                    Log.d(RockNetTag.RN_T_TEST, "RockOkPractice" + " : onResponse: body null");
                } else {
//                    Log.d("MuXi", "RockOkPractice" + " : onResponse byteString: " + body.byteString());
                    Log.d(RockNetTag.RN_T_TEST, "RockOkPractice" + " : onResponse String: " + body.string());
                    body.close();
                }
            }
        });
    }

    public static void rockSimplePost() {

        final OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addInterceptor(new LogInterceptor())
                .build();
        String url = "https://wanandroid.com/wxarticle/chapters/json";

        Request.Builder builder = new Request.Builder();
        final Request request = builder
                .url(url)
                .get()
                .build();
        final Call call = okHttpClient.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.d(RockNetTag.RN_T_TEST, "RockOkPractice" + " : onFailure: ");
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

                ResponseBody body = response.body();
                if (body == null) {
                    Log.d(RockNetTag.RN_T_TEST, "RockOkPractice" + " : onResponse: body null");
                } else {
//                    Log.d("MuXi", "RockOkPractice" + " : onResponse byteString: " + body.byteString());
                    Log.d(RockNetTag.RN_T_TEST, "RockOkPractice" + " : onResponse String: " + body.string());
                    body.close();
                }
            }
        });
    }
}
