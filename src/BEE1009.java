import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salarioFixo, totalVendas, salario;
        double comissao = 0.15;

        nome = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalVendas = teclado.nextDouble();
        salario = salarioFixo + (totalVendas * comissao);
        System.out.printf("TOTAL = R$ %.2f\n", salario);

        teclado.close();
    }
}
