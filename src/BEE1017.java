import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tempo, velocidade;
        double litros = 12.0;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        litros = (tempo * velocidade) / litros;

        System.out.printf("%.3f\n", litros);

        teclado.close();
    }
}
