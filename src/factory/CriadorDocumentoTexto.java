package factory;

public class CriadorDocumentoTexto extends CriadorDocumento{
    @Override
    public Documento criarDocumento() {
        return new DocumentoTexto();
    }
}
