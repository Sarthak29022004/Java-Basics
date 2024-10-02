import java.util.*;

public class Method_Calling {
    public static void main(String []args){
        int a = 10;
        int b = 15;
        System.out.println("Sarthak");
        Method_Calling cl = new Method_Calling();
        cl.add();
        Sub();
    }
    public void add() { //We need to create object for public method and then call it
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.println(C + D);
    }
    static void Sub() {  //We don't need to create object, we can directly call static method 
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.println(C + D);
    }
}
