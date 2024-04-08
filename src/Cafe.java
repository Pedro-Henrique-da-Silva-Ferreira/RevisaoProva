public class Cafe extends Bebida{

    public Cafe(){
        descricao = "cafe";
    }

    @Override
    public double custo() {
        return 1.99;
    }
}
