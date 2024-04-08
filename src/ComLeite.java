public class ComLeite extends AdicaoDecorator {
    Bebida bebida;

    public ComLeite(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Com Leite";
    }

    @Override
    public double custo() {
        return .20 + bebida.custo();
    }
}


