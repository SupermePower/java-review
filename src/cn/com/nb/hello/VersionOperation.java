package cn.com.nb.hello;

import cn.com.nb.domain.VersionDomain;

/**
 * @description:
 * @author: liying.fu
 * @date: 2019/5/18 下午4:49
 */
public class VersionOperation {
    private ThreadLocal<VersionDomain> versionThreadLocal = new ThreadLocal<>();

    public void setObjectVersion() {
        VersionOperation operation = new VersionOperation();
    }
}
