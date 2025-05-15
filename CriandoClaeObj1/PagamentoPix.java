package CriandoClaeObj1; // Define o pacote da classe

// Classe que representa um pagamento via Pix, estende a classe Pagamento
public class PagamentoPix extends Pagamento {
    private String chavePix; // Chave Pix usada para pagamento
    private double valorPago; // Valor pago

    // Construtor da classe, inicializa os atributos
    public PagamentoPix(String chavePix, double valorPago) {
        this.chavePix = chavePix; // Inicializa chave Pix
        this.valorPago = valorPago; // Inicializa valor pago
    }

    @Override
    public double calcularTotal() { // Implementa o método para calcular o total
        if (valorPago > 0) { // Verifica se o valor pago é positivo
            return valorPago; // Retorna o valor pago
        }
        return 0; // Retorna 0 se o valor pago não for positivo
    }

    @Override
    public void imprimirRecibo() { // Implementa o método para imprimir o recibo
        System.out.println("Pagamento via Pix realizado com sucesso!"); // Mensagem de sucesso
    }

    public void setValorPago(double valorPago) { // Método para definir o valor pago
        this.valorPago = valorPago; // Atualiza o valor pago
    }

    public double getValorPago() { // Método para obter o valor pago
        return valorPago; // Retorna o valor pago
    }

    public String getChavePix() { // Método para obter a chave Pix
        return chavePix; // Retorna a chave Pix
    }
}