import java.util.ArrayList;
import java.util.Collection;

public class Collectionss {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        c.add(4);
        c.add(7);
        c.add(8);
        c.add(6);
        c.add(5); 


        for (Object integer : c) {
            int nums = (int)integer;
            System.out.println(nums);
        }

        // System.out.println(c);
    }
}
