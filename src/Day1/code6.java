package Day1;

// taking the user input and printing it
import java.util.Scanner;
public class code6 {
    public static void main( String [] args ){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name:");
        String name = scan.nextLine();

        System.out.println("Hello " + name);



    }
}
