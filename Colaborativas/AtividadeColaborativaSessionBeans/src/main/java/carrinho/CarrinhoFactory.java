package carrinho;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoFactory {
    Map<String, Carrinho> carrinhos = new HashMap<String, Carrinho>();

    public Carrinho criar(String identificacaoCliente) {
        Carrinho carrinho = new Carrinho();

        if(carrinhos.containsKey(identificacaoCliente)) {
            carrinho = null;
        } else {
            carrinhos.put(identificacaoCliente, carrinho);
        }

        return carrinho;
    }

    public BigDecimal getValorTicketMedio() {
        List<Carrinho> carrinhoComprasL = new ArrayList<>(carrinhos.values());

        carrinhoComprasL.stream()
                .forEach(s -> s.getValorTotal().plus().divide(new BigDecimal(carrinhos.size())));
        BigDecimal valorTicketMedio = (BigDecimal) carrinhoComprasL;
        return valorTicketMedio.setScale(2, RoundingMode.HALF_EVEN);
    }

    public boolean invalidar(String identificacaoCliente) {
        try {
            carrinhos.remove(identificacaoCliente);
            return true;
        }
        catch(RuntimeException e) {
            return false;
        }
    }
}
