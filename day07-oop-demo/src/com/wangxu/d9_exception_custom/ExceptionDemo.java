package com.wangxu.d9_exception_custom;

/**
 *  需求 : 认为年龄小于0岁，大于200岁就是一个异常。
 *  自定义异常：
 *      自定义编辑时异常：
 *          a.定义一个异常类继承Exception
 *          b.重新书写构造器
 *          c.再出现异常的地方使用throw new 自定义对象抛出！
 *          编译时异常实在编译阶段就报错，提醒更加强烈，一定需要处理！！
 *      自定义运行时异常：
 *          a.定义一个异常类继承RuntimeException
 *          b.重新书写构造器
 *          c.再出现异常的地方使用throw new 自定义对象抛出！
 *          提醒不强烈，编译阶段不会报错！运行时可能出现错误！
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(34);
        } catch (ItheimaAgeIlleagalException e) {
            e.printStackTrace();
        }
        try {
            checkAge2(-34);
        } catch (ItheimaAgeIlleagalRuntimeException e) {
            e.printStackTrace();
        }
    }
    public static void checkAge2(int age) throws ItheimaAgeIlleagalRuntimeException {
        if (age < 0 || age > 200){
            // 抛出一个异常对象给调用者
            // throw : 在方法内部直接创建一个异常对象，并从此点抛出。
            // throws : 用在方法申明上的，抛出方法内部的异常
            throw new ItheimaAgeIlleagalRuntimeException(age + "  is illeagal!");
        }else {
            System.out.println("年龄合法 : 推荐商品给其购买~~~");
        }
    }
    public static void checkAge(int age) throws ItheimaAgeIlleagalException {
        if (age < 0 || age > 200){
            // 抛出一个异常对象给调用者
            // throw : 在方法内部直接创建一个异常对象，并从此点抛出。
            // throws : 用在方法申明上的，抛出方法内部的异常
            throw new ItheimaAgeIlleagalException(age + "  is illeagal!");
        }else {
        System.out.println("年龄合法 : 推荐商品给其购买~~~");
        }
    }
}
