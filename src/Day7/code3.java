package Day7;

import java.util.Scanner;

public class code3 {
    public static  void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int NoOfCups = sc.nextInt();
        boolean isWeekend = sc.nextBoolean();

        if (NoOfCups >=10 && NoOfCups<=20 && isWeekend){

        System.out.println("Successfull partr");}
        else {
            System.out.println("Not a Successfull party");
        }


    }
}
