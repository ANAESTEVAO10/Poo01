import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFatorial extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private int valor;

    public TelaFatorial() {
        setTitle("Calculadora de Fatorial");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        JButton calculateButton = new JButton("Calcular Fatorial");
        resultLabel = new JLabel("Fatorial: ");

        add(new JLabel("Insira um número:"));
        add(inputField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    setValor(n);
                    int fatorial = getFatorial();
                    resultLabel.setText("Fatorial: " + fatorial + " (" + getFormula() + ")");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                }
            }
        });
    }

    public void setValor(int n) {
        this.valor = n;
    }

    public int getFatorial() {
        return calcularFatorial(valor);
    }

    private int calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public String getFormula() {
        StringBuilder formula = new StringBuilder();
        for (int i = valor; i > 1; i--) {
            formula.append(i).append(" * ");
        }
        formula.append("1");
        return formula.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaFatorial tela = new TelaFatorial();
            tela.setVisible(true);
        });
    }
}