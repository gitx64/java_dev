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


public class Static {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        Mobile.name = "Smartphone"; //this name var is now only applicable for this object now.

        obj1.price = 1400;

        obj1.show();

        Mobile obj2 = new Mobile();
        // obj2.brand = "Apple";
        // obj2.price = 2000;
        // Mobile.name = "Smartphone";//changed version after static

        //now making this name common for all the objects so that name will not be declared multiple times. By making the name as static for entire mobile object

        

        
    }
}
