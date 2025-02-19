package LMU;

public class code1 {
    public static void main (String []args){
        int result = 5;
        int a = 1;
        int b = --a;
        a++;
        result += a + (--a / ++b);
        System.out.println(result);
    }
}
