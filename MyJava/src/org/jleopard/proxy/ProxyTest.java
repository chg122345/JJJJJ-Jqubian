package org.jleopard.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-09-10  下午11:05
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class ProxyTest {

    public static void main(String[] args) {
        Factory factory = new CarFactory();
        InvocationHandler h = new InvocationHandlerImpl(factory);

        Factory proxy = (Factory) Proxy.newProxyInstance(CarFactory.class.getClassLoader(),CarFactory.class.getInterfaces(),h);
        System.out.println(proxy.provide());
    }
}
