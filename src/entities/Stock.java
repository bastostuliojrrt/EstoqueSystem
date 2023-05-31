package entities;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Stock {

    private String idStock = "3128";
    private List<Product> listStock;

    public Stock(){

    }

    public void addQuantity(List<Product> listProducts, int idProduct,int quantity){
        for (Product products: listProducts) {
            if (idProduct == products.getIdProduct()){
                products.setQuantidade(products.getQuantidade() + quantity);
            }
        }
    }

    public void removeQuantity(List<Product> listProducts, int idProduct,int quantity){
        for (Product products: listProducts) {
            if (idProduct == products.getIdProduct()){
                products.setQuantidade(products.getQuantidade() - quantity);
            }
        }
    }

    public void updateProduct(List<Product> listProducts,int idProduct,int quantity){
        for (Product products: listProducts) {
            if (idProduct == products.getIdProduct()){
                products.setQuantidade(quantity);
            }
        }
    }

    public void listAllAvailable(List<Product> listProducts){
        int i = 0;
        for (Product products: listProducts) {
            if (products.getQuantidade() > 0){
                System.out.println("\n"+listProducts.get(i));
            }
            i++;
        }
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public List<Product> getListStock(List<Product> listProducts) {
        return listStock;
    }

    public void setListStock(List<Product> listStock) {
        this.listStock = listStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "idStock='" + idStock + '\'' +
                ", Stock=" + listStock +
                '}';
    }

}
