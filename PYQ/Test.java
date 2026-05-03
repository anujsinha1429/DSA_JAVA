package PYQ;


    interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("From Interface A");
    }

    public void showB() {
        System.out.println("From Interface B");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}

