package Strategy2;

public class PagamentoCartaoDeCredito implements PagamentoStrategy{
    private String nomeCartao;
    private String nomeTitular;

    public PagamentoCartaoDeCredito(String nomeCartao, String nomeTitular) {
        this.nomeCartao = nomeCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void pagar(int valor) {
        System.out.println(valor + " pago com cartão de crédito.");
    }
}
