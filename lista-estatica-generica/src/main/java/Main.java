public class Main {

  public static void main(String[] args) {
    ListaObj<String> lista = new ListaObj<String>(5);
    System.out.println(lista.adiciona("Feijão"));
    System.out.println(lista.adiciona("Arroz"));
    System.out.println(lista.adiciona("Batata"));
    System.out.println(lista.adiciona("Macarrão"));
    System.out.println(lista.adiciona("Coxinha"));
    System.out.println(lista.adiciona("Sanduíche"));

    lista.exibe();
    System.out.println(lista.busca("Batata"));

    System.out.println(lista.removePeloIndice(0));
    System.out.println(lista.removePeloIndice(6));
    lista.exibe();

    System.out.println(lista.removeElemento("Coxinha"));
    lista.exibe();

    System.out.println(lista.adicionaNoInicio("Mandioca"));
    lista.exibe();
    System.out.println(lista.adicionaNoInicio("Maminha"));
    lista.exibe();
    System.out.println(lista.adicionaNoInicio("Goiaba"));
    lista.exibe();

    lista.limpar();
    lista.exibe();
  }
}
