package composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements FileSystemItem {
    private String nome;
    private List<FileSystemItem> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(FileSystemItem item){
        itens.add(item);
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + nome);
        for (FileSystemItem item : itens) {
            item.print(structure + "  ");
        }
    }
}
