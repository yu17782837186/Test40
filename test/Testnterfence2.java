package oop;

public interface Testnterfence2 {
}
interface A {
    void testa();
}
interface B {
    void testb();
}
interface C extends A,B { //
    void testc();
}
class Mysubclass implements C {
    @Override
    public void testa() {

    }

    @Override
    public void testc() {

    }

    @Override
    public void testb() {

    }
}
