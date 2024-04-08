package factory;

public class Main {
    public static void main(String[] args) {

        CriadorDocumento criadorTexto = new CriadorDocumentoTexto();
        Documento docTexto = criadorTexto.criarDocumento();
        docTexto.salvar();
        docTexto.abrir();
        docTexto.fechar();

        CriadorDocumento criadorGrafico = new CriadorDocumentoGrafico();
        Documento docGrafico = criadorGrafico.criarDocumento();
        docGrafico.abrir();
        docGrafico.salvar();
        docGrafico.fechar();
    }
}
