package CriandoClaeObj1; // Define o pacote da classe

// Classe abstrata que define métodos que devem ser implementados nas subclasses
public abstract class Pagamento {
    public abstract double calcularTotal(); // Método abstrato para calcular o total do pagamento
    public abstract void imprimirRecibo(); // Método abstrato para imprimir o recibo do pagamento
}