package br.com.bandtec;

public class Pilha {
  Integer topo;
  Integer[] pilha;

  public Pilha(int tamanho) {
    this.topo = -1;
    this.pilha = new Integer[tamanho];
  }

  public boolean isEmpty() {
    return this.topo.equals(-1);
  }

  public boolean isFull() {
    return this.topo.equals(pilha.length - 1);
  }

  public void push(int info) {
    if (!isFull())
      this.pilha[++this.topo] = info;
    else
      System.out.println("Pilha cheia");
  }

  public Integer pop() {
    return this.isEmpty() ? null : this.pilha[this.topo--];
  }

  public Integer peek() {
    return this.isEmpty() ? null : this.pilha[this.topo];
  }

  public void exibe() {
    if (this.isEmpty()) {
      System.out.println("[]");
    } else {
      System.out.print("[");
      for (int i = 0; i <= this.topo; i++) {
        System.out.print(this.pilha[i] + (i == this.topo ? "" : ", "));   
      }
      System.out.println("]");
    }
  }
}
