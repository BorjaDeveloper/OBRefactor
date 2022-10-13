package extractvariable.good;

import extractvariable.bad.Order;

public class Main {

    void printProductPrice(Order order){
        // calcular precio total

        // 1. precio de los productos. Precio unitario del producto por la cantidad.
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // 2. descuento. Precio del pedido por el % de oferta.
        Double offerPrice = order.getPrice() * order.getOffer();

        // 3. calcular precio productos con el descuento incluido
        Double finalPrice = quantityPrice - offerPrice;

        // 4. precio envío
        Double shippingCost = 0.0;
        if(finalPrice < 50){
            shippingCost = 2.99;
        }

        // precio definitivo
        System.out.println(finalPrice + shippingCost);
    }

}