package factory2;

public class NotificacaoPush implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação push: " + mensagem);
    }
}
