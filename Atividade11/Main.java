public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(3, 4);
        formas[3] = new Cubo(2);
        formas[4] = new Esfera(3);

        for (Forma forma : formas) {
            System.out.println(forma.toString());
            if (forma instanceof FormaBidimensional) {
                System.out.println("Área: " + ((FormaBidimensional) forma).obterArea());
            }
            if (forma instanceof FormaTridimensional) {
                System.out.println("Área: " + ((FormaTridimensional) forma).obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println();
        }
    }
}