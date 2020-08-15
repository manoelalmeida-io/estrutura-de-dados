public class Main {

  public static void main(String[] args) {

    Engenheiro engenheiro = new Engenheiro("1", "Cidadão não...", 5000.0);
    Vendedor vendedor = new Vendedor("2", "Herbert Richards", 50000.0, 0.12);
    Horista horista = new Horista("3", "Ricardo Eletro", 6, 300.0);

    System.out.println(engenheiro);
    System.out.println(vendedor);
    System.out.println(horista);

    Empresa empresa = new Empresa();
    empresa.adicionaFunc(engenheiro);
    empresa.adicionaFunc(vendedor);
    empresa.adicionaFunc(horista);

    empresa.exibeTodos();
    empresa.exibeTotalSalario();
    empresa.exibeHoristas();
  }
}
