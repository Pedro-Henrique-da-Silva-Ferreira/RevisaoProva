package factory;

public class DocumentoGrafico implements Documento{
    @Override
    public void abrir() {
        System.out.println("Documento gráfico aberto.");
    }

    @Override
    public void salvar() {
        System.out.println("Documento gráfico salvo.");
    }

    @Override
    public void fechar() {
        System.out.println("Documento gráfico fechado.");
    }
}
