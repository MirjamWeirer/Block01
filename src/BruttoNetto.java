public class BruttoNetto {
    public static void main(String[] args) {
        float netto = 220;
        int steuer = -1; //Prozent
        int maxSteuer = 50; //Euro

        int steuer_kl = 1;

        if (steuer_kl ==1){
            //sobald eine bedingung true, wird der rest übersprungen
            steuer = 20;
        } else if (steuer_kl == 2) {
            steuer = 16;
        } else if (steuer_kl ==3) {
            steuer = 8;
        } else {
            steuer = 0;
            System.out.println("Steuerklasse nicht bekannt");
        }

        switch (steuer_kl){
            case 1: //wenn steuer_kl == 1, dann mach diesen Fall
                steuer = 20;
                break; //der Fall muss immer mit break abgeschlossen sein
            case 2:
                steuer = 16;
                break;
            case 3:
                steuer = 8;
                break;
            default:// sonst/else
                steuer =0;
                System.out.println("Steuerklasse nicht bekannt");
        }

        double calculatedTax = netto * steuer / 100;
        System.out.println("calculatedTax = " + calculatedTax);

        //200
        boolean maxSteuerExceeded = calculatedTax >= maxSteuer;
        System.out.println("maxSteuerExceeded = " + maxSteuerExceeded);

        if (maxSteuerExceeded == true){ //dann
            //entweder
            System.out.println("Der maximale Steuerbetrag wurde erreicht: " + calculatedTax + " >= " + maxSteuer);
        } else { //Else ist immer optional
            //oder
            System.out.println("Der maximale Steuerbetrag wurde noch nicht erreicht. Folgender Betrag ist noch verfügbar: " + (maxSteuer - calculatedTax));
        }

        //Wenn die maximale Steuer nicht erreicht ist, dann "Juhu" ausgeben
        if (maxSteuerExceeded == false){ //(false == false) => true
            System.out.println("Juhu");
        }

        if (!maxSteuerExceeded){ //!false => true == true => true
            System.out.println("Juhu-2");
        }

        double brutto = netto + calculatedTax;
        System.out.println("brutto = " + brutto);

        printNameToGrade(1);
        printNameToGrade(3);
        printNameToGrade(5);
    }
    //public static {Rückgabetyp: void/Datentyp} {name} ()
    public static void printNameToGrade(int grade) {
        //Ihre Aufgabe => Name für Schulnote auszugeben
        //Übung schulnote  sehr gut/gut/befriedigend/genügend/ nicht genügend
        //int schulnote = 1;
        int language = 1; //1 == Deutsch // 2 == Englisch
        //Abfragen mit UND Verknüpft
        if (grade == 1 && language == 1) {
            System.out.println("Note: Sehr Gut");
        } else if (grade == 2 && language == 1) {
            System.out.println("Note: Gut");
        } else if (grade == 3 && language == 1) {
            System.out.println("Note: Befriedigend");
        } else if (grade == 4 && language == 1) {
            System.out.println("Note: Genügend");
        } else if (grade == 5 && language == 1) {
            System.out.println("Note: Nicht Genügend");
        } else {
            System.out.println("Falsche Note");
        }
        if (grade == 1 && language == 2) {
            System.out.println("Note: A");
        } else if (grade == 2 && language == 2) {
            System.out.println("Note: B");
        } else if (grade == 3 && language == 2) {
            System.out.println("Note: C");
        } else if (grade == 4 && language == 2) {
            System.out.println("Note: D");
        } else if (grade == 5 && language == 2) {
            System.out.println("Note: F");
        }
    }
}
