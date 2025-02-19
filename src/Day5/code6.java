package Day5;

// Converting minutes to hours and minutes format
import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        int hour =minutes/60;
        int min = minutes % 60;

        //System.out.println(hour);
        //System.out.println(min);

        System.out.println(hour+ " hours and "+ min+" minutes");

        scanner.close();
    }
}
