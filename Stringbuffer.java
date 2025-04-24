public class Stringbuffer{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Astik");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Goswami");
        System.out.println(sb);
        String str = sb.toString();
        
        sb.insert(0," java ");
        System.out.println(sb);
    }
}