class Computer {
    
    void playMusic(){
        System.out.println("Music Playing");
    }

    String getMeAPen(int cost){
        if (cost < 10) {
            return "No pen";
        }else
        return "got pen";
    }
}

public class Compute{
    public static void main(String[] args) {
        
        Computer com = new Computer();

        com.playMusic();
        String ress = com.getMeAPen(25);
        System.out.println(ress);
    }
}
