class Method {
    
    public int add(int n1,int n2,int n3){
       return n1 + n2 + n3; 
    }
    public int add(int n1,int n2){
       return n1 + n2; 
    }
    public double add(double n1,int n2){
       return n1 + n2; 
    }
}

public class MethodOverloading{
   public static void main(String[] args) {
      Method m = new Method();

      System.out.println(m.add(2, 3));
   }
}
