package CriandoClaeObj;

public class CriandoClaeObj { // Classe que contém o método main
    public static void main(String[] args) {
        // Criação de instâncias da classe ContaBanco
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);

        // Exibe o estado atual das contas
        p1.estadoAtual();
        p2.estadoAtual();
    }
}