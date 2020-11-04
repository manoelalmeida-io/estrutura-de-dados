package br.com.bandtec.exercicios;

import br.com.bandtec.PilhaObj;

public class Ex4 {
  
  public static void main(String[] args) {
    String[] frases = { "subi no onibus", "a torre da derrota", "nao palindromo" };

    for (int i = 0; i < frases.length; i++) {
      System.out.println(frases[i]);
      System.out.println("é palindromo: " + ehPalindromo(frases[i]) + "\n");
    }
  }

  public static boolean ehPalindromo(String texto) {
    PilhaObj<Character> pilha = new PilhaObj<>(texto.length());

    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) != ' ') {
        pilha.push(texto.charAt(i));
      }
    }

    int contador = 0;
    while (!pilha.isEmpty()) {
      while (texto.charAt(contador) == ' ') {
        contador++;
      }

      if (!pilha.pop().equals(texto.charAt(contador++))) {
        return false;
      }
    }

    return true;
  }
}
