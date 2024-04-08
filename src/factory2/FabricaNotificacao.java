package factory2;

public class FabricaNotificacao {

    public Notificacao criarNotificacao(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        switch (tipo){
            case "EMAIL":
                return new NotificacaoEmail();

            case "PUSH":
                return new NotificacaoPush();

            case "SMS":
                return new NotificacaoSms();

            default:
                throw new IllegalArgumentException("Tipo de notificação desconhecido.");
        }
    }
}
