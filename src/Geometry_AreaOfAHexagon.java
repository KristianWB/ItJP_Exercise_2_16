import java.util.Scanner;

public class Geometry_AreaOfAHexagon {
    public static void main(String[] args)   {

        /* The task will be solved in three steps
        1) Prompt user for input and declare/assign essential variables
        2) Calculate results
        3) Display result
         */

        // 1) Prompting and setting up variables
        Scanner input = new Scanner(System.in);  // We need a scanner object

        System.out.print(
                "Please enter the length of the side in the hexagon: "  // Prompting
        );
        double side = input.nextDouble();  // Declaring and assigning user input

        // 2) Calculating
        double area = ((3 * Math.sqrt(3))/2) * Math.pow(side, 2);

        // 3) Display result
        System.out.print(
                "The area of the hexagon is: " + area
        );
    }
}
