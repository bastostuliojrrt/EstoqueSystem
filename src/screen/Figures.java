package screen;

public class Figures {

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
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                           "         PRODUTOS\n" +
                           "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
        System.out.println("1 - Cadastrar Produto \n2 - Procurar Produto \n3 - Lista de Produtos \n4 - Deletar Produto\n5 - Voltar\n");
        System.out.print("Escolha uma opção: ");
    }

    public void menuSupplier(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                           "        FORNECEDOR\n" +
                           "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
        System.out.println("1 - Cadastrar Fornecedor \n2 - Procurar Fornecedor \n3 - Lista de Fornecedores \n4 - Deletar Fornecedores\n5 - Voltar\n");
        System.out.print("Escolha uma opção: ");
    }

    public void menuStock(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                              "        ESTOQUE\n" +
                             "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
        System.out.println("1 - Atualizar Produto \n2 - Adicionar Quantidade \n3 - Remover Quantidade \n4 - Listar Produtos Disponíveis\n5 - Voltar\n");
        System.out.print("Escolha uma opção: ");
    }

    public void menuRegisterProduct(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                           "   CADASTRO DE PRODUTOS\n" +
                           "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
    }

    public void menusSeachrProduct(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                             "    BUSCA POR PRODUTOS\n" +
                             "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
    }

    public void menuListProduct(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                            "   LISTAGEM DE PRODUTOS\n" +
                             "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
    }

    public void menuDeleteProduct(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                             "   EXCLUSÃO DE PRODUTOS\n" +
                             "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
    }

    public void menuRegisterSupplier(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━─╗\n" +
                             "  CADASTRO DE FORNECEDOR\n" +
                             "╚─━━━━━━━━━░★░━━━━━━━━━─╝\n");
    }

    public void menusSeachrSupplier(){
        System.out.println("\n╔─━━━━━━━━━━░★░━━━━━━━━━━─╗\n" +
                            "    BUSCA POR FORNECEDOR\n" +
                             "╚─━━━━━━━━━━░★░━━━━━━━━━━─╝\n");
    }

    public void menuListSupplier(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━━━━─╗\n" +
                "   LISTAGEM DE FORNECEDOR\n" +
                "╚─━━━━━━━━━░★░━━━━━━━━━━━━─╝\n");
    }

    public void menuDeleteSupplier(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━━━─╗\n" +
                "   EXCLUSÃO DE FORNECEDOR\n" +
                "╚─━━━━━━━━━░★░━━━━━━━━━━━─╝\n");
    }

    public void menuUpdateStock(){
        System.out.println("\n╔─━━━━━━━━━░★░━━━━━━━━━━━─╗\n" +
                             "   Atualização do Estoque\n" +
                             "╚─━━━━━━━━━░★░━━━━━━━━━━━─╝\n");
    }

    public void load(){
        System.out.println("Loading…\n" +
                "█▒▒▒▒▒▒▒▒▒\n" +
                "10%\n" +
                "█████▒▒▒▒▒\n" +
                "50%\n" +
                "██████████\n" +
                "100%\n");
    }

}
