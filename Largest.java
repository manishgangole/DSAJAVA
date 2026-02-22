import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        //Q find largest number
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max =c;
        }
        System.out.println(max);
    }
}
