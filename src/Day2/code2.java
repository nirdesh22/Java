package Day2;

// Passing the variable into the methode
public class code2 {
    public static void main( String [] args ){
        kreisumfangAusdrucken(5); // this is the input (declearing a variable, which is gonna be passed into methode down below

    }
    public static void kreisumfangAusdrucken(int radius ){
        Double pi = 3.14;
        Double C =2 * pi * radius;
        System.out.println(C);

    }
}
