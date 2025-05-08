import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVetor extends JFrame {
    int vetor[] = new int[5]; // Vetor de inteiros
    DefaultListModel<String> lista = new DefaultListModel<>(); // Modelo da lista
    JList<String> jList = new JList<>(lista); // JList para exibir os elementos
    int index = 0; // Índice para controlar a posição no vetor

    public TelaVetor() {
        setTitle("Preencher Vetor");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField inputField = new JTextField(15);
        JButton addButton = new JButton("Adicionar");
        JButton finalizeButton = new JButton("Finalizar");

        jList.setPreferredSize(new Dimension(250, 200));
        add(inputField);
        add(addButton);
        add(new JScrollPane(jList));
        add(finalizeButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < vetor.length) {
                    try {
                        int value = Integer.parseInt(inputField.getText());
                        vetor[index] = value; // Adiciona o valor ao vetor
                        lista.addElement(String.valueOf(value)); // Adiciona à lista visual
                        index++; // Incrementa o índice
                        inputField.setText(""); // Limpa o campo de texto
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O vetor já está cheio.");
                }
            }
        });

        finalizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Vetor preenchido: " + java.util.Arrays.toString(vetor));
                lista.clear(); // Limpa a lista após finalizar
                index = 0; // Reseta o índice
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaVetor tela = new TelaVetor();
            tela.setVisible(true);
        });
    }
}