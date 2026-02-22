import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        System.out.println("enter the number till you want sum");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + a + " natural numbers = " + sum);
    }
}
