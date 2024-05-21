import java.util.Scanner;
public class App {
    public static int menuLoja(Scanner scanner){
        boolean valido = false;
        int opcao = 4;

        while(!valido){
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Procurar Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Sair");

            try {
                opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 4) {
                    valido = true;
                } else {
                    throw new IllegalArgumentException("Entrada Invalida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada Invalida, digite uma opção correta");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine(); 
            }
        }
        return opcao;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao = 1;

        while (opcao != 4) {
            opcao = menuLoja(scan);

            if (opcao == 1) {
                scan.nextLine(); 
                System.out.print("Nome do Produto: ");
                String nome = scan.nextLine();
                System.out.print("Descrição produto: ");
                String descricao = scan.nextLine();
                
                Produto produto = new Produto(nome, descricao);
                estoque.adicionarProduto(produto);
            } else if (opcao == 2) {
                scan.nextLine(); 
                System.out.print("Produto que deseja Procurar: ");
                String nomeProcura = scan.nextLine();
    
                estoque.procurarProduto(nomeProcura);
            } else if (opcao == 3) {
                estoque.listaProdutos();

            } else if (opcao == 4) {
                System.out.println("Saindo...");
            }
        }
    }
}
