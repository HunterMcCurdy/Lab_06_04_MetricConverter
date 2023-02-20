import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // declare variables
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        // ask for a measurement
        System.out.println("Give me a measurement in meters");
        if(in.hasNextDouble())
        {
            meters = in.nextDouble();
            miles = meters / 1609;
            feet = meters * 3.281;
            inches = meters * 37.37;
            System.out.println("The measurement you gave me is " + miles + " in miles " + feet + " in feet and " + inches + " in inches");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect variable: " + trash);
            // ends program
            System.exit(0);
        }






    }
}