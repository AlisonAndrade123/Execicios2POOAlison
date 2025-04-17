interface EstrategiaDeAtaque {
    void atacar(String atacante, String alvo, int dano);
}

class AtaqueFisico implements EstrategiaDeAtaque {
    @Override
    public void atacar(String atacante, String alvo, int dano) {
        System.out.println(atacante + " atacou " + alvo + " com ataque físico e causou " + dano + " de dano");
    }
}

class AtaqueMagico implements EstrategiaDeAtaque {
    @Override
    public void atacar(String atacante, String alvo, int dano) {
        System.out.println(atacante + " atacou " + alvo + " com ataque mágico e causou " + dano + " de dano");
    }
}

class AtaqueADistancia implements EstrategiaDeAtaque {
    @Override
    public void atacar(String atacante, String alvo, int dano) {
        System.out.println(atacante + " atacou " + alvo + " com ataque à distância e causou " + dano + " de dano");
    }
}

class Personagem {
    private String nome;
    private EstrategiaDeAtaque estrategia;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void setEstrategia(EstrategiaDeAtaque estrategia) {
        this.estrategia = estrategia;
    }

    public String getNome() {
        return nome;
    }

    public void atacar(Personagem inimigo, int dano) {
        if (estrategia != null) {
            estrategia.atacar(this.nome, inimigo.getNome(), dano);
        } else {
            System.out.println(this.nome + " não tem uma estratégia de ataque definida!");
        }
    }
}

public class Teste {
    public static void main(String[] args) {
        Personagem heMan = new Personagem("He-Man");
        Personagem esqueleto = new Personagem("Esqueleto");

        heMan.setEstrategia(new AtaqueFisico());
        heMan.atacar(esqueleto, 15);

        heMan.setEstrategia(new AtaqueMagico());
        heMan.atacar(esqueleto, 25);

        heMan.setEstrategia(new AtaqueADistancia());
        heMan.atacar(esqueleto, 10);
    }
}
