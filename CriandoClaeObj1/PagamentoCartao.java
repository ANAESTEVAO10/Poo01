package CriandoClaeObj1; // Define o pacote da classe

// Classe que representa um pagamento com cartão, estende a classe Pagamento
public class PagamentoCartao extends Pagamento {
    private String numeroCartao; // Número do cartão
    private String bandeiraCartao; // Bandeira do cartão (Visa, MasterCard, etc.)
    private String titularCartao; // Nome do titular do cartão
    private String dataValidade; // Data de validade do cartão
    private double valorPago; // Valor pago

    // Construtor da classe, inicializa os atributos
    public PagamentoCartao(String numeroCartao, String bandeiraCartao, String titularCartao, String dataValidade, double valorPago) {
        this.numeroCartao = numeroCartao; // Inicializa número do cartão
        this.bandeiraCartao = bandeiraCartao; // Inicializa bandeira do cartão
        this.titularCartao = titularCartao; // Inicializa titular do cartão
        this.dataValidade = dataValidade; // Inicializa data de validade
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
        System.out.println("Pagamento realizado com sucesso!"); // Mensagem de sucesso
    }

    public double getValorPago() { // Método para obter o valor pago
        return valorPago; // Retorna o valor pago
    }

    public void setValorPago(double valorPago) { // Método para definir o valor pago
        this.valorPago = valorPago; // Atualiza o valor pago
    }
}