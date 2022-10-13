package magicnumbers.bad;

public class Main {

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {

        /*
        Esto es un operador ternario, es como un ifElse. Si la condición de < 100 se cumple, entonces se
        ejecuta el 4.99, si no, se ejecuta el 0.
        La idea para simplificar el código sería sacar esto a constante.
         */
        return price < 100 ? 4.99 : 0; // hard coded

    }

    private static double calculateDiscount(double price) {
        return price * 0.1;
    }
}