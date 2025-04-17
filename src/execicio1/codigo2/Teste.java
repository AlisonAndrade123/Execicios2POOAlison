package execicio1.codigo2;

class Caixa {
    Caixa() {
    }

    public void processarPagamento(Pedido pedido) {
        pedido.processarPagamento();
    }
}
class Pedido {
    private boolean pago;

    Pedido() {
    }

    public boolean isPago() {
        return this.pago;
    }

    public void processarPagamento() {
        if (!this.pago) {
            this.pago = true;
            System.out.println("Pagamento realizado.");
        } else {
            System.out.println("Pedido já pago.");
        }
    }
}

public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Caixa caixa = new Caixa();
        caixa.processarPagamento(pedido);
        caixa.processarPagamento(pedido);
    }
}

