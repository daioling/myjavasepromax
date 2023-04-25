package com.wangxu.d2_modifier;

public class Fu {
    /**
     * 1.定义私有的成员   private 只能本类中访问
     */
    private void privateMethod(){
        System.out.println("----private-----");
    }

    /**
     * 2.定义缺省修饰的成员： 只能本类中、同包下其他类访问（包访问权限）
     */
    void method(){
        System.out.println("----  缺省（默认）  -----");
    }

    /**
     * 3.protected的修饰方法：本类，同包的其他类中、其他包的子类中。
     */
    protected void protectedMethod(){
        System.out.println("----  protected  -----");
    }
    /**
     * 3.public的修饰方法：本类，同包的其他类中、其他包的子类中。
     */
    public void publicMethod(){
        System.out.println("----  public  -----");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
