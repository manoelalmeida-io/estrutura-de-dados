package com.example;

import java.util.Scanner;

public class Ex2 {
  
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o número de linhas da matriz: ");
    int maxLinhas = leitor.nextInt();

    System.out.print("Digite o número de colunas da matriz: ");
    int maxColunas = leitor.nextInt();

    int[][] matriz = new int[maxLinhas][maxColunas];

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[0].length; coluna++) {
        System.out.printf("Digite o valor da linha %d coluna %d: ", (linha + 1), (coluna + 1));
        matriz[linha][coluna] = leitor.nextInt();
      }
    }

    exibeNum10a20(matriz);
    mediaPares(matriz);

    leitor.close();
  }

  public static void exibeNum10a20(int[][] matriz) {
    int[][] irregular = matrizIrregular10a20(matriz);

    for (int linha = 0; linha < irregular.length; linha++) {
      System.out.printf("Na linha %d há %d números entre 10 a 20: ", linha + 1, irregular[linha].length);
      for (int coluna = 0; coluna < irregular[linha].length; coluna++) {
        System.out.print(irregular[linha][coluna] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] matrizIrregular10a20(int[][] matriz) {
    int[][] linhas = new int[matriz.length][];

    for (int linha = 0; linha < matriz.length; linha++) {
      int contador = 0;
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        if (matriz[linha][coluna] >= 10 && matriz[linha][coluna] <= 20) {
          contador++;
        }
      }

      linhas[linha] = new int[contador];

      contador = 0;
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        if (matriz[linha][coluna] >= 10 && matriz[linha][coluna] <= 20) {
          linhas[linha][contador] = matriz[linha][coluna];
          contador++;
        }
      }
    }

    return linhas;
  }

  public static void mediaPares(int[][] matriz) {
    Integer soma = 0;
    Integer contador = 0;

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        if (matriz[linha][coluna] % 2 == 0) {
          contador++;
          soma += matriz[linha][coluna];
        }
      }
    }

    if (contador != 0) {
      System.out.printf("Médias dos pares: %d / %d = %.2f%n", soma, contador, (soma.doubleValue() / contador));
    } else {
      System.out.println("Não há números pares na matriz");
    }
  }
}
