package dominio;

import javax.servlet.ServletInputStream;

public class Produto {
    private int id;
    private String descricao;
    private ServletInputStream valor;

    public Produto(int id, String descricao, ServletInputStream valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ServletInputStream getValor() {
        return valor;
    }

    public void setValor(ServletInputStream valor) {
        this.valor = valor;
    }
}
