import java.util.Scanner;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double seno, cosseno, tangente, angulo;

        System.out.println("Digite o ângulo que você deseja: ");
        angulo = teclado.nextDouble();
        seno = Math.sin(Math.toRadians(angulo));
        System.out.printf("O Cosseno mede %.2f\n", seno);
        cosseno = Math.cos(Math.toRadians(angulo));
        System.out.printf("O Cosseno mede %.2f\n", cosseno);
        tangente = Math.tan(Math.toRadians(angulo));
        System.out.printf("A Tangente mede %.2f\n", tangente);



        teclado.close();
    }
}
