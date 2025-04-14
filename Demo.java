class Calculator{
    public static int add(int num1,int num2){
        // System.out.println("in add");
        int r = num1 + num2;
        return r;
    }
}



class Calc{
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int num1 = 4;
        int num2 = 5;
        int result = cal.add(num1,num2);
        System.out.println(result);
    }
}