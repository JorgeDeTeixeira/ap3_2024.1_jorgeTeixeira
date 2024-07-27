package unidade1.src.gabarito_aula3;

public class TestaAlunoOO {
    public static void main(String[] args) {
        Aluno jorge = new Aluno();

        jorge.setNomeDoAluno("Jorge");
        jorge.setNota1(7);
        jorge.setNota2(8);
        jorge.setNota3(9);

        if (jorge.aprovadoPorMedia()) {
            System.out.println("Aprovado por média!");
        } else {
            System.out.println("Não passou ein.");
        }
    }

}
