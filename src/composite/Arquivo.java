package composite;

public class Arquivo implements FileSystemItem{
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + nome);
    }
}
