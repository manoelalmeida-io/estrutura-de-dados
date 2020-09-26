public class ListaObj <T> {

  private T[] vetor;
  private int nroElem;

  public ListaObj(int tamanho) {
    vetor = (T[]) new Object[tamanho];
    nroElem = 0;
  }

  public boolean adiciona(T valor) {
    if (nroElem < vetor.length) {
      vetor[nroElem++] = valor;
      return true;
    }
    return false;
  }

  public boolean adicionaNoInicio(T elemento) {
    if (nroElem < vetor.length) {
      for (int i = nroElem; i > 0; i--) {
        vetor[i] = vetor[i - 1];
      }
      vetor[0] = elemento;
      nroElem++;

      return true;
    }

    return false;
  }

  public void exibe() {
    System.out.print("[");
    for (int i = 0; i < nroElem; i++) {
      System.out.print(vetor[i] + (i < (nroElem - 1) ? ", " : ""));
    }
    System.out.println("]");
  }

  public int busca(T elemento) {
    for (int i = 0; i < nroElem; i++) {
      if (vetor[i].equals(elemento)) {
        return i;
      }
    }
    return -1;
  }

  public boolean removePeloIndice(int indice) {
    if (indice > nroElem || indice < 0) {
      return false;
    }

    for (int i = indice; i < nroElem - 1; i++) {
      vetor[i] = vetor[i + 1];
    }

    nroElem--;
    return true;
  }

  public boolean removeElemento(T elemento) {
    return this.removePeloIndice(this.busca(elemento));
  }

  public void limpar() {
    nroElem = 0;
  }
}
