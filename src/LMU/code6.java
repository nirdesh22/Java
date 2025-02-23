package LMU;

// Extracting a substring
// Sub-String is basically giving a certain value from a String to the another
// Like A = apple  and B = ple


import java.util.Scanner;
public class code6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        String sub = name.substring(number1, number2 +1);

        System.out.println(sub);
    }
}
