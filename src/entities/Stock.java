package entities;

import java.util.List;

public class Stock {

    private String idStock;
    private List<Product> listProducts;
    private String storage;

    public Stock(){

    }

    public Stock(String idStock, List<Product> listProducts, String storage) {
        this.idStock = idStock;
        this.listProducts = listProducts;
        this.storage = storage;
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "idStock='" + idStock + '\'' +
                ", product=" + listProducts +
                ", storage='" + storage + '\'' +
                '}';
    }
}
