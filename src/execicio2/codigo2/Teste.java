package execicio2.codigo2;

interface EstrategiaEnvioMensagem {
    void enviar(String mensagem, String destinatario);
}

class EnvioEmail implements EstrategiaEnvioMensagem {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando E-MAIL para " + destinatario + ": " + mensagem);
    }
}

class EnvioSMS implements EstrategiaEnvioMensagem {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}

class EnvioWhatsapp implements EstrategiaEnvioMensagem {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando WHATSAPP para " + destinatario + ": " + mensagem);
    }
}

class Mensageiro {
    private EstrategiaEnvioMensagem estrategia;

    public void setEstrategia(EstrategiaEnvioMensagem estrategia) {
        this.estrategia = estrategia;
    }

    public void enviarMensagem(String mensagem, String destinatario) {
        if (estrategia != null) {
            estrategia.enviar(mensagem, destinatario);
        } else {
            System.out.println("Nenhuma estratégia de envio definida.");
        }
    }
}

public class Teste {
    public static void main(String[] args) {
        Mensageiro mensageiro = new Mensageiro();

        mensageiro.setEstrategia(new EnvioEmail());
        mensageiro.enviarMensagem("Olá! Tudo bem?", "joao@email.com");

        mensageiro.setEstrategia(new EnvioSMS());
        mensageiro.enviarMensagem("Código de verificação: 1234", "+551199999999");

        mensageiro.setEstrategia(new EnvioWhatsapp());
        mensageiro.enviarMensagem("Reunião às 15h!", "+551198888888");
    }
}
