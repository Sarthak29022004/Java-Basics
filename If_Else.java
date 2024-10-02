import java.util.Scanner;

public class If_Else{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int A = s.nextInt();
        if (A >= 18) {
            System.out.println("You are Adult");
        }else{
            System.out.println("You are not Adult");
        }
        //if-else statements
        System.out.print("Enter your Marks: ");
        int M = s.nextInt();
        if (M <35) {
            System.out.println("Grade: F");
        }else if (M >=35 && M <=50) {
            System.out.println("grade: D");
        }else if (M >=51 && M <=70) {
            System.out.println("grade: C");
        }else if (M >=71 && M <=80) {
            System.out.println("grade: B");
        }else if (M >=81 && M <=90) {
            System.out.println("grade: A");
        }else if (M >=91 && M <=100) {
            System.out.println("grade: A+");
        }else {
            System.out.println("Enter Valid Marks");
        }
    }
}