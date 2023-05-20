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

    // Cadastra o fornecedor
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
        return listSuppliers.stream().filter(supplierFiltred -> Objects.equals(supplierFiltred.getName(), nameSupplier)).collect(Collectors.toList());
    }

    // Lista todos os fornecedores
    public void listAllSuppliers(List<Supplier> listSuppliers){
        System.out.println("-------------- Lista de Fornecedores --------------\n");
        for (Supplier suppliers: listSuppliers) {
            System.out.println(suppliers);
        }
    }

    // Método para deletar o fornecedor
    public void deleteSupplier(int idSupplier, List<Supplier> listSuppliers){
        for (int i = 0; i < listSuppliers.size(); i++){
            if (listSuppliers.get(i).getIdSupplier() == idSupplier){
                System.out.println("Fornecedor " + listSuppliers.get(i).getIdSupplier() + " deletado.");
                listSuppliers.remove(i);
            }
        }

    }

    // Método para verificar se já existe um fornecedor com o idSupplier informado para não deixar duplicar
    public boolean checkDuplicity(int idSupplier, List<Supplier> listSuppliers){

        boolean verify = false;

        for (Supplier suppliers: listSuppliers) {
            if (suppliers.getIdSupplier() == idSupplier){
                System.out.println("Este código de fornecedor já existe.");

                verify = true;

                break;
            }
        }
        return verify;
    }

    // Método para verificar se o idSupplier existe
    public boolean checkSupplier(int idSupplier, List<Supplier> listSuppliers){
        boolean verify = false;

        for (Supplier suppliers: listSuppliers){
            if (suppliers.getIdSupplier() == idSupplier){
                verify = true;
                break;
            }
        }

        if (!verify){
            System.out.println("Este fornecedor não existe.");
        }

        return verify;

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
                "idSupplier= " + idSupplier +
                ", Razão Social= " + name +
                ", CPF/CNPJ= " + getCgc() +
                ", cgc='" + cgc +
                ", Endereço= " + getAddress() +
                ", Estado= " + getState() +
                ", CEP= " + getPostalCode() +
                ", Telefone= " + getCellPhone() +
                ", Email= " + getEmail() +
                ", registrationDate= " + registrationDate +
                '}';
    }
}
