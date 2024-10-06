import java.util.*;
public class arrays{
    public static void main(String[] args) {
        //number arrays=====================================================================
        int[] marks = {78, 89, 60,78,69,90,95};
        
        // inserting element
        marks[0]=88;

        //access elements in number arrays  try and catch exception
        try {
            for(int i=0; i<=marks.length; i++){
                System.out.print(marks[i] +" ");
            }
            System.out.println();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        //String Array============================================================
        String[] bikes={"Hf-Deluxe", "Splender", "Bullet", "Shine", "M-80"};
        for(int i=0; i<bikes.length; i++){
            System.out.print(bikes[i] + " ");
        }
        System.out.println();
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[3] = "Tata";
        for (int i = 0; i < cars.length; i++) {
        System.out.print(cars[i] + " ");
        }
        System.out.println();

        //Multi-Dimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4},
                              {5, 6, 7} };
        System.out.println(myNumbers[1][2]);// [1] means 2nd array because array starts in 0 and [2] means third element

        int[][] myNumbers2 = { {1, 2, 3, 4},
                               {5, 6, 7, 5},
                               {4, 9, 0, 3},
                               {9, 5, 9, 3} };
        System.out.println(myNumbers2[3][2]);  //9

        myNumbers2[3][2] =25;
        System.out.println(myNumbers2[3][2]); //25


        for (int i = 0; i < myNumbers2.length; ++i) {
        for (int j = 0; j < myNumbers2[i].length; ++j) {
        System.out.print(myNumbers2[i][j]+ " ");
        }
        }
        for (int[] row : myNumbers2)
            System.out.println(Arrays.toString(row)); //use this method
    }
}