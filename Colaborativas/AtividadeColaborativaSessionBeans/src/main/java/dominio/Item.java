package dominio;

import java.math.BigDecimal;

public class Item {

    private Produto produto;
    private int quantidade;

    public Item(Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }

    public BigDecimal getValorUnitario() {

        return null;
    }

    public BigDecimal getValorTotal() {
        return null;
    }
}
