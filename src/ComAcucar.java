public class ComAcucar extends AdicaoDecorator {
    Bebida bebida;

    public ComAcucar(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Com Açúcar";
    }

    @Override
    public double custo() {
        return .15 + bebida.custo();
    }
}
