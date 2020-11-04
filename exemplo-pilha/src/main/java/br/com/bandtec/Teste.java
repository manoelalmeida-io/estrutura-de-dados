package br.com.bandtec;

public class Teste {
  public static void main(String[] args) {
    Pilha pilha = new Pilha(5);

    pilha.push(4);
    pilha.push(9);
    pilha.push(23);
    pilha.push(90);
    pilha.push(1);

    pilha.exibe();
    for (int i = 0; i < 5; i++) {
      pilha.pop();
      pilha.exibe();
    }
  }
}
