package br.com.bandtec.exercicios;

import br.com.bandtec.PilhaObj;

public class Ex3 {
  
  public static void main(String[] args) {
    String frase = "A pilha do gato";
    PilhaObj<Character> pilha = new PilhaObj<>(frase.length());

    for (int i = 0; i < frase.length(); i++) {
      pilha.push(frase.charAt(i));
    }

    System.out.println(frase);
    while (!pilha.isEmpty()) {
      System.out.print(pilha.pop());
    }

    System.out.println();
  }
}
