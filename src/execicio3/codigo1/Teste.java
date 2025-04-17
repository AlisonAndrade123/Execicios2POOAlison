package execicio3.codigo1;

import java.util.List;
import java.util.ArrayList;

interface Observador {
    void receberMensagem(String mensagem);
    String getNome();
}

class GrupoMensagem {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void enviarMensagem(String mensagem, Observador remetente) {
        for (Observador o : observadores) {
            if (!o.equals(remetente)) {
                o.receberMensagem(remetente.getNome() + ": " + mensagem);
            }
        }
    }
}

class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }

    @Override
    public String getNome() {
        return nome;
    }
}

public class Teste {
    public static void main(String[] args) {
        GrupoMensagem grupo = new GrupoMensagem();

        Cliente alice = new Cliente("Alice");
        Cliente bob = new Cliente("Bob");
        Cliente carol = new Cliente("Carol");

        grupo.adicionarObservador(alice);
        grupo.adicionarObservador(bob);
        grupo.adicionarObservador(carol);

        grupo.enviarMensagem("Oi, pessoal!", alice);
        grupo.enviarMensagem("Olá, Alice!", bob);
    }
}
