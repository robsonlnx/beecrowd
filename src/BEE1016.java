import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int velocidade, distancia;
        velocidade = teclado.nextInt();
        distancia = velocidade * 2;
        System.out.println(distancia + " minutos");

        teclado.close();
    }
}
