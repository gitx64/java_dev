
class User
{
    private String name = "Astik";
    private int age = 21;

    int getAge(){
        return age;
    }

    int setAge(int age){
        this.age = age;
        return age;
    }

    String setName(String name){
        this.name = name;
        return name;
    }

    String getName(){
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        User u = new User();

        
        System.out.println(u.setAge(22));
        System.out.println(u.getAge());
        
        System.out.println(u.getName());
    }
    

    
}
