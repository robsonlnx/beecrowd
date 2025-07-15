import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, soma;
        A = teclado.nextInt();
        B = teclado.nextInt();
        soma = A + B;
        System.out.println("SOMA = " + soma);

        teclado.close();

    }
}
