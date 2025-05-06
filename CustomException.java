class AstikException extends Exception{
    
    public AstikException(String i){
        super(i);
    }
    
}

public class CustomException{
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        try {
            if (i % j == 0) {
                throw new AstikException("Its my world");
                // throw new ArithmeticException("I will not print this.");
                
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Answer is zero divisible "+e.getMessage());
        }
        catch (AstikException e){
            System.out.println("I will not accept this, "+e.getMessage());
        }
    }
}
