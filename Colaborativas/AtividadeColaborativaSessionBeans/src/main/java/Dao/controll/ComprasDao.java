package Dao.controll;

import Dao.interfac.Compras;
import dominio.Item;
import dominio.Produto;
import jdk.internal.org.objectweb.asm.tree.InsnList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@Stateful
public class ComprasDao implements Compras {
    private List<Item> listaItens;
    public void addProduto(Produto produto) {
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
                getItens().add((InsnList) listaItens);
            }
        }   catch(RuntimeException e) {
            e.getStackTrace();
        }
    }

    @Contract(pure = true)
    private @Nullable InsnList getItens() {
        return null;
    }

    @Override
    public Produto buscarCliente(String email) {
        return null;
    }

    @Override
    public void dellProduto(String descricao) {

    }

    @Override
    public List<Produto> listarUsuario() {
        return null;
    }

    @Override
    public void editProduto(Produto produto) {

    }
}
