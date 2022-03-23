package dominio;

import java.math.BigDecimal;

public class Produto {
    private Long id;
    private String descricao;
    private BigDecimal valor;

    public Produto(int id, String descricao, BigDecimal valor) {
        this.id = Long.valueOf(id);
        this.descricao = descricao;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getId() {
        return Math.toIntExact(id);
    }


    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
