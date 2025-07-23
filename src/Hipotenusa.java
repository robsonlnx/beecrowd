import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double catetoOposto, catetoAdjacente, hipotenusa;

        catetoOposto = teclado.nextDouble();
        catetoAdjacente = teclado.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
        System.out.printf("A hypotenusa mede %.2f\n", hipotenusa);


        teclado.close();
    }
}
