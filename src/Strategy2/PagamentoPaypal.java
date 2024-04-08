package Strategy2;

public class PagamentoPaypal implements PagamentoStrategy{
    private String email;

    public PagamentoPaypal(String email) {
        this.email = email;
    }

    @Override
    public void pagar(int valor) {
        System.out.println(valor + " pago via PayPal.");
    }
}
