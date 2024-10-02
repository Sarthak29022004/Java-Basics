import java.util.Scanner;

public class If_Else{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if (A >= 18) {
            System.out.println("You are Adult");
        }else{
            System.out.println("You are not Adult");
        }
    }
}