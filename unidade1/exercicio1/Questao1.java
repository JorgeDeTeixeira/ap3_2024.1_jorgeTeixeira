import java.util.Scanner;

//Xico - corrigindo: falta javadoc
//Xico - corrigindo: falta codigo secreto
//Xico - corrigindo: falta pacote
//1724198221
public class Questao1 {

  public double getDistancia() {
    Scanner teclado = new Scanner(System.in);

    double x1, y1, x2, y2, distancia = 1.0;

    System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
    x1 = teclado.nextDouble();
    y1 = teclado.nextDouble();
    x2 = teclado.nextDouble();
    y2 = teclado.nextDouble();

    distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

    System.out.println("A distância é: " + distancia);
    return distancia;
  }

  double val1 = 0.0;
  double val2 = 0.0;
  double val3 = 0.0;

  public double getAmplitude() {
    return amplitude2();
  }

  public double amplitude2() { // Xico - corrigindo: por que nao usou esse metodo?
    return val1 - val2;
  }

  public static void main(String[] args) {
    Questao1 q = new Questao1(); // Xico - corrigindo: pra que esse construtor?
    System.out.println(q.getDistancia());
    System.out.println(q.getAmplitude());
  }
}
