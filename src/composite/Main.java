package composite;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("Arquivo1.txt");
        Arquivo arquivo2 = new Arquivo("Arquivo2.dcox");
        Pasta pasta1 = new Pasta("Pasta1");
        pasta1.adicionarItem(arquivo1);
        pasta1.adicionarItem(arquivo2);

        Arquivo arquivo3 = new Arquivo("Arquivo3.png");
        Pasta pasta2 = new Pasta("Pasta2");
        pasta2.adicionarItem(arquivo3);

        Pasta pastaRaiz = new Pasta("Raiz");
        pastaRaiz.adicionarItem(pasta1);
        pastaRaiz.adicionarItem(pasta2);

        pastaRaiz.print("");
    }
}
