package Strategy2;

public class Pedido {
    private PagamentoStrategy pagamentoStrategy;
    private int total;

    public Pedido(int total) {
        this.total = total;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void pagar(){
        pagamentoStrategy.pagar(total);
    }
}
