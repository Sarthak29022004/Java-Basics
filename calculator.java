import java.util.*;

class calculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        double num1=sc.nextDouble();
        System.out.print("Enter the Second no.: ");
        double num2=sc.nextDouble();
        System.out.print("Enter the oprator '+, -, *, /, % ': ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;    
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                break;
        }
        sc.close();
    }
}
