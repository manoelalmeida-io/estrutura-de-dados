package br.com.bandtec;

public class App {
  public static void main(String[] args) {
    Fila fila = new Fila(5);

    fila.exibe();

    fila.insert("Marcos");
    fila.insert("Azeitona");
    fila.insert("Morango");
    fila.insert("ALERTA DE ANOMALIA");
    fila.insert("Guaraná");
    
    fila.exibe();

    while (!fila.isEmpty()) {
      fila.poll();
      fila.exibe();
    }
  }
}
