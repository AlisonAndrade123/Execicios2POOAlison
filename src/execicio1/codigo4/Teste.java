package execicio1.codigo4;

class Jogo {
    Jogo() {
    }

    public void atacar(Personagem inimigo, int dano) {
        inimigo.atacar(dano);
    }
}
class Personagem {
    private int vida;

    public Personagem(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return this.vida;
    }

    public void atacar(int dano) {
        if (this.vida > 0) {
            this.vida -= dano;
            System.out.println("Inimigo atacado com " + dano + " de dano.");
        }

    }
}
public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        Personagem inimigo = new Personagem(100);
        Jogo jogo = new Jogo();
        jogo.atacar(inimigo, 20);
        System.out.println("Vida restante: " + inimigo.getVida());
        jogo.atacar(inimigo, 50);
        System.out.println("Vida restante: " + inimigo.getVida());
    }
}
