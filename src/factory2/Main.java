package factory2;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacao fabricaNotificacao = new FabricaNotificacao();

        Notificacao notificacao1 = fabricaNotificacao.criarNotificacao("EMAIL");
        notificacao1.enviar("Bem-vindo ao sistema!");

        Notificacao notificacao2 = fabricaNotificacao.criarNotificacao("PUSH");
        notificacao2.enviar("Você tem uma nova mensagem.");

        Notificacao notificacao3 = fabricaNotificacao.criarNotificacao("SMS");
        notificacao3.enviar("Seu código de verificação é 123456.");
    }
}
