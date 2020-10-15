import java.util.Scanner;

public class Ex4 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int maxAluno = 0;
    boolean valido = false;

    while(!valido) {
      try {
        System.out.print("Digite a quantidade de alunos: ");
        maxAluno = leitor.nextInt();

        if (maxAluno < 5 || maxAluno > 15) {
          throw new Exception("");
        }

        valido = true;
      } catch (Exception e) {
        System.out.println("Digite um valor válido entre 5 e 15");
      }
    }

    String[] nomes = new String[maxAluno];
    double[][] notas = new double[maxAluno][2];
    double[] medias = new double[2];

    for (int i = 0; i < maxAluno; i++) {
      System.out.printf("Digite o nome do aluno %d: ", (i + 1));
      nomes[i] = leitor.next();
    }

    for (int l = 0; l < notas.length; l++) {
      for (int c = 0; c < notas[l].length; c++) {
        System.out.printf("Digite o valor da nota AC%d do aluno %s: ", (c + 1), nomes[l]);
        notas[l][c] = leitor.nextDouble();
      }
    }

    for (int c = 0; c < notas[0].length; c++) {
      double soma = 0;

      for (int l = 0; l < notas.length; l++) {
        soma += notas[l][c];
      }

      medias[c] = (soma / notas.length);
    }

    System.out.printf("\n%-20s%8s%10s\n\n", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2");

    for (int i = 0; i < maxAluno; i++) {
      System.out.printf("%-20s%8.2f%10.1f\n", nomes[i], notas[i][0], notas[i][1]);
    }

    System.out.printf("\n%-20s%8.2f%10.1f", "MÉDIA:", medias[0], medias[1]);
  }
}
