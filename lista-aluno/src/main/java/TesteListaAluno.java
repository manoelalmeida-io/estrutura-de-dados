import java.util.Scanner;

public class TesteListaAluno {

  public static void main(String[] args) {
    boolean fim = false;
    Scanner leitor = new Scanner(System.in);

    ListaObj<Aluno> lista = new ListaObj<Aluno>(10);

    while(!fim) {
      System.out.println("\n1. Adicionar Aluno");
      System.out.println("2. Exibir a lista");
      System.out.println("3. Exibir um aluno da lista");
      System.out.println("4. Gravar lista");
      System.out.println("5. Fim");
      System.out.print("\nDigite uma opção: ");

      int opcao = leitor.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o ra do aluno: ");
          int ra = leitor.nextInt();
          System.out.print("Digite o nome do aluno: ");
          String nome = leitor.next();
          System.out.print("Digite a nota do aluno: ");
          double nota = leitor.nextDouble();

          lista.adiciona(new Aluno(ra, nome, nota));
          break;

        case 2:
          lista.exibe();
          break;
        case 3:
          System.out.print("Digite o índice do aluno: ");
          System.out.println(lista.getElemento(leitor.nextInt()));
          break;
        case 4:
          lista.limpar();
          break;
        case 5:
          fim = true;
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }
  }
}
