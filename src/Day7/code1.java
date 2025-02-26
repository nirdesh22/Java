package Day7;

public class code1 {
    public static void main(String[] args) {
        int a = 4;
        int b = a++;
        int c = --a + b++;
        int relsult = ++a - (c++ - b) + c;
        System.out.println(relsult);
    }
 }