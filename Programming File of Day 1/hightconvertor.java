// Que 10 Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;
public class hightconvertor {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double c = in.nextDouble();
        double t = c / 2.54;
        int f = (int)(t / 12);
        double i = t % 12;
        System.out.println("Your Height in cm is " + c + " while in feet is " + f + " and inches is " + i);
    }
  
}
