package LMU;

// to calulate a pressure

import java.util.Scanner;
public class code9 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        double density = sc.nextDouble();
        double height = sc.nextDouble();

        double g =  9.8;

        double pressure = density*height*g;

        System.out.println(pressure);

    }
}

