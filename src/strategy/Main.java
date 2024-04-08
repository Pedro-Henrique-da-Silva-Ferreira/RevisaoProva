package strategy;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1000);

        pedido.setImpostoStrategy(new ImpostoRegiaoA());
        System.out.println(pedido.calculadorImposto());
        pedido.setImpostoStrategy(new ImpostoRegiaoB());
        System.out.println(pedido.calculadorImposto());
        pedido.setImpostoStrategy(new ImpostoRegiaoC());
        System.out.println(pedido.calculadorImposto());


    }
}
