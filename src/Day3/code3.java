package Day3;

// To print the minimum of the 3 values here

public class code3 {
    public static int min(int a, int b) {
        //schreib hier deinen Code
        int m;
        if (a<b)
            m = a;
        else
            m = b;
        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
