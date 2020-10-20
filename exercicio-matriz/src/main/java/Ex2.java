import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int[][] matrizA = new int[2][3];
    int[][] matrizB = new int[2][3];
    int[][] matrizC = new int[2][3];

    for (int l = 0; l < matrizA.length; l++) {
      for (int c = 0; c < matrizA[l].length; c++) {
        System.out.printf("Digite o valor da linha %d coluna %d da matriz A: ", l, c);
        matrizA[l][c] = leitor.nextInt();
      }
    }

    for (int l = 0; l < matrizB.length; l++) {
      for (int c = 0; c < matrizB[l].length; c++) {
        System.out.printf("Digite o valor da linha %d coluna %d da matriz B: ", l, c);
        matrizB[l][c] = leitor.nextInt();
      }
    }

    for (int l = 0; l < matrizB.length; l++) {
      for (int c = 0; c < matrizB[l].length; c++) {
        matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
      }
    }

    System.out.println("Matriz A");
    exibeMatriz(matrizA);

    System.out.println("Matriz B");
    exibeMatriz(matrizB);

    System.out.println("Matriz C");
    exibeMatriz(matrizC);
  }

  public static void exibeMatriz(int[][] matriz) {
    for (int l = 0; l < matriz.length; l++) {
      System.out.print("[");
      for (int c = 0; c < matriz[l].length; c++) {
        System.out.print(matriz[l][c]);
        System.out.print((c < matriz[l].length - 1) ? ", " : "");
      }
      System.out.print("]");
      System.out.println((l < matriz.length - 1) ? "," : "");
    }
    System.out.println();
  }
}
