

class Mobile{
    String brand;
    static String name;
    int price;

    public void show(){
        // System.out.println(brand+" : " + price + " : " + name);
        // System.out.println("In show block");
    }

    static{
        // static block being called only once.
        System.out.println("In static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");

    }
}

public class Class {

    public static void main(String[] args) {
        
    }
    
}
