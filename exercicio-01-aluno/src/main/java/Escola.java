import java.util.ArrayList;
import java.util.List;

public class Escola {

  private String nome;
  private List<Aluno> alunos;

  public Escola(String nome) {
    this.nome = nome;
    this.alunos = new ArrayList<>();
  }

  public void adicionaAluno(Aluno a) {
    alunos.add(a);
  }

  public void exibeTodos() {
    System.out.println("\nTodos os alunos:");

    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }
  }

  public void exibeAlunosGraduacao() {
    System.out.println("\nTodos os alunos na graduação:");

    for (Aluno aluno : alunos) {
      if (aluno instanceof AlunoGraduacao) {
        System.out.println(aluno);
      }
    }
  }

  public void exibeAprovados() {
    System.out.println("\nAlunos aprovados");

    for (Aluno aluno : alunos) {
      if (aluno.calculaMedia() >= 5.0) {
        System.out.println(aluno);
      }
    }
  }

  public void buscaAluno(Integer ra) {
    for (Aluno aluno : alunos) {
      if (aluno.getRa().equals(ra)) {
        System.out.println("\nAluno encontrado:");
        System.out.println(aluno);
        return;
      }
    }

    System.out.println("\nAluno não encontrado");
  }
}
