class A{
    public void showTheMethodInThis(){
        System.out.println("In A Show");
    }
}

class B extends A{

    @Override
    // public void showsTheMethodInThis(){ here compiler shows the error 
    public void showTheMethodInThis(){
        System.out.println("In B Show");
    }
}

public class Annotation{
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheMethodInThis();
    }
}