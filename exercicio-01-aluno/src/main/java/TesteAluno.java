public class TesteAluno {

  public static void main(String[] args) {

    AlunoFundamental alunoFundamental = new AlunoFundamental(
        100, "Marcelo", 8.0, 9.0, 7.5, 8.5);

    AlunoGraduacao alunoGraduacao = new AlunoGraduacao(
        101, "Ricardo", 9.9, 7.0);

    AlunoPos alunoPos = new AlunoPos(
        102, "João", 5.0, 6.0, 3.2);

    System.out.println(alunoFundamental);
    System.out.println(alunoGraduacao);
    System.out.println(alunoPos);

    Escola bandtec = new Escola("Bandtec");
    bandtec.adicionaAluno(alunoFundamental);
    bandtec.adicionaAluno(alunoGraduacao);
    bandtec.adicionaAluno(alunoPos);

    bandtec.exibeTodos();
    bandtec.exibeAlunosGraduacao();
    bandtec.exibeAprovados();
    bandtec.buscaAluno(101);
    bandtec.buscaAluno(103);

    /*
      Questões:

      Esse sistema de Aluno e Escola apresenta polimorfismo?
      R: Sim, cada classe que herda da classe Aluno implementa o método calculaMedia de uma forma
      diferente, respeitando as diferenças entre cada tipo de aluno.

      De que maneira o Polimorfismo contribui para a reutilização de código
      R: Nesse para calcularmos a média basta chamar o método calculaMedia sem precisarmos saber
      qual é o tipo do aluno que terá a média calculada, assim podemos fazer uma lista com diferentes
      tipos de alunos e usar o mesmo código para calcular a média de todos eles.

      De que maneira o conceito de classe abstrata e método abstrato colaboram para a preparação
      do sistema para classes que poderão existir somente no futuro?
      R: Caso outro tipo de aluno seja adicionado ao sistema e herde da classe Aluno ele poderá ser
      adicionado a uma escola sem que necessite qualquer atualização na classe Escola, o código
      continuará funcionando normalmente.

     */
  }
}
