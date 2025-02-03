package Day3;

public class code1 {
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
