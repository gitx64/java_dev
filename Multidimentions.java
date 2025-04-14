import java.util.Scanner;

public class Multidimentions {
    public static void main(String[] args) {
        int[][] num = new int[3][4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}
