package Day2;


// Giving a Reference Variable for creating a new object
public class code8 {
        public static void main(String[] args) {
            Hund hund1 = new Hund();  // here hund1 is the reference variable for the Klass Hund and with new is a new object created which values is given to hund1
            hund1.name = "Max";

            //schreib hier deinen Code

            Hund hund2 = new Hund();
            hund2.name = "Bella";
            Hund hund3= new Hund();
            hund3.name = "Jack";
        }

        public static class Hund {
            public String name;
        }

}
