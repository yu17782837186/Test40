package oop;

public interface MyInterfence {
    public static final int MAX_AGE = 100;//只能定义常量，不能定义变量
    public abstract void test01();
}
class MyClass implements MyInterfence {
    @Override
    public void test01() {
        System.out.println("Mynterfence()");
    }
}

