package screen;

public class Menus {

    public void generalMenu(){
        System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
                           "█          ╦ ╦╔╗╦ ╔╗╔╗╔╦╗╔╗          █\n" +
                           "█          ║║║╠ ║ ║ ║║║║║╠           █\n" +
                           "█          ╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝          █\n" +
                           "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█");
        System.out.println("---------------- Menu ----------------\n");
        System.out.println("1 - Produtos \n2 - Fornecedores \n3 - Estoque \n0 - Sair\n");
        System.out.print("Escolha uma opção: ");
    }

    public void menuProdutcts(){
        System.out.println("\n-------------- Menu de Produtos --------------\n");
        System.out.println("1 - Cadastrar Produto \n2 - Procurar Produto \n3 - Lista de Produtos \n4 - Deletar Produto\n5 - Voltar\n");
        System.out.print("Escolha uma opção: ");
    }

    public void menuSupplier(){
        System.out.println("\n-------------- Menu de Produtos --------------\n");
        System.out.println("1 - Cadastrar Fornecedor \n2 - Procurar Fornecedor \n3 - Lista de Fornecedores \n4 - Deletar Fornecedores\n5 - Voltar\n");
        System.out.print("Escolha uma opção: ");
    }

}
