package br.com.bandtec;

public class Fila {
  int tamanho;
  String[] fila;

  public Fila(int capacidade) {
    this.tamanho = 0;
    this.fila = new String[capacidade];
  }

  public boolean isEmpty() {
    return tamanho == 0;
  }

  public boolean isFull() {
    return tamanho == fila.length;
  }

  public void insert(String info) {
    if (tamanho < fila.length) {
      fila[tamanho++] = info;
    } else {
      System.out.println("Fila cheia!");
    }
  }

  public String poll() {
    if (this.isEmpty()) return null;

    String info = fila[0];

    for (int i = 1; i < fila.length; i++) {
      fila[i - 1] = fila[i];
    }

    tamanho--;
    return info;
  }

  public String peek() {
    return fila[0];
  }

  public void exibe() {
    if (this.isEmpty()) {
      System.out.println("Fila vazia!");
      return;
    }

    System.out.print("[");
    for (int i = 0; i < tamanho; i++) {
      System.out.print(fila[i] + (i < tamanho - 1 ? ", " : ""));
    }
    System.out.println("]");
  }
}
