package LMU;

// Extracting a substring

import java.util.Scanner;
public class code6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();


        String range = name.substring(number1, number2 + 1);

        System.out.println(range);

    }
}
