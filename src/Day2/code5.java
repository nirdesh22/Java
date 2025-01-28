package Day2;

public class code5 {
        public static void main(String[] args) {
            Frau frau = new Frau(); // using the classes below as an object here on the main methode
            Mann mann = new Mann();
            frau.ehemann = mann; // we created an object up above and we are saving it to this reference
            mann.ehefrau = frau;

        }

        public static class Mann {
            public int alter;
            public int groesse;
            public Frau ehefrau;
        }

        public static class Frau {
            public int alter;
            public int groesse;
            public Mann ehemann;
        }
}
