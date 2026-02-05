import java.util.*;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();
    private int contadorId = 1;

    public void salvar(Produto p) {
        if (p.getId() == 0) p.setId(contadorId++);
        produtos.add(p);
    }

    public List<Produto> listarTodos() { return produtos; }

    public Produto buscarPorId(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void remover(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }
}
