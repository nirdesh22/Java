package Day3;


// To find the minimum of the three values

public class code4 {
    public static int min(int a, int b, int c) {
        //schreib hier deinen Code
        int m1 = a < b ? a:b; // checks the value if a is smaller if not m1=b
        int m2 = m1<c ? m1:c; // here m1 is the platzhalter for a and b( if m1 smaller than m2=m1)  and if m1 is not smaller than c than m2=c

        return m2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}

