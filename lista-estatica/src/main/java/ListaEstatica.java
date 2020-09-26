public class ListaEstatica {

  private int[] vetor;
  private int nroElem; // representa a quantidade de elementos realmente inserida no vetor

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

  public boolean adicionaNoInicio(int elemento) {
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

  public boolean substitui(int indice, int valor) {
    if (indice > nroElem || indice < 0) {
      return false;
    }

    vetor[indice] = valor;
    return true;
  }

  public int contaOcorrencias(int elemento) {
    int contador = 0;
    for (int i = 0; i < nroElem; i++) {
      contador += vetor[i] == elemento ? 1 : 0;
    }
    return contador;
  }

  public void exibe() {
    System.out.print("[");
    for (int i = 0; i < nroElem; i++) {
      System.out.print(vetor[i] + (i < (nroElem - 1) ? ", " : ""));
    }
    System.out.println("]");
  }

  public int getTamanho() {
    return nroElem;
  }

  public int getElemento(int elemento) {
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
    return this.removePeloIndice(this.getElemento(elemento));
  }

  public void limpar() {
    nroElem = 0;
  }
}
