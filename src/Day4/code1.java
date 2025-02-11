package Day4;

// Using the Scanner class to take the user inputs

import java.util.Scanner;
public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        // next takes the user input like a single word or Int values.
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        sc.close();
    }
}
