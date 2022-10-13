package extractvariable.bad;

//Aquí tenemos simplemente una clase llamada Order con unos atributos y unos métodos.
public class Order {

    // 1. ATRIBUTOS
    private Double price;
    private Integer quantity;
    private Double offer;
    private Double shipping;

    // 2. MÉTODOS
    public Double getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public Double getOffer() {
        return offer;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public void setOffer(Double offer) {
        this.offer = offer;
    }
    public Double getShipping() {
        return shipping;
    }
    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }



}