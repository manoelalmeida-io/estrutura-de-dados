import java.util.Scanner;

public class Ex3 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int[][] matriz = new int[3][3];

    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        System.out.printf("Digite o valor da linha %d coluna %d: ", l, c);
        matriz[l][c] = leitor.nextInt();
      }
    }

    Ex2.exibeMatriz(matriz);
    exibeMatrizMedia(matriz);
  }

  public static void exibeMatrizMedia(int[][] matriz) {
    System.out.print("[");
    for (int c = 0; c < matriz[0].length; c++) {
      int soma = 0;

      for (int l = 0; l < matriz.length; l++) {
        soma += matriz[l][c];
      }

      System.out.print(soma);
      System.out.print((c < matriz[0].length - 1) ? ", " : "");
    }
    System.out.println("]");
  }
}
