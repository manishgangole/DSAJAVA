import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("enter the number -");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int reversed = 0;
        while (a != 0){
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a= a/10;

        }
        System.out.println("Reversed number = " + reversed);

    }
}
