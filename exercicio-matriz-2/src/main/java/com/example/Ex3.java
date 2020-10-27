package com.example;

import java.util.Scanner;

public class Ex3 {
  
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz (entre 1 e 6): ");
    int tamanho = leitor.nextInt();

    if (tamanho <= 1 || tamanho >= 6) {
      System.out.println("Tamanho inválido");
      leitor.close();
      return;
    }
    
    int[][] matriz = new int[tamanho][tamanho];

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz.length; coluna++) {
        System.out.printf("Digite o valor da linha %d coluna %d: ", (linha + 1), (coluna + 1));
        matriz[linha][coluna] = leitor.nextInt();
      }
    }

    System.out.print("Diagonal principal: ");
    for (int linha = 0; linha < matriz.length; linha++) {
      System.out.print(matriz[linha][linha] + " ");
    }
    System.out.println();

    System.out.print("Diagonal secundária: ");
    for (int coluna = matriz.length; coluna > 0; coluna--) {
      System.out.print(matriz[matriz.length - coluna][coluna - 1] + " ");
    }
    System.out.println();

    leitor.close();
  }
}
