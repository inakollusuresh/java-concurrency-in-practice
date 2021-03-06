package com.moqi.a.a03.a0305;

import java.util.HashSet;
import java.util.Set;

/**
 * Secrets
 * <p>
 * Publishing an object
 * 发布一个对象
 *
 * @author Brian Goetz and Tim Peierls
 */
class Secrets {
    public static Set<Secret> knownSecrets;

    public void initialize() {
        knownSecrets = new HashSet<>();
    }
}

/**
 * 补充：重写了 hashCode 和 equals 方法
 */
class Secret {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
