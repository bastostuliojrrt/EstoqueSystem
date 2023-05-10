package entities;

import java.util.Date;

public class Supplier extends Person{

    private int idSupplier;
    private String name;
    private String cgc;
    private Date registrationDate;

    public Supplier(){

    }

    public Supplier(String address, String city, String state, String postalCode, String cellPhone, String email, int idSupplier, String name, String cgc, Date registrationDate) {
        super(address, city, state, postalCode, cellPhone, email);
        this.idSupplier = idSupplier;
        this.name = name;
        this.cgc = cgc;
        this.registrationDate = registrationDate;
    }

    public void menuSupplier(){
        System.out.println("\n-------------- Menu de Produtos --------------\n");
        System.out.println("1 - Cadastrar Fornecedor \n2 - Procurar Fornecedor \n3 - Lista de Fornecedores \n4 - Deletar Fornecedores\n5 - Voltar\n");
        System.out.print("Escolha uma opção: ");
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "idSupplier='" + idSupplier + '\'' +
                ", name='" + name + '\'' +
                ", cgc='" + cgc + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
