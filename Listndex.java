import java.util.ArrayList;
import java.util.List;

public class Listndex {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(2));
    }
}
