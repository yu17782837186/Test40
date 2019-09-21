package oop;

public interface TestInterfence {
    public static void main(String[] args) {
        Volant v = new Angle();
        v.fly();
        ((Angle) v).helpOther();
        Honest h = new GoodMan();
        h.helpOther();

    }
}
interface Volant {
    int FLY_HGHT = 1000;
    void fly();

}
interface Honest {
    void helpOther();
}
class Angle implements Volant,Honest {
    @Override
    public void helpOther() {
        System.out.println("Angle.helpOther()");

    }

    @Override
    public void fly() {
        System.out.println("Angle.fly()");

    }
}
class GoodMan implements Honest {
    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther()");

    }
}
class BirdMan implements  Volant{
    @Override
    public void fly() {
        System.out.println("Birdman.fly()");

    }
}