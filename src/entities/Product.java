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

    private int quantidade = 0;

    private Date registrationDate;

    public Product() {

    }

    // Método de cadastro do produto
    public void registerProduct(int idProduct, String name, String description, int idSupplier, Date registrationDate){
        setIdProduct(idProduct);
        setName(name);
        setDescription(description);
        setIdSupplier(idSupplier);
        setRegistrationDate(registrationDate);
    }

    // Método para filtragem de produtos
    public List<Product> searchProduct(String productName, List<Product> listProducts){
        return listProducts.stream().filter(productFiltred -> Objects.equals(productFiltred.getName(), productName)).collect(Collectors.toList());
    }

    // Método para listagem de todos os produtos
    public void listAllProducts(List<Product> listProducts){
        for (Product products: listProducts) {
            System.out.println(products);
        }
    }

    // Método para deleção de produtos
    public void deleteProduct(List<Product> listProducts, int idProduct) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getIdProduct() == idProduct){
                System.out.println("Produto " + listProducts.get(i).getIdProduct() + " deletado.");
                listProducts.remove(i);
            }
        }
    }

    // Método para verificar se o fornecedor está cadastrado
    public boolean checkSupplier(int idSupplier, List<Supplier> listSuppliers){
        boolean verify = false;

        for (Supplier suppliers: listSuppliers) {
            if (suppliers.getIdSupplier() == idSupplier){
                verify = true;
                break;
            }
        }
        if (!verify){
            System.out.println("Fornecedor não encontrado.");
        }
        return verify;
    }

    // Método para verificar se o produto existe
    public boolean checkProduct(int idProduct, List<Product> listProducts){
        boolean verify = false;

        for(Product products: listProducts){
            if (products.getIdProduct() == idProduct){
                verify = true;
                break;
            }
        }

        if (!verify){
            System.out.println("Este produto não existe.");
        }

        return verify;

    }

    // Método para verificar se já existe um produto com o idProduct informado para não deixar duplicar
    public boolean checkDuplicity(int idProduct, List<Product> listProducts){

        boolean verify = false;

        for (Product products: listProducts) {
            if (products.getIdProduct() == idProduct){
                System.out.println("Este código de produto já existe.");

                verify = true;

                break;
            }
        }
        return verify;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
                ", quantity='" + quantidade + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }


}