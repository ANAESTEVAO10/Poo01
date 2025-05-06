import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desafio02 {
    private static int inicio;
    private static int fim;
    private static int passo;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Desafio02::criarInterface);
    }

    private static void criarInterface() {
        JFrame frame = new JFrame("DESAFIO");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelInicio = new JLabel("Início:");
        labelInicio.setBounds(20, 20, 100, 30);
        frame.add(labelInicio);

        JSlider sliderInicio = new JSlider(0, 100, 2);
        sliderInicio.setBounds(100, 20, 200, 30);
        frame.add(sliderInicio);

        JLabel labelFim = new JLabel("Fim:");
        labelFim.setBounds(20, 70, 100, 30);
        frame.add(labelFim);

        JSlider sliderFim = new JSlider(0, 100, 18);
        sliderFim.setBounds(100, 70, 200, 30);
        frame.add(sliderFim);

        JLabel labelPasso = new JLabel("Passo:");
        labelPasso.setBounds(20, 120, 100, 30);
        frame.add(labelPasso);

        JSlider sliderPasso = new JSlider(1, 10, 1);
        sliderPasso.setBounds(100, 120, 200, 30);
        frame.add(sliderPasso);

        JButton contarButton = new JButton("Contar");
        contarButton.setBounds(150, 180, 100, 30);
        frame.add(contarButton);

        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setBounds(20, 220, 350, 100);
        resultadoArea.setEditable(false);
        frame.add(resultadoArea);

        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio = sliderInicio.getValue();
                fim = sliderFim.getValue();
                passo = sliderPasso.getValue();

                StringBuilder resultado = new StringBuilder();
                for (int i = inicio; i <= fim; i += passo) {
                    resultado.append(i).append(" ");
                }
                resultadoArea.setText(resultado.toString());
            }
        });

        frame.setVisible(true);
    }
}