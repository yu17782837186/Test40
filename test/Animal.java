package oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public abstract class Animal {
   abstract public void shout() ; //没有实现，子类必须实现
   public void run() {
       System.out.println("跑啊跑！");
   }
// 抽象类为子类提供统一的，规范的模板，子类必须实现相关的抽象方法!
    public static void main(String[] args) {
        Animal a = new Dog();


    }

}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }
}
