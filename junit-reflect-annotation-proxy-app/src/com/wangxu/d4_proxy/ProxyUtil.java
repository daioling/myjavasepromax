package com.wangxu.d4_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar){
        //ClassLoader loader,
        //Class<?>[] interfaces,
        //InvocationHandler h
        // 参数一：用于指定一个类加载器。
        // 参数二：指定生成的代理长什么样子，也就是有那些方法
        // 参数三：用来指定生成的代理对象要干什么事情
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override // 调用方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 代理对象要做的事情，会在这里写代码。
                        if (method.getName().equals("sing")){
                            System.out.println("准备话筒，收费30万元");
                        }else {
                            System.out.println("准备场地，收费100万元");
                        }
                        return method.invoke(bigStar, args);
                    }
                });
        return starProxy;
    }
}
