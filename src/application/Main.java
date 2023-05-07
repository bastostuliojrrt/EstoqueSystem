package application;

import entities.Product;
import entities.Stock;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> listProducts = new ArrayList<>();
        Stock stock = new Stock("Stock001", listProducts, "Matriz" );

        System.out.println("-------------- Menu --------------");
        System.out.println("1 - Produtos \n2 - Fornecedores \n3 - Estoque \n0 - Sair\n");
        System.out.print("Escolha uma opção: ");
        int decision = sc.nextInt();

        switch (decision){
            case 1:
                System.out.println("-------------- Menu de Produtos --------------");
                System.out.println("1 - Cadastrar Produto \n2 - Produrar Produto \n3 - Lista de Produtos \n4 - Deletar Produto\n");
                System.out.print("Escolha uma opção: ");
                decision = sc.nextInt();

                if(decision == 1){

                    do {
                        System.out.println("-------------- Cadastro de Produtos --------------\n");
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
                        Date registrationDate = new Date();

                        Product product = new Product();
                        product.registerProduct(idProduct,name,description,idSupplier,quantity,registrationDate);

                        listProducts.add(product);
                        System.out.println();

                        System.out.println("Lista de produtos:");
                        for (Product produtcs: listProducts) {
                            System.out.println(produtcs);
                        }

                        System.out.println("1 - Cadastrar Produto \n2 - Produrar Produto \n3 - Lista de Produtos \n4 - Deletar Produto\n");
                        decision = sc.nextInt();

                    }while (decision == 1);

                } else if (decision == 2) {
                    System.out.println("-------------- Procurar Produtos --------------\n");
                    System.out.println("Digite o nome do produto: ");
                    String name = sc.nextLine();

                    List<Product> result = listProducts.stream().filter(product-> product.getName() == name).toList();

                    System.out.println("Lista de produtos:");
                    for (Product produtcs: result) {
                        System.out.println(produtcs);
                    }
                    
                }

        }

    }
}