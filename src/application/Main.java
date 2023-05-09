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
        Date date = new Date();

        // Variaveis globais
        int decision = 0;

        //Mock de dados para teste
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

        do {
            System.out.println("-------------- Menu --------------");
            System.out.println("1 - Produtos \n2 - Fornecedores \n3 - Estoque \n0 - Sair\n");
            System.out.print("Escolha uma opção: ");
            decision = sc.nextInt();

            if (decision == 1) {
                do {
                    System.out.println("\n-------------- Menu de Produtos --------------");
                    System.out.println("1 - Cadastrar Produto \n2 - Procurar Produto \n3 - Lista de Produtos \n4 - Deletar Produto\n5 - Sair\n");
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
                            product.listAllProducts(listProducts);
                            break;

                        case 2:// Procurar produtos

                            System.out.println("\n-------------- Procurar Produtos --------------\n");
                            System.out.println("Digite o nome do produto: ");
                            sc.nextLine();
                            String productName = sc.nextLine();

                            List<Product> result = product.filterProduct(productName, listProducts);

                            System.out.println("\nLista de produtos:");
                            product.listAllProducts(result);
                            break;

                        case 3:// Listar produtos cadastrados
                            System.out.println("\n-------------- Lista de Produtos --------------\n");
                            product.listAllProducts(listProducts);
                            break;

                        case 4: // Deletar produtos
                            System.out.println("\n-------------- Deletar Produto --------------\n");
                            System.out.println("Sua lista de produtos:\n");
                            product.listAllProducts(listProducts);
                            System.out.print("\nDigite o ID do produto que deseja deletar: ");
                            idProduct = sc.nextInt();
                            product.deleteProduct(listProducts, idProduct);
                            System.out.println("\nNova lista de produtos:\n");
                            product.listAllProducts(listProducts);

                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }

                } while (decision != 5);
            }else {
                System.out.println("Opção inválida.");
            }
        }while (decision != 0);

    }
}