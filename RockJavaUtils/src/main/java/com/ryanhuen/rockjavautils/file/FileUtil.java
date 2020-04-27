package com.ryanhuen.rockjavautils.file;

import com.ryanhuen.rockjavautils.text.TextUtil;

import java.io.File;

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
 * 2020/4/27 : 10:38
 */
public class FileUtil {

    public boolean isFileExist(File file) {

        if (file == null) {
            return false;
        } else {
            return file.exists();
        }
    }

    public boolean isFileExist(String filePath) {

        if (TextUtil.isEmpty(filePath)) {
            return false;
        } else {
            return isFileExist(new File(filePath));
        }
    }
}
