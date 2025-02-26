package LMU;

// to change celcius to Fahrenheit
import java.util.Scanner;

public class code8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temperature Value in Celcius:");
        double temp = sc.nextDouble();

        double fahrenheit = temp * 1.8 + 32;

        System.out.println("The temperature in Fahrenheit is: "+fahrenheit);
    }
}
