public class ListaObj <T> {

  private T[] vetor;      // vetor onde será armazenado os elementos da lista
  private int nroElem;    // representa a quantidade de elementos da lista e tb

  public ListaObj(int tamanho) {
    vetor = (T[]) new Object[tamanho];  // Cria o vetor com o tamanho máximo recebido
    nroElem = 0;                        // Zera o número de elementos
  }

  // Adiciona um elemento no final da lista
  public boolean adiciona(T valor) {
    if (nroElem >= vetor.length) {        // Verifica se a lista está cheia
      System.out.println("Lista está cheia");
      return false;
    }

    // Se não está, coloca o valor no vetor e incrementa o nroElem
    vetor[nroElem++] = valor;
    return true;
  }

  // Adiciona um elemento no inicio da lista
  public boolean adicionaNoInicio(T elemento) {
    if (nroElem >= vetor.length) {          // Verifica se a lista está cheia
      return false;
    }

    for (int i = nroElem; i > 0; i--) {     // Percorre a lista de tras pra frente
      vetor[i] = vetor[i - 1];              // Desloca o elemento uma casa pra frente
    }
    vetor[0] = elemento;                    // Adiciona o elemento no indice zero
    nroElem++;                              // Incrementa o nroElem

    return true;
  }

  public void exibe() {
    System.out.println("[");
    for (int i = 0; i < nroElem; i++) {
      System.out.println("\t" + vetor[i] + (i < (nroElem - 1) ? "," : ""));
    }
    System.out.println("]");
  }

  public int getTamanho() {
    return nroElem;
  }

  public T getElemento(int indice) {
    if (indice < 0 || indice >= nroElem) {
      return null;
    }
    return vetor[indice];
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
