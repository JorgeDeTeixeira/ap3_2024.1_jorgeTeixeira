package unidade1.src.gabarito_aula4;

import java.time.LocalDate;

public class Aluno {
    String nomeDoAluno;
    String nomeDaMae;
    double nota1;
    double nota2;
    double nota3;
    boolean aprovadoMedia = false;
    LocalDate dataNascimento;

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public boolean isAprovadoMedia() {
        return aprovadoMedia;
    }

    public void setAprovadoMedia(boolean aprovadoMedia) {
        this.aprovadoMedia = aprovadoMedia;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno [nomeDoAluno=" + nomeDoAluno + ", nomeDaMae=" + nomeDaMae + ", nota1=" + nota1 + ", nota2="
                + nota2 + ", nota3=" + nota3 + ", aprovadoMedia=" + aprovadoMedia + ", dataNascimento=" + dataNascimento
                + "]";
    }

}
