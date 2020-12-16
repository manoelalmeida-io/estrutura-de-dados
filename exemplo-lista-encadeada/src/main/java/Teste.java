public class Teste {

  public static void main(String[] args) {
    ListaLigada<Integer> listaLigada = new ListaLigada<>();

    listaLigada.insereNode(1);
    listaLigada.insereNode(4);
    listaLigada.insereNode(28);

    listaLigada.exibe();

    System.out.println("Buscando valor 4");
    System.out.println("Resultado: " + listaLigada.buscaNode(4) + "\n");

    System.out.println("Buscando valor 2");
    System.out.println("Resultado: " + listaLigada.buscaNode(2) + "\n");

    System.out.println("Removendo valor 28");
    System.out.println("Resultado: " + listaLigada.removeNode(28));
    listaLigada.exibe();
    System.out.println();

    System.out.println("Removendo valor 66");
    System.out.println("Resultado: " + listaLigada.removeNode(66));
    listaLigada.exibe();
    System.out.println();
  }
}
