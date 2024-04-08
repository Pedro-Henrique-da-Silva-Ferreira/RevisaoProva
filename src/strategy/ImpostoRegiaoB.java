package strategy;

public class ImpostoRegiaoB implements ImpostoStrategy{
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.7;
    }
}
