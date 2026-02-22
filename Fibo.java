import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many terms: ");
        int count = in.nextInt();

        int p = 0, n = 1;

        System.out.print(p + " " + n); // print first two terms

        for (int i = 2; i < count; i++) {
            int temp = p + n;
            System.out.print(" " + temp);
            p = n;
            n = temp;
        }
    }
}