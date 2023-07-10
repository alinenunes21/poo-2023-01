import java.util.Scanner;
import java.util.List;
public class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        // Calcula a circunferência
        double circunferencia = 2 * Math.PI * raio;

        System.out.println("A circunferência do círculo é: " + circunferencia);
    }
}



