package Day5;

 import java.util.Scanner;

public class code5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int division = input % 2;
        // The second operation goes here
        int multiplication = division * 3;

        System.out.println(division);
        System.out.println(multiplication);


        scanner.close(); // It is quite important to close the scanner at the end of the program.
    }
}
