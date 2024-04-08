public class Cafeteria {
    public static void main(String[] args) {
        Bebida bebida = new Cafe();
        System.out.println(bebida.getDescricao() + " $" + bebida.custo());

        Bebida bebida2 = new Cafe();
        bebida2 = new ComLeite(bebida2);
        bebida2 = new ComAcucar(bebida2);
        System.out.println(bebida2.getDescricao() + " $" + bebida2.custo());

        Bebida bebida3 = new Cha();
        bebida3 = new ComLeite(bebida3);
        System.out.println(bebida3.getDescricao() + " $" + bebida3.custo());
    }
}
