import java.util.LinkedList;

public class Questao2 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        for (int i = 0; i < 9999; i++) {
            int numeroRandomico = (int) (Math.random() * 1000) + 1;
            numeros.add(numeroRandomico);
        }

        int menor = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        System.err.println("O menor número é: " + menor);
    }
}
