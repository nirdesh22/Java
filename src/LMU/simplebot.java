package LMU;

import java.util.Scanner;
public class simplebot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello! My name is Aid.");
            System.out.println("I was created in 2018.");
            System.out.println("Please, remind me your name.");

            // reading a name

            String user_name = scanner.nextLine();

            System.out.println("What a great name you have, "+ user_name + "!");
        }
}
