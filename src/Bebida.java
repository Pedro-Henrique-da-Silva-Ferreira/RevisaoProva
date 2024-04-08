public abstract class Bebida {
    String descricao = "bebida desconhecida";
    public String getDescricao(){
        return descricao;
    }
    public abstract double custo();
}
