package execicio3.codigo2;

import java.util.List;
import java.util.ArrayList;

interface Observador {
    void atualizar(float temperatura, float umidade);
}

class EstacaoMeteorologica {
    private List<Observador> observadores = new ArrayList<>();

    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void atualizarDados(float temperatura, float umidade) {
        for (Observador o : observadores) {
            o.atualizar(temperatura, umidade);
        }
    }
}

class PainelTemperatura implements Observador {
    @Override
    public void atualizar(float temperatura, float umidade) {
        System.out.println("PainelTemperatura: Temperatura atual = " + temperatura + "°C");
    }
}

class PainelUmidade implements Observador {
    @Override
    public void atualizar(float temperatura, float umidade) {
        System.out.println("PainelUmidade: Umidade atual = " + umidade + "%");
    }
}

public class Teste {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        PainelTemperatura painelTemp = new PainelTemperatura();
        PainelUmidade painelUmidade = new PainelUmidade();

        estacao.registrarObservador(painelTemp);
        estacao.registrarObservador(painelUmidade);

        estacao.atualizarDados(25.5f, 60.0f);
        estacao.atualizarDados(28.0f, 55.0f);
    }
}

