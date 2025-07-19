
import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primeiroValor, segundoValor, resultado;

        primeiroValor = teclado.nextInt();
        segundoValor = teclado.nextInt();
        resultado = primeiroValor * segundoValor;

        System.out.println("PROD = " + resultado);


        teclado.close();
    }
}
