package br.com.bandtec.exercicios;

import java.util.Arrays;

import br.com.bandtec.Pilha;

public class Ex1 {
  
  public static void main(String[] args) {
    int[] vetor1 = { 1, 3, 3, 1 };
    int[] vetor2 = { 10, 20, 30, 40 };
    int[] vetor3 = { 10, 20, 30, 30, 20, 10 };

    System.out.println(ehPalindromo(vetor1) + "\n");
    System.out.println(ehPalindromo(vetor2) + "\n");
    System.out.println(ehPalindromo(vetor3) + "\n");
  }

  public static boolean ehPalindromo(int[] vetor) {
    Pilha pilha = new Pilha(vetor.length);
    int[] vetorInverso = new int[vetor.length];

    for (int i = 0; i < vetor.length; i++) {
      pilha.push(vetor[i]);
    }

    for (int i = 0; i < vetor.length; i++) {
      vetorInverso[i] = pilha.pop();
    }

    System.out.print("Vetor: ");
    exibeVetor(vetor);

    System.out.print("Vetor invertido: ");
    exibeVetor(vetorInverso);

    return Arrays.equals(vetor, vetorInverso);
  }

  public static void exibeVetor(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();
  }
}
