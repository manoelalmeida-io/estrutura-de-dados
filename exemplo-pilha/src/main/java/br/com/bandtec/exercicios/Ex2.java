package br.com.bandtec.exercicios;

import br.com.bandtec.Pilha;

public class Ex2 {
  
  public static void main(String[] args) {
    int num1 = 9;
    int num2 = 12;
    int num3 = 32;

    System.out.println(binario(num1));
    System.out.println(binario(num2));
    System.out.println(binario(num3));
  }

  public static String binario(int num) {
    Pilha pilha = new Pilha(10);
    int aux = num;
    String binario = "";

    while (aux != 0) {
      pilha.push(aux % 2);
      aux /= 2;
    }
    
    while (!pilha.isEmpty()) {
      binario += pilha.pop();
    }

    return binario;
  }
}
