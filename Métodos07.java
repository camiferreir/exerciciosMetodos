
package métodos07;

import java.util.Scanner;

public class Métodos07 {
    public static void areadocirculo () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double areaDoCirculo = calcularAreaCirculo(raio);
        System.out.println("A área do círculo é: " + areaDoCirculo);
    }

    public static double calcularAreaCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
   public static void main(String[] args) {
   Areadocirculo();
}
  
