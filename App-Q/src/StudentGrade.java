import java.util.Scanner;
public class StudentGrade {

    public static void main(String[] argsS){
        /* การเเสดงค่า

        System.out.println("Nakhon Pathom Vocational Collage");
        System.out.println("Name :");
        System.out.println("Nickname : ");
        System.out.println("Student ID : ");

        String name = "TT" ;
        System.out.println(name);

        */

        /* การรับค่าจาก KB
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        System.out.print("Enter your number : ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.close();
        sc1.close();
        System.out.println(num);
        System.out.println(num1);
        */
        


        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Enter your Nickname : ");
        String nickname = sc.next();
        System.out.print("Enter your Student ID : ");
        String num = sc.next();
        System.out.print("Enter your GPA : ");
        int grade = sc.nextInt();
        sc.close();
        
        char point ;
        if (grade < 50) {
            point = 'F';
        }else if (grade <60) {
            point = 'D';
        }else if (grade <70) {
            point = 'C';
        }else if (grade < 80) {
            point = 'B';
        }else{
            point = 'A';
        }
        System.out.println("________________________________");
        System.out.println("Nakhon Pathom Vocational Collage");
        System.out.println("Name :" + name);
        System.out.println("Nickname : " + nickname);
        System.out.println("Student ID : " + num);
        System.out.println("Result GPA : " + grade);
        System.out.println("Grade : " + point);
        System.out.println("________________________________");
       
        
    }
}