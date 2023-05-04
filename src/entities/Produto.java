package entities;

import java.util.Date;

public class Produto {

    private String idProduct;
    private String code;
    private String name;
    private String description;
    private String supplier;
    private Date registrationDate;

    public Produto(String idProduct, String code, String name, String description, String supplier, Date registrationDate) {
        this.idProduct = idProduct;
        this.code = code;
        this.name = name;
        this.description = description;
        this.supplier = supplier;
        this.registrationDate = registrationDate;
    }

    public Produto() {

    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduct='" + idProduct + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", supplier='" + supplier + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }



    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
