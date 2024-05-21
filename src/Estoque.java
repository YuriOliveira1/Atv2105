import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> listaProduto;

    public Estoque() {
        listaProduto = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProduto.add(produto);
    }

    public void procurarProduto(String nome) {
        for (Produto produto : listaProduto){
            if (produto.getNome().equals(nome)) {
                System.out.println("Existe esse Produto no nosso Estoque");
            }
        }
    }

    public void listaProdutos() {
        for (Produto produto : listaProduto) {
            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Descrição Produto: " + produto.getDescricao());
        }
    }

}
