import java.time.LocalDate;

public class Aluno {

    private String nome;
    private LocalDate dataNascimento;
    private Integer matricula;

    public Aluno(String nome, LocalDate dataNascimento, Integer matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = '" + nome + '\'' +
                ", dataNascimento = " + dataNascimento +
                ", matricula = " + matricula +
                '}';
    }

//    Exercício 4 - Comparação de objetos:
//    Implemente o método "equals" da classe Aluno. Esse método deverá considerar apenas a propriedade "matricula".
//    Na nossa regra de negócio hipotética desse trabalho, os objetos de Aluno serão considerados iguais quando possuírem a mesma matrícula, independente do restante dos valores.
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Aluno aluno = (Aluno) object;
        return matricula.equals(aluno.matricula);
    }
}
