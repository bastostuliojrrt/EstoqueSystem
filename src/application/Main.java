package application;

import entities.Product;
import entities.Stock;

import java.util.*;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Instancia da lista de produtos
        List<Product> listProducts = new ArrayList<>();

        Product product = new Product();

        //Mock de dados para teste
        Date date = new Date();
        Product teste1 = new Product();
        Product teste2 = new Product();
        Product teste3 = new Product();
        Product teste4 = new Product();

        teste1.registerProduct(123, "garrafa", "garrafa", 123987, 10, date);
        teste2.registerProduct(123, "guaraná", "garrafa", 123987, 10, date);
        teste3.registerProduct(123, "bola", "garrafa", 123987, 10, date);
        teste4.registerProduct(123, "garrafa", "garrafa", 123987, 10, date);

        listProducts.add(teste1);
        listProducts.add(teste2);
        listProducts.add(teste3);
        listProducts.add(teste4);

        Stock stock = new Stock("Stock001", listProducts, "Matriz" );

        System.out.println("-------------- Menu --------------");
        System.out.println("1 - Produtos \n2 - Fornecedores \n3 - Estoque \n0 - Sair\n");
        System.out.print("Escolha uma opção: ");
        int decision = sc.nextInt();

        switch (decision){
            case 1:
                do {
                    System.out.println("\n-------------- Menu de Produtos --------------");
                    System.out.println("1 - Cadastrar Produto \n2 - Procurar Produto \n3 - Lista de Produtos \n4 - Deletar Produto\n");
                    System.out.print("Escolha uma opção: ");
                    decision = sc.nextInt();

                    switch (decision) {
                        case 1:// Cadastrar produtos

                            System.out.println("\n-------------- Cadastro de Produtos --------------\n");
                            System.out.println("Digite o ID do produto: ");
                            int idProduct = sc.nextInt();
                            System.out.println("Digite o nome do produto: ");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.println("Informe a descrição do produto: ");
                            String description = sc.nextLine();
                            System.out.println("Informe o ID do Fornecedor do produto: ");
                            int idSupplier = sc.nextInt();
                            System.out.println("Informe a quantidade do produto: ");
                            int quantity = sc.nextInt();

                            product.registerProduct(idProduct, name, description, idSupplier, quantity, date);

                            listProducts.add(product);
                            System.out.println();

                            System.out.println("Lista de produtos:");
                            for (Product produtcs : listProducts) {
                                System.out.println(produtcs);
                            }
                            break;

                        case 2:// Procurar produtos

                            System.out.println("\n-------------- Procurar Produtos --------------\n");
                            System.out.println("Digite o nome do produto: ");
                            sc.nextLine();
                            String productName = sc.nextLine();

                            List<Product> result = product.filterProduct(productName, listProducts);

                            System.out.println("\nLista de produtos:");
                            for (Product produtcs : result) {
                                System.out.println(produtcs);
                            }
                            break;

                        case 3:// Listar produtos cadastrados
                            System.out.println("\n-------------- Lista de Produtos --------------\n");
                            product.listAllProducts(listProducts);
                            break;

                        case 4: // Deletar produtos


                         break;

                    }
                }while (decision != 5);
        }

    }
}