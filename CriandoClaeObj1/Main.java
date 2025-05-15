package CriandoClaeObj1; // Define o pacote da classe

import javax.swing.*; // Importa a biblioteca para janelas de entrada

public class Main {
    public static void main(String[] args) { // Método main corretamente definido
        // Simulação de pagamento com cartão
        String numeroCartao = JOptionPane.showInputDialog("Digite o número do cartão:");
        String bandeiraCartao = JOptionPane.showInputDialog("Digite a bandeira do cartão:");
        String titularCartao = JOptionPane.showInputDialog("Digite o nome do titular:");
        String dataValidade = JOptionPane.showInputDialog("Digite a data de validade (MM/AAAA):");
        double valorPagoCartao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));

        PagamentoCartao pagamentoCartao = new PagamentoCartao(numeroCartao, bandeiraCartao, titularCartao, dataValidade, valorPagoCartao);
        pagamentoCartao.imprimirRecibo(); // Imprime recibo
        JOptionPane.showMessageDialog(null, "Total pago com cartão: R$ " + pagamentoCartao.calcularTotal());

        // Simulação de pagamento via Pix
        String chavePix = JOptionPane.showInputDialog("Digite a chave Pix:");
        double valorPagoPix = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));

        PagamentoPix pagamentoPix = new PagamentoPix(chavePix, valorPagoPix);
        pagamentoPix.imprimirRecibo(); // Imprime recibo
        JOptionPane.showMessageDialog(null, "Total pago via Pix: R$ " + pagamentoPix.calcularTotal());

        // Simulação de pagamento em dinheiro
        double valorPagoDinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago em dinheiro:"));

        PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(valorPagoDinheiro);
        pagamentoDinheiro.imprimirRecibo(); // Imprime recibo
        JOptionPane.showMessageDialog(null, "Total pago em dinheiro: R$ " + pagamentoDinheiro.calcularTotal());
    }
}