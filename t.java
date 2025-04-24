
class Electric{
    int domesticBill = 10000;
    int commercialBill = 40000;
}


class User1 extends Electric{


    void calculateBill(){
        System.out.println("The domestic bill for the user1 is: "+domesticBill);
    }
}

class User2 extends Electric {

    void calculateBill(){
        System.out.println("The commercial bill for the user2 is: "+commercialBill);
    }
}

public class t{
    public static void main(String[] args) {
        
        User1 u1 = new User1();
        User2 u2 = new User2();

        u1.calculateBill();
        u2.calculateBill();
    }
}