package execicio1.codigo3;

class Sistema {
    Sistema() {
    }

    public void processarBoasVindas(Usuario usuario) {
        usuario.enviarMensagemBoasVindas();
    }
}
class Usuario {
    private String nome;
    private boolean ativo;

    public Usuario(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void enviarMensagemBoasVindas() {
        if (this.ativo) {
            System.out.println("Bem-vindo, " + this.nome + "!");
        }

    }
}
public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        Usuario usuarioAtivo = new Usuario("Maria", true);
        Usuario usuarioInativo = new Usuario("João", false);
        Sistema sistema = new Sistema();
        sistema.processarBoasVindas(usuarioAtivo);
        sistema.processarBoasVindas(usuarioInativo);
    }
}
