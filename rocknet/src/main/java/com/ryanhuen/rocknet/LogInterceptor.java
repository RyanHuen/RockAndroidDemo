package com.ryanhuen.rocknet;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;

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
 * 2020/4/26 : 10:16
 */
public class LogInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        // 拦截请求，获取到该次请求的request
        Request request = chain.request();
        // 执行本次网络请求操作，返回response信息
        Response response = chain.proceed(request);
        if (BuildConfig.DEBUG) {
            for (String key : request.headers().toMultimap().keySet()) {
                Log.d("zp_test", "header: {" + key + " : " + request.headers().toMultimap().get(key) + "}");
            }
            Log.d(RockNetTag.RN_T_LOG, "url: " + request.url().uri().toString());
            ResponseBody responseBody = response.body();
            if (responseBody == null) {
                return response;
            }
            BufferedSource source = responseBody.source();
            source.request(Long.MAX_VALUE);

            if (HttpHeaders.hasBody(response)) {
                Buffer buffer = source.getBuffer().clone();
                if (!isPlaintext(buffer)) {
                    return response;
                }
                Log.d(RockNetTag.RN_T_LOG, "response: " + buffer.readString(StandardCharsets.UTF_8));
            }
        }
        return response;
    }

    private static boolean isPlaintext(Buffer buffer) {
        try {
            Buffer prefix = new Buffer();
            long byteCount = buffer.size() < 64 ? buffer.size() : 64;
            buffer.copyTo(prefix, 0, byteCount);
            for (int i = 0; i < 16; i++) {
                if (prefix.exhausted()) {
                    break;
                }
                int codePoint = prefix.readUtf8CodePoint();
                if (Character.isISOControl(codePoint) && !Character.isWhitespace(codePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException e) {
            return false;
        }
    }
}
