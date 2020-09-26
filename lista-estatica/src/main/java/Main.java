public class Main {

  public static void main(String[] args) {
    ListaEstatica lista = new ListaEstatica(5);
    System.out.println(lista.adiciona(6));
    System.out.println(lista.adiciona(9));

    System.out.println("Tamanho: " + lista.getTamanho());

    System.out.println(lista.adiciona(3));
    System.out.println(lista.adiciona(10));
    System.out.println(lista.adiciona(6));
    System.out.println(lista.adiciona(9));

    lista.exibe();
    System.out.println(lista.getElemento(9));
    System.out.println("Tamanho: " + lista.getTamanho());

    System.out.println(lista.removePeloIndice(0));
    System.out.println(lista.removePeloIndice(6));
    lista.exibe();

    System.out.println(lista.removeElemento(10));
    lista.exibe();

    System.out.println(lista.adicionaNoInicio(18));
    lista.exibe();
    System.out.println(lista.adicionaNoInicio(2));
    lista.exibe();
    System.out.println(lista.adicionaNoInicio(10));
    lista.exibe();

    System.out.println(lista.substituir(0, 18));
    lista.exibe();
    System.out.println(lista.substituir(10, 42));
    lista.exibe();

    System.out.println(lista.contarOcorrencias(18));
    System.out.println(lista.contarOcorrencias(0));

    lista.limpar();
    lista.exibe();
  }
}
