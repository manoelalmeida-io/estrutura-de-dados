package com.example;

public class Ex4 {
  
  public static void main(String[] args) {
    int[][] magic = {
      {2, 7, 6},
      {9, 5, 1},
      {4, 3, 8}
    };

    int[][] nonMagic = {
      {2, 7, 6},
      {8, 5, 1},
      {4, 3, 8}
    };

    exibirMatriz(nonMagic);
    System.out.println(quadradoMagico(nonMagic) ? "Magic" : "Not magic");

    exibirMatriz(magic);
    System.out.println(quadradoMagico(magic) ? "Magic" : "Not magic");
  }

  public static boolean quadradoMagico(int[][] matriz) {
    int ultimaSoma = 0;
    int somaDiagonal = 0;
    int somaDiagonalSecundaria = 0;

    for (int i = 0; i < matriz.length; i++) {
      int somaLinha = 0;
      int somaColuna = 0;

      for (int j = 0; j < matriz[i].length; j++) {
        somaLinha += matriz[i][j];
        somaColuna += matriz[j][i];
      }

      if (somaLinha != somaColuna) return false;
      
      ultimaSoma = somaLinha;
    }

    for (int i = 0; i < matriz.length; i++) {
      somaDiagonal += matriz[i][i];
      somaDiagonalSecundaria += matriz[i][matriz.length - i - 1];
    }

    if (somaDiagonal != somaDiagonalSecundaria) return false;

    return (somaDiagonal == ultimaSoma);
  }

  public static void exibirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf("%5d", matriz[i][j]);
      }
      System.out.println("\n");
    }
  }
}
