package oop;

/**
 * 测试匿名内部类
 *
 */

public class TsetAnonymousInnerClass {

    public static void test01(AA a) {
        System.out.println("*********");
        a.aa();
    }

    public static void main(String[] args) {
        TsetAnonymousInnerClass.test01(new AA() {
            @Override
            public void aa() {
                System.out.println("TsetAnonymousInnerClass");
            }
        });
    }
}interface AA {
    void aa();
}