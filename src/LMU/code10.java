package LMU;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class code10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double x = a * 10.5 + b * 4.4 + (c + d) / 2.2;

        double y = 1.50511e+4;

        System.out.println(x);

        System.out.println(y);
    }
}
