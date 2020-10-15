import java.util.Scanner;

public class ExemploMatriz {

  public static void exibeMatriz(int[][] m) {
    for (int linha = 0; linha < m.length; linha++) {
      for (int coluna = 0; coluna < m[linha].length; coluna++) {
        System.out.print(m[linha][coluna] + "\t");
      }
      System.out.println();
    }
  }

  public static void exibeMatrizTransposta(int[][] m) {
    for (int coluna = 0; coluna < m[0].length; coluna++) {
      for (int linha = 0; linha < m.length; linha++) {
        System.out.print(m[linha][coluna] + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    // Criação de vetor
    int[] vetor = new int[10];

    // Criação de matriz
    int[][] matriz = new int[3][4];

    int[][] matriz2 = { {1,2}, {3,4}, {5,6}, {7,8} };

    int[][] matrizLoka =  { {1}, {2,3,4,5}, {6,7}, {8,9,10} };

//    for (int linha = 0; linha < matriz.length; linha++) {
//      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
//        System.out.println("Digite o valor de matriz[" + linha + "]" +
//            "[" + coluna + "]");
//
//        matriz[linha][coluna] = leitor.nextInt();
//      }
//    }

    //exibeMatriz(matriz);
    System.out.println();
    exibeMatriz(matriz2);
    System.out.println();
    exibeMatrizTransposta(matriz2);
    System.out.println();
    exibeMatriz(matrizLoka);
    System.out.println();
    exibeMatrizTransposta(matrizLoka);
  }
}
