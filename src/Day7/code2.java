package Day7;
import java.util.Scanner;
public class code2 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);

        double length = sc.nextInt();
        double desity = sc.nextInt();
        float g = 9.8f;

        double pressure  = desity* length* g;

        System.out.println(pressure);
    }
}
