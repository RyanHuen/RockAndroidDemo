package com.muxi.dependency.version;

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
 * 2020/4/22 : 20:21
 */
public class DepVersion {

    private String name;
    private String aliasName;
    private String versionCode;

    public DepVersion(String name) {
        this.name = name;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getName() {
        return name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    @Override
    public String toString() {
        return aliasName + ":" + versionCode;
    }
}
