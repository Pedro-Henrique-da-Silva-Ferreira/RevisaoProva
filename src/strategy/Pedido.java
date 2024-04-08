package strategy;

public class Pedido {
    private double valor;
    private ImpostoStrategy impostoStrategy;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void setImpostoStrategy(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }
    public double calculadorImposto(){
        if(impostoStrategy == null){
            throw new RuntimeException("Estrategia de imposto nao definada.");
        }
        return impostoStrategy.calcularImposto(valor);
    }
}
