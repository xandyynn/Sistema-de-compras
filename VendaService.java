import java.util.*;

public class VendaService {
    private List<Compra> historicoVendas = new ArrayList<>();
    private int proximoCupom = 1001;

    public String realizarVenda(String cliente, List<ItemVenda> itens) {
        double total = itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
        return "Venda #" + (proximoCupom++) + " finalizada para " + cliente;
    }
}
