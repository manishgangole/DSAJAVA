import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float a = input.nextFloat();
//        System.out.println("a=" + a);
        // typecasting
//        int a = (int) (33.33f);
//        System.out.println("a="+a);
        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) a;
        System.out.println(b);
    }
}
