package Strategy2;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(100);


        pedido.setPagamentoStrategy(new PagamentoPaypal("aqui"));
        pedido.pagar();
        pedido.setPagamentoStrategy(new PagamentoCartaoDeCredito("ata", "ara"));
        pedido.pagar();
    }
}
