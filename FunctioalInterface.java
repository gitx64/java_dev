@FunctionalInterface
interface A {

  public void show(int i); 
//   public void int() 
} 


public class FunctioalInterface{

    
    
    public static void main(String[] args) {
        
        // A obj = () ->  System.out.println("In functional interface"); //Lambda expression.

        //in case of variables:-

        A obj = (int i) -> System.out.println("In integer show");
           
         obj.show(0); 
         
        //in case of single integer value in lambda expression we also dont have to declare .
        A obj1 = i -> System.out.println("In short");

        obj1.show(0);

        A obj2 = i -> System.out.println("Hello");

        // Calling the show method using lambda expression created for obj2
        obj2.show(0);

        //make an object of the interface A

  



        
    }
}