package LMU;

import java.util.Scanner;

public class code12 {
    public static void main ( String [] args ){

        Scanner sc = new Scanner(System.in);

        boolean isSunny = sc.nextBoolean();
        boolean isRainy = sc.nextBoolean();
        boolean isCold = sc.nextBoolean();


        boolean c = isSunny && (!isRainy || isCold);
        System.out.println(c);


    }
}