package entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Supplier extends Person{

    private int idSupplier;
    private String name;
    private String cgc;
    private Date registrationDate;
    public Supplier(){

    }

    public void registerSupplier(String address, String city, String state, String postalCode, String cellPhone, String email, int idSupplier, String name, String cgc, Date registrationDate) {
       setAddress(address);
       setCity(city);
       setState(state);
       setPostalCode(postalCode);
       setCellPhone(cellPhone);
       setEmail(email);
       setIdSupplier(idSupplier);
       setName(name);
       setCgc(cgc);
       setRegistrationDate(registrationDate);
    }

    public List<Supplier> searchSupplier(String nameSupplier, List<Supplier> listSuppliers){
        return listSuppliers.stream().filter(supplierFiltred -> Objects.equals(supplierFiltred.name, nameSupplier)).collect(Collectors.toList());
    }

    public void listAllSuppliers(List<Supplier> listSuppliers){
        System.out.println("-------------- Lista de Fornecedores --------------\n");
        for (Supplier suppliers: listSuppliers) {
            System.out.println(suppliers);
        }
    }

    public void deleteSupplier(int idSupplier, List<Supplier> listSuppliers){
        for (int i = 0; i < listSuppliers.size(); i++){
            if (listSuppliers.get(i).getIdSupplier() == idSupplier){
                System.out.println("Fornecedor " + listSuppliers.get(i).getIdSupplier() + " deletado.");
                listSuppliers.remove(i);
            }
        }
    }

    public boolean checkDuplicity(int idSupplier, List<Supplier> listSuppliers){

        boolean verify = false;

        for (Supplier suppliers: listSuppliers) {
            if (suppliers.idSupplier == idSupplier){
                System.out.println("Este código de fornecedor já existe");

                verify = true;

                break;
            }
        }
        return verify;
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
