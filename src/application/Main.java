package application;

import entities.Product;
import entities.Supplier;
import screen.*;

import java.awt.*;
import java.util.*;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Instancia da lista de produtos
        Product product = new Product();
        List<Product> listProducts = new ArrayList<>();
        // Instacia da lista de fornecedores
        Supplier supplier = new Supplier();
        List<Supplier> listSuppliers = new ArrayList<>();
        // Instancia da classe com Menus
        Menus menu = new Menus();
        //Instancia da data
        Date date = new Date();

        // Variaveis globais
        int decision;

        //Mock de dados do produto para teste
        Product teste1 = new Product();
        Product teste2 = new Product();
        Product teste3 = new Product();
        Product teste4 = new Product();

        teste1.registerProduct(123, "garrafa", "garrafa", 123987, 10, date);
        teste2.registerProduct(456, "guaraná", "garrafa", 123987, 10, date);
        teste3.registerProduct(789, "bola", "garrafa", 123987, 10, date);
        teste4.registerProduct(192, "garrafa", "garrafa", 123987, 10, date);

        listProducts.add(teste1);
        listProducts.add(teste2);
        listProducts.add(teste3);
        listProducts.add(teste4);

        //Mock de dados do fornecedor para teste
        Supplier teste5 = new Supplier();
        Supplier teste6 = new Supplier();
        Supplier teste7 = new Supplier();
        Supplier teste8 = new Supplier();

        teste5.registerSupplier("Rua", "Recife", "PE", "50761010", "81996312364", "teste@gmail.com", 1234, "Fornec", "29374692000134", date);
        teste6.registerSupplier("Rua", "Recife", "PE", "50761010", "81996312364", "teste@gmail.com", 5678, "Fornec1", "29374692000134", date);
        teste7.registerSupplier("Rua", "Recife", "PE", "50761010", "81996312364", "teste@gmail.com", 9101, "Fornec2", "29374692000134", date);
        teste8.registerSupplier("Rua", "Recife", "PE", "50761010", "81996312364", "teste@gmail.com", 1213, "Fornec", "29374692000134", date);


        listSuppliers.add(teste5);
        listSuppliers.add(teste6);
        listSuppliers.add(teste7);
        listSuppliers.add(teste8);

        // Início do programa
        do {
            menu.generalMenu();
            decision = sc.nextInt();

            // Entra no menu de produtos
            if (decision == 1) {
                do {
                    menu.menuProdutcts();
                    decision = sc.nextInt();

                    switch (decision) {

                        case 1:// Cadastrar produtos

                            System.out.println("\n-------------- Cadastro de Produtos --------------\n");
                            int idProduct;
                            do {
                                System.out.print("Digite o ID do produto: ");
                                idProduct = sc.nextInt();
                            }while (product.checkDuplicity(idProduct, listProducts));
                            System.out.print("Digite o nome do produto: ");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.print("Informe a descrição do produto: ");
                            String description = sc.nextLine();
                            int idSupplier;
                            do {
                                System.out.print("Informe o ID do Fornecedor do produto: ");
                                idSupplier = sc.nextInt();
                            }while (!product.checkSupplier(idSupplier, listSuppliers));
                            System.out.print("Informe a quantidade do produto: ");
                            int quantity = sc.nextInt();

                            product.registerProduct(idProduct, name, description, idSupplier, quantity, date);
                            listProducts.add(product);

                            System.out.println("\nLista de produtos:");
                            product.listAllProducts(listProducts);
                            break;

                        case 2:// Procurar produtos

                            System.out.println("\n-------------- Procurar Produtos --------------\n");
                            System.out.print("Digite o nome do produto: ");
                            sc.nextLine();
                            String productName = sc.nextLine();

                            List<Product> result = product.searchProduct(productName, listProducts);

                            System.out.println("\nLista de produtos:");
                            if (result.size() == 0){
                                System.out.println("Produto não encontrado");
                            }else {
                                product.listAllProducts(result);
                            }
                            break;

                        case 3:// Listar produtos cadastrados
                            product.listAllProducts(listProducts);
                            break;

                        case 4: // Deletar produtos
                            System.out.println("\n-------------- Deletar Produto --------------\n");
                            product.listAllProducts(listProducts);
                            do {
                                System.out.print("\nDigite o ID do produto que deseja deletar: ");
                                idProduct = sc.nextInt();
                            }while (!product.checkProduct(idProduct, listProducts));
                            product.deleteProduct(listProducts, idProduct);
                            System.out.println("\nNova lista de produtos:\n");
                            product.listAllProducts(listProducts);

                            break;

                    }
                } while (decision != 5);

            // Entra no menu de Fornecedores
            } else if (decision == 2) {
                do {
                    menu.menuSupplier();
                    decision = sc.nextInt();

                    switch (decision){

                        case 1: // Cadastrar Fornecedores
                            System.out.println("\n-------------- Cadastro de Fornecedores --------------\n");
                            int idSupplier;
                            do {
                                System.out.print("Informe o ID do fornecedor: ");
                                idSupplier = sc.nextInt();
                            }while (supplier.checkDuplicity(idSupplier, listSuppliers));
                            System.out.print("Informe a Razão Social: ");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.print("Informe o CPF/CNPJ: ");
                            String cgc = sc.nextLine();
                            System.out.print("Informe o endereço: ");
                            String address = sc.nextLine();
                            System.out.print("Informe a Cidade: ");
                            String city = sc.nextLine();
                            System.out.print("Informe o estado: ");
                            String state = sc.nextLine();
                            System.out.print("Informe o CEP: ");
                            String postalCode = sc.nextLine();
                            System.out.print("Informe o telefone/celular: ");
                            String cellPhone = sc.nextLine();
                            System.out.print("Informe o email: ");
                            String email = sc.nextLine();

                            supplier.registerSupplier(address, city, state, postalCode, cellPhone, email, idSupplier, name, cgc, date);

                            listSuppliers.add(supplier);

                            supplier.listAllSuppliers(listSuppliers);

                            break;

                        case 2: // Busca por fornecedores
                            System.out.println("\n-------------- Lista de Fornecedores --------------\n");
                            System.out.print("Digite a Razão Social do fornecedor: ");
                            sc.nextLine();
                            String nameSupplier = sc.nextLine();

                            List<Supplier> result = supplier.searchSupplier(nameSupplier, listSuppliers);

                            System.out.println("\nLista de Fornecedores:");
                            if (result.size() == 0){
                                System.out.println("Fornecedor não encontrado");
                            }else {
                                supplier.listAllSuppliers(result);
                            }
                            break;

                        case 3: // Listagem de Fornecedores
                            supplier.listAllSuppliers(listSuppliers);
                            break;

                        case 4: // Deleção de fornecedores
                            System.out.println("\n-------------- Deletar Fornecedor --------------\n");
                            supplier.listAllSuppliers(listSuppliers);
                            do {
                                System.out.print("\nDigite o ID do fornecedor que deseja deletar: ");
                                idSupplier = sc.nextInt();
                            }while (!supplier.checkSupplier(idSupplier, listSuppliers));

                            supplier.deleteSupplier(idSupplier, listSuppliers);

                            System.out.println("\nNova lista de Fornecedores:\n");
                            supplier.listAllSuppliers(listSuppliers);
                            break;

                    }

                }while (decision != 5);
            }
        }while (decision != 0);

    }
}