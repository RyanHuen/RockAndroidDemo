package com.ryanhuen.rockjavautils.text;

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
 * 2020/4/27 : 10:39
 */
public class TextUtil {
    public static boolean isEmpty(String filePath) {
        return filePath == null || filePath.length() <= 0;
    }
}
