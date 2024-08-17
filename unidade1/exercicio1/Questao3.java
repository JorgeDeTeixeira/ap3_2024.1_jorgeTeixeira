import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de latão em quilos: ");
        double totalLatao = scanner.nextDouble();

        double quantidadeCobre = totalLatao * 0.70;
        double quantidadeZinco = totalLatao * 0.30;

        System.out.println("Para " + totalLatao + " quilos de latão, você precisará de:");
        System.out.println("Cobre: " + quantidadeCobre + " kg");
        System.out.println("Zinco: " + quantidadeZinco + " kg");

        scanner.close();
    }
}
