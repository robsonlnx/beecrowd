import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D, resultado;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        resultado = A * B - C * D;
        System.out.println("DIFERENCA = " + resultado);

        teclado.close();
    }
}
