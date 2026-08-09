interface A {
    int a = 35; // public static final by default
    void show();
}

interface C {
    void config();
}


interface D extends  C {
   void test();
}

class B implements A, D {

    public void show() {
        System.out.println("A interface");
        System.out.println("a = " + a);
    }

    public void config() {
        System.out.println("C interface");
    }
    public void test() {
       System.out.println("D interface");
    }
}

public class Main {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        D obj1 = new B();
        obj1.config();
        obj1.test();
    }
}