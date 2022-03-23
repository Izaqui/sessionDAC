package Dao.interfac;

import carrinho.Carrinho;
import dominio.Produto;

import java.util.List;

public interface Compras {
    void addProduto(Produto produto);
    Produto buscarCliente(String email);
    void dellProduto(String descricao);
    List<Produto> listarUsuario();
    void editProduto(Produto produto);
}
