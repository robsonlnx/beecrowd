import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroFuncionario, numeroHoras;
        double valorDaHora, salario;

        numeroFuncionario = teclado.nextInt();
        numeroHoras = teclado.nextInt();
        valorDaHora = teclado.nextDouble();

        salario = numeroHoras * valorDaHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();
    }
}
