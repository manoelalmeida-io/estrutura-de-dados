public class ListaEstatica {

  int[] vetor;
  int nroElem; // representa a quantidade de elementos realmente inserida no vetor

  public ListaEstatica(int tamanho) {
    vetor = new int[tamanho];
    nroElem = 0;
  }

  public boolean adiciona(int elemento) {
    if (nroElem < vetor.length) {
      vetor[nroElem++] = elemento;
      return true;
    }
    return false;
  }

  public void exibe() {
    System.out.print("[");
    for (int i = 0; i < nroElem; i++) {
      System.out.print(vetor[i] + (i < (nroElem - 1) ? ", " : "]\n"));
    }
  }

  public int busca(int elemento) {
    for (int i = 0; i < nroElem; i++) {
      if (vetor[i] == elemento) {
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

  public boolean removeElemento(int elemento) {
    int indice = this.busca(elemento);

    if (indice == -1) {
      return false;
    }

    return this.removePeloIndice(indice);
  }
}
