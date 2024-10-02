import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Switch call = new Switch();
        call.condition();
    }
    public void condition() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter day no. (1-7): ");
        int day = SC.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday"); 
                break;
            case 3:
                System.out.println("Wednesday");   
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter no. between 1-7");
                break;
        }
        SC.close();
    }
}