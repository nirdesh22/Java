package LMU;

// To take a users input and print true or false if the name has a "burg" at the end
import java.util.Scanner;

class code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String city = scanner.nextLine();
        boolean c = city.endsWith("burg");

        System.out.println(c);
    }
}