class A{

    int age;

    void show(){
        System.out.println(age);
    }

    class B{
        public void config(){
            System.out.println("in config");
        }
    }

}

public class InnerClass{
    public static void main(String[] args) {
        
        A objA = new A();
        objA.show();
        A.B objB = objA.new B();
        objB.config();
    }
}