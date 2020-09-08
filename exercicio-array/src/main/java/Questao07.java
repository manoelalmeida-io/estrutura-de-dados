import java.util.Scanner;

public class Questao07 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];

    for (int i = 0; i < vetor1.length; i++) {
      System.out.print("Digite o " + (i + 1) + "° valor: ");
      vetor1[i] = leitor.nextInt();
    }

    for (int i = 0; i < vetor2.length; i++) {
      System.out.print("Digite o " + (5 + i + 1) + "° valor: ");
      vetor2[i] = leitor.nextInt();
    }

    // Ordenando vetor 1
    for (int i = 0; i < vetor1.length; i++) {
      for (int j = i; j < vetor1.length; j++) {
        int v1 = vetor1[i];
        int v2 = vetor1[j];

        if (v2 < v1) {
          vetor1[i] = v2;
          vetor1[j] = v1;
        }
      }
    }

    // Ordenando vetor 2
    for (int i = 0; i < vetor2.length; i++) {
      for (int j = i; j < vetor2.length; j++) {
        int v1 = vetor2[i];
        int v2 = vetor2[j];

        if (v2 < v1) {
          vetor2[i] = v2;
          vetor2[j] = v1;
        }
      }
    }

    int[] ordenados = new int[10];
    int i1 = 0;
    int i2 = 0;

    while (i1 < 5 || i2 < 5) {
      if (i1 < 5) {
        if (i2 > 4 || vetor1[i1] <= vetor2[i2]) {
          ordenados[i1 + i2] = vetor1[i1];
          i1++;
        }
      }
      if (i2 < 5) {
        if (i1 > 4 || vetor1[i1] >= vetor2[i2]) {
          ordenados[i1 + i2] = vetor2[i2];
          i2++;
        }
      }
    }

    for (int ordenado : ordenados) {
      System.out.print(ordenado + " ");
    }
  }
}
