package entities;

public class Stock {

    private String idStock;
    private Product product;
    private String storage;
    private String shelf;

    public Stock(){

    }

    public Stock(String idStock, Product product, String storage, String shelf) {
        this.idStock = idStock;
        this.product = product;
        this.storage = storage;
        this.shelf = shelf;
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

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "idStock='" + idStock + '\'' +
                ", product=" + product +
                ", storage='" + storage + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
