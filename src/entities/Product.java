package entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Product {

    private int idProduct;
    private String name;
    private String description;
    private int idSupplier;
    private int quantity;
    private Date registrationDate;

    public Product() {

    }

    // Método de cadastro do produto
    public void registerProduct(int idProduct, String name, String description, int idSupplier, int quantity, Date registrationDate){
        setIdProduct(idProduct);
        setName(name);
        setDescription(description);
        setIdSupplier(idSupplier);
        setQuantity(quantity);
        setRegistrationDate(registrationDate);
    }

    // Método para filtragem de produtos
    public List<Product> filterProduct(String productName, List<Product> listProducts){

        List<Product> result = listProducts.stream().filter(productFiltred -> Objects.equals(productFiltred.name, productName)).collect(Collectors.toList());

        return result;
    }

    // Método para listagem de todos os produtos
    public void listAllProducts(List<Product> listProducts){
        for (Product products: listProducts) {
            System.out.println(products);
        }
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduct='" + idProduct + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", supplier='" + idSupplier + '\'' +
                ", quantity='" + quantity + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }


}