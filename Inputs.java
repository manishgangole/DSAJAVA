import java.util.Scanner;
public class Inputs
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your roll number");
        int rollno = input.nextInt();
        System.out.println("your roll no is= " + rollno);
        // identifier
        //int a = 2;
        String name = input.next();
        System.out.println(name);
    }
}
