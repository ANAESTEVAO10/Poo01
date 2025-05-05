import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desafio01 {
    private static int numeroAleatorio;

    public static void main(String[] args) {
        numeroAleatorio = (int) (Math.random() * 5) + 1;
        criarInterface();
    }

    private static void criarInterface() {
        JFrame frame = new JFrame("DESAFIO");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Vou pensar em um valor entre 1 e 5. Tente adivinhar!");
        label.setBounds(50, 20, 300, 30);
        frame.add(label);

        JTextField palpiteField = new JTextField();
        palpiteField.setBounds(150, 70, 50, 30);
        frame.add(palpiteField);

        JButton palpiteButton = new JButton("Palpite");
        palpiteButton.setBounds(150, 110, 100, 30);
        frame.add(palpiteButton);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(50, 160, 300, 30);
        frame.add(resultadoLabel);

        palpiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palpiteText = palpiteField.getText();
                int palpite = Integer.parseInt(palpiteText);

                if (palpite == numeroAleatorio) {
                    resultadoLabel.setText("ACERTOU!");
                } else {
                    resultadoLabel.setText("ERROU! Eu pensei no valor " + numeroAleatorio);
                }
            }
        });

        frame.setVisible(true);
    }
}