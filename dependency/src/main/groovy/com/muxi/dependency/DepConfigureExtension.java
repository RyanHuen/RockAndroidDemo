package com.muxi.dependency;

import com.muxi.dependency.test.Test;
import com.muxi.dependency.version.DepVersion;

import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;

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
 * 2020/4/21 : 18:25
 */
public class DepConfigureExtension {

    public int compileSdkVersion;
    public int minSdkVersion;
    public int targetSdkVersion;
    public String buildToolsVersion;

    public NamedDomainObjectContainer<DepVersion> depVersions;
    public NamedDomainObjectContainer<Test> test;

    public DepConfigureExtension(Project project) {
        NamedDomainObjectContainer<DepVersion> depVersions = project.container(DepVersion.class);
        NamedDomainObjectContainer<Test> test = project.container(Test.class);
        this.depVersions = depVersions;
        this.test = test;
    }

    public void depVersions(Action<? super NamedDomainObjectContainer<DepVersion>> action) {
        action.execute(depVersions);
    }

    public void test(Action<? super NamedDomainObjectContainer<Test>> action) {
        action.execute(test);
    }
}
