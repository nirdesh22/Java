// Take User input and conditions using if / else Statements

package Day1;
import  java.util.Scanner;
public class code1 {
    public static void main ( String [] args){

        Scanner my_scanner = new Scanner(System.in);
        System.out.println("Enter a year from start from  1900 to 1950");

        int year = my_scanner.nextInt();
        if (year == 1950){
            System.out.println("Orwell");
        }
        else if(year == 1920){
            System.out.println("Century Begin");
        }
        else{
            System.out.println(" Try  Again");
        }




    }
}
