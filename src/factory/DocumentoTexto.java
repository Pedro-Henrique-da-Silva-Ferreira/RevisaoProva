package factory;

public class DocumentoTexto implements Documento {

    @Override
    public void abrir() {
        System.out.println("Documento de texto aberto.");
    }

    @Override
    public void salvar() {
        System.out.println("Documento de texto salvo.");
    }

    @Override
    public void fechar() {
        System.out.println("Documento de texto fechado.");
    }
}
