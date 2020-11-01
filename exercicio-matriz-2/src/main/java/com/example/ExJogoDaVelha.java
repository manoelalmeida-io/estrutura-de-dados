package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExJogoDaVelha {
  
  public static void main(String[] args) {
    char[][] tabuleiro = new char[3][3];
    boolean acabou = false;
    int jogador = 1;

    reset(tabuleiro);

    while (!acabou) {
      exibe(tabuleiro);

      System.out.printf("%nVez do jogador %d:%n", jogador);

      int linha = inputValido("linha");
      int coluna = inputValido("coluna");

      if (tabuleiro[linha - 1][coluna - 1] != ' ') {
        System.out.println("Esta posição do tabuleiro já está ocupada");
      } else {
        tabuleiro[linha - 1][coluna - 1] = jogador == 1 ? 'X' : 'O';
        exibe(tabuleiro);

        acabou = haVencedor(tabuleiro) || haEmpate(tabuleiro);
        if (!acabou) jogador = jogador == 1 ? 2 : 1;
      }
    }
  
    if (haEmpate(tabuleiro)) {
      System.out.printf("%nHouve um empate nesta rodada!!!%n%n");
    } else {
      System.out.printf("%nO jogador %d venceu!!!%n%n", jogador);
    }
  }

  public static void reset(char[][] tabuleiro) {
    for (int linha = 0; linha < tabuleiro.length; linha++) {
      for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
        tabuleiro[linha][coluna] = ' ';
      }
    }
  }

  public static void exibe(char[][] tabuleiro) {
    System.out.println("\nTabuleiro:\n");
    for (int linha = 0; linha < tabuleiro.length; linha++) {
      for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
        System.out.printf(coluna == 1 ? "| %s |" : "  %s  ", tabuleiro[linha][coluna]);
      }
      System.out.println(linha == 2 ? "\n     |   |     " : "\n_____|___|_____");
    }
  }

  public static int inputValido(String campo) {
    Scanner leitor = new Scanner(System.in);
    
    while (true) {
      try {
        System.out.printf("%nDigite o valor da %s: ", campo);
        int input = leitor.nextInt();

        if (input < 1 || input > 3) {
          throw new IllegalArgumentException(String.format("Valor inválido para o campo %s (min 1, max 3)", campo));
        }

        return input;
      } catch (InputMismatchException e) {
        leitor = new Scanner(System.in);
        System.out.printf("%s: Número inválido%n", e);
      } catch (IllegalArgumentException e) {
        System.out.println(e);
      }
    }
  }

  public static boolean haVencedor(char[][] tabuleiro) {
    for (int linha = 0; linha < tabuleiro.length; linha++) {
      char caractere = tabuleiro[linha][0];
      if (caractere != ' ') {
        int soma = 0;
        for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
          if (tabuleiro[linha][coluna] == caractere) soma++;
        }
        if (soma == 3) return true;
      }
    }

    for (int coluna = 0; coluna < tabuleiro[0].length; coluna++) {
      char caractere = tabuleiro[0][coluna];
      if (caractere != ' ') {
        int soma = 0;
        for (int linha = 0; linha < tabuleiro.length; linha++) {
          if (tabuleiro[linha][coluna] == caractere) soma++;
        }
        if (soma == 3) return true;
      }
    }

    char caractereDiagonal = tabuleiro[0][0];
    if (caractereDiagonal != ' ') {
      int soma = 0;
      for (int linha = 0; linha < tabuleiro.length; linha++) {
        if (tabuleiro[linha][linha] == caractereDiagonal) soma++;
      }
      if (soma == 3) return true;
    }

    char caractereDiagonalSecundaria = tabuleiro[0][2];
    if (caractereDiagonalSecundaria != ' ') {
      int soma = 0;
      for (int linha = 0; linha < tabuleiro.length; linha++) {
        if (tabuleiro[linha][tabuleiro.length - 1 - linha] == caractereDiagonalSecundaria) soma++;
      }
      if (soma == 3) return true;
    }

    return false;
  }

  public static boolean haEmpate(char[][] tabuleiro) {
    for (int linha = 0; linha < tabuleiro.length; linha++) {
      for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
        if (tabuleiro[linha][coluna] == ' ') return false;
      }
    }
    return true;
  }
}
