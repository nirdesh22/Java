
// To print a leap year using the users Input

package Day1;
import java.util.Scanner;

import static javax.management.Query.and;

public class code2 {
    public static void main (String [] args){

        Scanner my_scan = new Scanner(System.in);
        System.out.println("Enter a year to check if its a leap year : ");

        int user_year = my_scan.nextInt();
        if (user_year % 4 == 0 ){
            System.out.println("It is a leap year ");
        }
        else if (user_year % 100 == 0 ){
            System.out.println(" It is also a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }
}
