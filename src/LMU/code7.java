package LMU;

import java.util.Scanner;

public class code7 {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double time = sc.nextDouble();

        double avg = distance/time;

        System.out.println(avg);
    }
}
