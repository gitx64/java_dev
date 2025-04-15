public class JaggedArr {
    public static void main(String[] args) {
        
        int[][] arr = new int[3][]; //jagged array

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];
        
        for (int i = 0; i < arr.length; i++) { // Initialize inner arrays with varying lengths
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }


        for (int[] is : arr) {
            for (int j : is) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
