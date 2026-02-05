public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("   • %-15s x%d unidades - R$ %.2f", 
                produto.getNome(), quantidade, getSubtotal());
    }
}
