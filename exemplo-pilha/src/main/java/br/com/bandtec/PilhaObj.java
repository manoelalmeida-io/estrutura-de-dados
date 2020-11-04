package br.com.bandtec;

public class PilhaObj<T> {
  int topo;
  T[] pilha;

  public PilhaObj(int tamanho) {
    topo = -1;
    pilha = (T[]) new Object[tamanho];
  }

  public boolean isEmpty() {
    return this.topo == -1;
  }

  public boolean isFull() {
    return this.topo == (pilha.length - 1);
  }

  public void push(T info) {
    if (!isFull())
      this.pilha[++this.topo] = info;
    else
      System.out.println("Pilha cheia");
  }

  public T pop() {
    return this.isEmpty() ? null : this.pilha[this.topo--];
  }

  public T peek() {
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
