package br.com.bandtec.exercicios;

import br.com.bandtec.PilhaObj;

public class Ex5 {
  
  public static void main(String[] args) {
    PilhaObj<String> teste = new PilhaObj<>(5);

    teste.push("Marcos");
    teste.push("Areia");
    teste.push("Caminhoneiro");

    teste.exibe();

    while (!teste.isEmpty()) {
      teste.pop();
      teste.exibe();
    }
  }
}
