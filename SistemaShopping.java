import java.util.Scanner;

public class SistemaShopping {
    private static Scanner leitor = new Scanner(System.in);
    private static ProdutoRepository estoque = new ProdutoRepository();

    public static void main(String[] args) {
        popularDadosIniciais();
        boasVindas();
        
        boolean rodando = true;
        while (rodando) {
            menuPrincipal();
            int escolha = leitor.nextInt();
            
            switch (escolha) {
                case 1 -> menuEstoque();
                case 2 -> menuCaixa();
                case 3 -> rodando = false;
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
        System.out.println("Sistema encerrado. Até logo!");
    }

    private static void boasVindas() {
        System.out.println("* bem-vindo ao Gestor de Shopping 2026   *");
      
    }

    private static void menuPrincipal() {
        System.out.println("\nO que deseja fazer?");
        System.out.println("1) Administrar Estoque");
        System.out.println("2) Ir para o Caixa (Vendas)");
        System.out.println("3) Sair");
        System.out.print("> ");
    }
    private static void popularDadosIniciais() {
        estoque.salvar(new Produto(0, "Tênis Nike", 299.90, "Calçados", 10));
        estoque.salvar(new Produto(0, "iPhone 15", 5400.00, "Eletrônicos", 5));
    }
}
