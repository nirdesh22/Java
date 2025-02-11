package Day2;

public class code3 {
    public static void main(String[] args) {
        System.out.println(celsiusInFahrenheitUmwandeln(41));
    }
    public static double celsiusInFahrenheitUmwandeln(int celcius){
        double  TC =celcius; // Declaring the variable TC and assing it the passing value from the main methode to the double celsiusin,,,,, methode
        double TF = 1.8 * TC + 32;
        return TF; // the TF is the calculated amount here which has to be calculated and displayed
        //System.out.println(TF);
    }

    public static class code1 {
            public static void main(String[] args) {
                //schreib hier deinen Code
                Katze katze = new Katze();
                Hund hund = new Hund();
                Fisch fisch = new Fisch();
                Frau frau = new Frau();

                katze.halter = frau;  // Here halter is basically like who belongs the objets to, like to which person
                hund.halter = frau;
                fisch.halter =frau;
            }

            public static class Katze {
                public Frau halter;
            }

            public static class Hund {
                public Frau halter;
            }

            public static class Fisch {
                public Frau halter;
            }

            public static class Frau {
            }

    }
}