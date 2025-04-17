package execicio1.codigo1;

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void notificarPedidoEnviado() {
        System.out.println(this.nome + ", seu pedido foi enviado!");
    }
}

class Pedido {
    Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void notificarCliente() {
        this.cliente.notificarPedidoEnviado();
    }
}

public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");
        Pedido pedido = new Pedido(cliente);
        pedido.notificarCliente();
    }
}


