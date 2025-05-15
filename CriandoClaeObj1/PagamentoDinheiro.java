package CriandoClaeObj1; // Define o pacote da classe

// Classe que representa um pagamento em dinheiro, estende a classe Pagamento
public class PagamentoDinheiro extends Pagamento {
    private double valorPago; // Valor pago

    // Construtor da classe, inicializa o valor pago
    public PagamentoDinheiro(double valorPago) {
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
        System.out.println("Pagamento em dinheiro realizado com sucesso!"); // Mensagem de sucesso
    }

    public void setValorPago(double valorPago) { // Método para definir o valor pago
        this.valorPago = valorPago; // Atualiza o valor pago
    }

    public double getValorPago() { // Método para obter o valor pago
        return valorPago; // Retorna o valor pago
    }
}