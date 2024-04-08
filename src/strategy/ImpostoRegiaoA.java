package strategy;

public class ImpostoRegiaoA implements ImpostoStrategy{
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.5;
    }
}
