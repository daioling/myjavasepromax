package com.wangxu.d13_interface_jdk8;

public interface SportManInter {
    /**
     * 1. jdk 8 开始 ：默认方法
     *   -- 必须用 default 修饰， 默认用 public 修饰
     *   -- 默认方法，接口不能创建对象，这个方法只能过继给现实类，由现实类的对象调用
     */
    default void run(){
        System.out.println("跑的很快");
        go(); // 在方法内部调用
    }
    /**
     *  2. 静态方法
     *    必须使用static修饰， 默认用public修饰
     *    -- 接口的静态方法，必须接口名自己调用。
     */
    static void inAdd(){
        System.out.println("我在学习java新曾方法的语法");
    }
    /**
     *  3. 私有方法
     *    -- JDK 1.9 才开始支持
     *    必须在接口内部才可以访问
     */
    private void go(){

    }
}
class PingPongMan implements SportManInter{

}
class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        SportManInter.inAdd();
    }
}




