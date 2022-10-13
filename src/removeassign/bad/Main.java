package removeassign.bad;

public class Main {

    /*
    Tenemos una función que nos está devolviendo el pedido y el precio total. Pues bien, esta función nos está
    sobreescribiendo el precio, modificando el precio.
    Sería una función impura, ya que está modificando parámetros sobre la entrada, está modificando datos
    sobre la entrada.
     */

    double calculateDiscount(Order order, double totalPrice){
        if (order == null || order.getPrice() == null)  // programacion defensiva
            return totalPrice;

        if (order.getPrice() > 100)
            totalPrice += order.getPrice() * order.getOffer(); // sobreescribe totalPrice
        return totalPrice;
    }
}