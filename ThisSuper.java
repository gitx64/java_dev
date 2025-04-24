class A {
    public A() {
        System.out.println("in A");
    }

    public A(int a) {
        this(); // Calls the no-argument constructor of A
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(0); // Calls the parameterized constructor of A
        System.out.println("in B");
    }

    public B(int a) {
        this(); // Calls the no-argument constructor of B
        System.out.println("in b int");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B obj = new B(25); // This will trigger all 4 constructors
    }
}
