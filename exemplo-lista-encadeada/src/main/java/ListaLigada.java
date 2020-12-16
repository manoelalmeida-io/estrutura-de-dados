public class ListaLigada <T> {

  private final Node<T> head;

  public ListaLigada() {
    this.head = new Node<>(null);
  }

  public void insereNode(T valor) {
    Node<T> novo = new Node<>(valor);
    novo.setNext(head.getNext());
    head.setNext(novo);
  }

  public void exibe() {
    Node atual = head.getNext();
    System.out.print("[");
    while (atual != null) {
      System.out.print(("" + atual.getInfo()));
      System.out.print(atual.getNext() == null ? "" : ", ");
      atual = atual.getNext();
    }
    System.out.println("]");
  }

  public Node buscaNode(T valor) {
    Node atual = head.getNext();
    while (atual != null) {
      if (atual.getInfo() == valor) {
        return atual;
      }
      atual = atual.getNext();
    }
    return null;
  }

  public boolean removeNode(T valor) {
    Node ant = head;
    Node atual = head.getNext();

    while (atual != null) {
      if (atual.getInfo() == valor) {
        ant.setNext(atual.getNext());
        return true;
      }
      ant = atual;
      atual = atual.getNext();
    }
    return false;
  }

  public int getTamanho() {
    Node atual = head.getNext();
    int tam = 0;
    while (atual != null) {
      tam++;
      atual = atual.getNext();
    }
    return tam;
  }
}
