import java.util.Scanner;

public class Exercicio {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String[] t1 = new String[10];
    String[] t2 = new String[10];
    int pos1 = 0;
    int pos2 = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o nome do aluno: ");
      String nome = leitor.nextLine();
      System.out.print("Digite a turma que o aluno " + nome + " pertence (T1 ou T2): ");
      String turma = leitor.nextLine();

      if (turma.equals("T1")) {
        t1[pos1++] = nome;
      } else {
        t2[pos2++] = nome;
      }
    }

    System.out.println("TURMA 1");
    System.out.print("  Alunos: [");
    for (int i = 0; i < pos1; i++) {
      System.out.print(t1[i] + (i < pos1 - 1 ? ", " : "]"));
    }
    System.out.println("\n  Total de alunos: " + pos1);

    System.out.println("TURMA 2");
    System.out.print("  Alunos: [");
    for (int i = 0; i < pos2; i++) {
      System.out.print(t2[i] + (i < pos2 - 1 ? ", " : "]"));
    }
    System.out.println("\n  Total de alunos: " + pos2);
  }
}
