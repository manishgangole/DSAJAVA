import java.util.Scanner;

public class Printnum {
    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= n ; i++) {
            System.out.println(i);


        }
    }
}
