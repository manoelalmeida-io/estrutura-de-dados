public class TestaTributo {

  public static void main(String[] args) {

    Alimento pessego = new Alimento(
        123,
        "Pêssego em calda",
        10.0,
        17
    );

    Perfume puruvudu = new Perfume(
        567,
        "Excêntrico",
        50.0,
        "amadeirado"
    );

    Servico formatarNote = new Servico("Formatação de notebook", 100.0);

    System.out.println(pessego);
    System.out.println(puruvudu);
    System.out.println(formatarNote);

    Tributo tributo = new Tributo();

    tributo.adicionaTributavel(pessego);
    tributo.adicionaTributavel(puruvudu);
    tributo.adicionaTributavel(formatarNote);

    System.out.println("");
    tributo.exibeTodos();

    System.out.println("");
    System.out.printf("Total de impostos: R$%.2f\n", tributo.calculaTotalTributo());
  }
}
