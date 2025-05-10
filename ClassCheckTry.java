import java.lang.Class;

class Try{
    public void show(){
        
        try {
            Class.forName("dev");
        } catch (ClassNotFoundException e) {
            
            System.out.println("Class not found "+e);
        }

    }
}

class ClassCheckTry{
    public static void main(String[] args) {
        
        Try t = new Try();
        t.show();
    }
}
