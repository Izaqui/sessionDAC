package carrinho;

import dominio.Item;
import dominio.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Carrinho {
    private List<Item> listaItens;

    public void adicionarItem(Produto produto, BigDecimal valorUnitario, int quantidade) {
        int posicaoEncontrada = -1;

        for(int pos = 0; pos < getItens().size() & posicaoEncontrada < 0; pos++) {
            Item itemTemporario = listaItens.get(pos);

            if(itemTemporario.getProduto().equals(produto)){
                posicaoEncontrada = pos;
            }
        }

        try {
            if(posicaoEncontrada < 0) {
                Item item = new Item(produto);
                item.setProduto(produto);
                getItens().add(item);
            } else {
                Item itemTemporario = listaItens.get(posicaoEncontrada);
                quantidade = itemTemporario.getQuantidade() + quantidade;
                valorUnitario = itemTemporario.getValorUnitario() == valorUnitario ? valorUnitario = itemTemporario.getValorUnitario() : valorUnitario;
                Item item = new Item(produto);
                produto.setValor(produto.getValor());

                listaItens.set(posicaoEncontrada, item);
            }
        }   catch(RuntimeException e) {
            e.getStackTrace();
        }
    }


    public boolean removerItem(Produto produto) {
        int posicaoEncontrada = -1;

        for(int pos = 0; pos < getItens().size() & posicaoEncontrada < 0; pos++) {
            Item itemTemp = listaItens.get(pos);

            if(itemTemp.getProduto().equals(produto)) {
                posicaoEncontrada = pos;
            }
        }

        if(posicaoEncontrada > -1) {
            getItens().remove(posicaoEncontrada);
            return true;
        } else {
            return false;
        }
    }

    public boolean removerItem(int posicaoItem) {
        try {
            listaItens.remove(posicaoItem);
            return true;
        }
        catch(RuntimeException e) {
            return false;
        }
    }


    public BigDecimal getValorTotal() {
        getItens().stream()
                //.filter(s -> s.getValorUnitario())
                //.filter(s -> s.getValor().plus(s.getValor())
                //.forEach(s -> s.getValor().plus());
                .forEach(s -> s.getValorTotal().plus());
        return (BigDecimal) getItens();
    }


    public Collection<Item> getItens() {
        if(listaItens == null) {
            listaItens = new ArrayList<>();
        }
        return listaItens;
    }
}
