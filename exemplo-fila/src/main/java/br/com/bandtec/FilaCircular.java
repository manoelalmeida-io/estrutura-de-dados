package br.com.bandtec;

public class FilaCircular {
  int tamanho;
  String[] fila;
  int inicio;
  int fim;

  public FilaCircular(int capacidade) {
    this.tamanho = 0;
    this.fila = new String[capacidade];
    this.inicio = 0;
    this.fim = 0;
  }

  public boolean isEmpty() {
    return tamanho == 0;
  }

  public boolean isFull() {
    return tamanho == fila.length;
  }

  public void insert(String info) {
    if (tamanho < fila.length) {
      fila[fim] = info;
      fim = (fim + 1) % fila.length;
      tamanho++;
    } else {
      System.out.println("Fila cheia!");
    }
  }

  public String peek() {
    return fila[inicio];
  }

  public String poll() {
    if (this.isEmpty()) return null;

    String info = fila[inicio];
    inicio = (inicio + 1) % fila.length;
    tamanho--;

    return info;
  }

  public void exibe() {
    if (this.isEmpty()) {
      System.out.println("Fila vazia!");
      return;
    }

    System.out.print("[");
    for (int i = 0; i < tamanho; i++) {
      System.out.print(fila[(inicio + i) % fila.length] + (i < tamanho - 1 ? ", " : ""));
    }
    System.out.println("]");
  }
}
