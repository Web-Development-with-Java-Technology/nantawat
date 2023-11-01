import java.util.Scanner;

public class CalculateNumber {
    public static void main (String[]argS){
        System.out.print("Enter your number A : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter your number B : ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("_________________________");
        System.out.println("**RESULT**");
        System.out.println("A+B = " +(num1+num));
        System.out.println("A-B = "+(num1-num));
        System.out.println("A*B = " +(num1*num));
        System.out.println("A/B = "+(num1+num));
    }
}
