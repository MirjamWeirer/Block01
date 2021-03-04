public class DatatypeExamples {

    public static void main(String[] args) {

        System.out.println("Einige Beispiele zu Datentypen: ");
        //Variablen dekalieren
        int laenge;
        int breite;
        int ergebnis;

        //Variablen initalisieren
        laenge = 5;
        breite = 7;

        ergebnis= laenge * breite; //initalisierung auf linker seite, auf rechter Seite: read/read

        System.out.println("Die Fläche von " + laenge + " und " + breite + " lautet: " + ergebnis +"cm2");

        int a,b,c;
        a=7;
        b=5;
        c=3;

        ergebnis = a/b;
        System.out.println("ergebnis = " + ergebnis);
        ergebnis = a = b*3;
        System.out.println("a = " + a);
        System.out.println("ergebnis = " + ergebnis);
        
        
        
        a = 4;
        System.out.println("a = " + a);
        /*
        Übung
        Ausgabe
        a + b = 4 + 5 = 9
        gleiche mit minus, mal, div und mod
         */
        ergebnis=a+b;
        System.out.println("a + b = " + a + " + " + b + " = " + ergebnis);
        ergebnis=a-b;
        System.out.println("a - b = " + a + " - " + b + " = "+ ergebnis);
        ergebnis=a*b;
        System.out.println("a * b = " + a + " * " + b + " = " + ergebnis);
        ergebnis=a/b;
        System.out.println("a / b = " + a + " / " + b +" = " + ergebnis);
        ergebnis=a%b;
        System.out.println("a % b = " + a + " % "+ b + " = " + ergebnis);
        //andere varianten ergebnis durch nurmmerien, können nebeneinander stehen; oder bei der ausgabe berechnung durchführen
        a = 11;
        b = 3;
        ergebnis=a+b;
        System.out.println("a + b = " + a + " + " + b + " = " + ergebnis);
        ergebnis=a-b;
        System.out.println("a - b = " + a + " - " + b + " = " + ergebnis);
        ergebnis=a*b;
        System.out.println("a * b = " + a + " * " + b + " = " + ergebnis);
        ergebnis=a/b;
        System.out.println("a / b = "+ a + " / "+ b + " = " + ergebnis);
        ergebnis=a%b;
        System.out.println("a % b = "+ a +" % "+ b +" = " + ergebnis);
        //float x, y,  => kein modulo %
        float x = 5, y = 3;
        System.out.println("x + y = " + x + " + " + y + " = " + (x+y));
        System.out.println("x - y = " + x + " - " + y + " = " + (x-y));
        System.out.println("x * y = " + x + " * " + y + " = " + (x*y));
        System.out.println("x / y = " + x + " / " + y + " = " + (x/y));
        // bei double ist das Ergebnis genauer
        double m=5, n=3;
        System.out.println("m / n = " + m + " / " + n + " = " + (m/n));
    }
}
