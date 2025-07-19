import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio, resultado;
        raio = teclado.nextDouble();

        resultado = (4.0 / 3) * 3.14159 * (raio * raio * raio);
        System.out.printf("VOLUME = %.3f\n", resultado);


        teclado.close();
    }
}
