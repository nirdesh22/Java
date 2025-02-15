package Day5;

import java.util.Scanner;

public class code4 {
    public static void main( String [] args){
        Scanner scanner = new Scanner(System.in);

        int  num1 = scanner.nextInt();
        int  num2 = scanner.nextInt();

        int add = num1 + num2;
        int mutltiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println(add);
        System.out.println(mutltiplication);
        System.out.println(division);


    }
}
