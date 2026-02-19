import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter digits you want to add");
        int a= input.nextInt();
        int b= input.nextInt();

        float c = input.nextFloat();
        float sum = a + b + c ;
        System.out.println("sum is -" + sum );



    }
}
