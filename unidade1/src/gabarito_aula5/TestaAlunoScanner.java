package unidade1.src.gabarito_aula5;

import java.util.Scanner;

import unidade1.src.gabarito_aula4.Aluno;

public class TestaAlunoScanner {
    public static void main(String[] args) {
        Aluno umAluno = new Aluno();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeDoAluno = leitor.nextLine();
        System.out.print("Digite a nota 1:");
        double n1 = leitor.nextInt();
        System.out.print("Digite a nota 2:");
        double n2 = leitor.nextInt();

        umAluno.setNomeDoAluno(nomeDoAluno);
        umAluno.setNota1(n1);
        umAluno.setNota2(n2);

        System.out.println(umAluno);

        leitor.close();
    }
}
