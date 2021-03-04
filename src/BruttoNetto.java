public class BruttoNetto {
    public static void main(String[] args) {
        float netto = 252;
        int steuer = 20; //Prozent
        int maxSteuer = 50; //Euro

        float calculatedTax = netto * steuer / 100;
        System.out.println("calculatedTax = " + calculatedTax);

        //200
        boolean maxSteuerExceeded = calculatedTax >= maxSteuer;
        System.out.println("maxSteuerExceeded = " + maxSteuerExceeded);

        float brutto = netto + calculatedTax;
        System.out.println("brutto = " + brutto);
    }
}
