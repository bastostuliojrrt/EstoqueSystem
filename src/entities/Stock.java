package entities;

import java.util.List;

public class Stock {

    private String idStock;
    private Product product;
    private int quantity;

    public Stock(){

    }

    public Stock(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void updateProduct(Product produto, int quantity) {
        setProduct(produto);
        setQuantidade(quantity);
    }

    public void addQuantity(Product product, int quantity){

    }

    public void removeQuantity(Product product, int quantity){

    }

    public void listAllAvailable(List<Stock> listStock){
        for (Stock stock: listStock) {
            System.out.println(listStock);
        }
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product listProducts) {
        this.product = product;
    }

    public int getQuantidade() {
        return quantity;
    }

    public void setQuantidade(int quantidade) {
        this.quantity = quantidade;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "idStock='" + idStock + '\'' +
                ", product=" + product +
                ", Quantity='" + quantity + '\'' +
                '}';
    }

}
