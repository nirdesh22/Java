package Day6;

import java.util.Scanner;

// Difference of times
public class code1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // the first three inputs
        int first_hour = scanner.nextInt();
        int first_minutes = scanner.nextInt();
        int first_seconds = scanner.nextInt();

        int sum1 = first_hour * 60 * 60 + first_minutes * 60 + first_seconds;

        // the second  three inputs
        int second_hour = scanner.nextInt();
        int second_minutes = scanner.nextInt();
        int second_seconds = scanner.nextInt();

        int sum2 = second_hour *60 *60 + second_minutes* 60 + second_seconds;

        int difference = sum2 - sum1;
        System.out.println(difference);

    }
}
