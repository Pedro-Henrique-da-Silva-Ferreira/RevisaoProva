package strategy;

public class ImpostoRegiaoC implements ImpostoStrategy{
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.8;
    }
}
