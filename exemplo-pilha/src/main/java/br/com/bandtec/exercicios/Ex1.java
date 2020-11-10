package br.com.bandtec.exercicios;

import br.com.bandtec.Pilha;

public class Ex1 {
  
  public static void main(String[] args) {
    int[] vetor1 = { 1, 3, 3, 1 };
    int[] vetor2 = { 10, 20, 30, 40 };
    int[] vetor3 = { 10, 20, 30, 30, 20, 10 };
    int[] vetor4 = { 1, 2, 3, 2, 1 };

    System.out.println(ehPalindromo(vetor1) + "\n");
    System.out.println(ehPalindromo(vetor2) + "\n");
    System.out.println(ehPalindromo(vetor3) + "\n");
    System.out.println(ehPalindromo(vetor4) + "\n");
  }

  public static boolean ehPalindromo(int[] vetor) {
    Pilha pilha = new Pilha(vetor.length / 2);

    for (int i = 0; i < vetor.length / 2; i++) {
      pilha.push(vetor[i]);
    }

    int inc = vetor.length % 2 == 1 ? 1 : 0;
    for (int i = (vetor.length / 2) + inc; i < vetor.length; i++) {
      if (vetor[i] != pilha.pop()) {
        return false;
      }
    }

    return true;
  }

  public static void exibeVetor(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();
  }
}
