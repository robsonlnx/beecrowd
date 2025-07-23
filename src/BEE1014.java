import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int distancia = teclado.nextInt();
        float combustivel = teclado.nextFloat();
        float consumo = distancia / combustivel;
        System.out.printf("%.3f km/l\n", consumo);

        teclado.close();

    }
}
