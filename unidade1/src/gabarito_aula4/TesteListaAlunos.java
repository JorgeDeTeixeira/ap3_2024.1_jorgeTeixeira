package unidade1.src.gabarito_aula4;

import java.util.LinkedList;
import java.util.Scanner;

import unidade1.src.gabarito_aula3.Aluno;

public class TesteListaAlunos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        LinkedList<Aluno> osAlunos = new LinkedList<Aluno>();

        for (int i = 1; i <= 10; i++) {
            Aluno aluno = new Aluno();
            aluno.setNota1(5);
            osAlunos.add(aluno);
            System.out.println("Aluno " + i + ": " + aluno);
        }

        leitor.close();
    }
}
