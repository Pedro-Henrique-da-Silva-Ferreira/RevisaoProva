package factory;

public class CriadorDocumentoGrafico extends CriadorDocumento{
    @Override
    public Documento criarDocumento() {
        return new DocumentoGrafico();
    }
}
