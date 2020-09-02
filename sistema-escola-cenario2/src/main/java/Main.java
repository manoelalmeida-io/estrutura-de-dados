/**
 * CENÁRIO 02
 * Coordenador deve dar aula.
 */
public class Main {

  /**
   * Questões:
   *
   * Qual seria a melhor forma? Classe abstrata ou interface?
   * R: Como o coordenador obrigatoriamente também deve ser um professor a classe coordenador já
   * irá herdar todos os atributos e métodos da classe professor então para obrigar ambas as classes
   * a implementar o método getValorBonus basta utilizar uma interface Bonificavel que contém este
   * método.
   *
   * É necessário ter 2 list ou apenas 1?
   * R: Apenas um liste que recebe uma instância de uma classe que implementa a interface
   * Bonificavel.
   *
   * O polimorfismo está presente no sistema?
   * R: Sim, o método getValorBonus é sobrescrito na classe Coordenador fazendo com que ele assuma
   * diversos comportamentos. O método toString também possui uma implementação diferente de acordo
   * com a classe onde está contido
   *
   * */

  public static void main(String[] args) {

    Professor jorge = new Professor("Jorge", 3, 200.0);
    Professor carlos = new Professor("Carlos", 5, 150.0);

    Coordenador pedro = new Coordenador("Pedro", 1, 200.0, 4, 300.0);
    Coordenador maria = new Coordenador("Maria", 2, 300.0, 3, 350.0);

    ControleBonus controleBonus = new ControleBonus();
    controleBonus.adicionaFuncionario(jorge);
    controleBonus.adicionaFuncionario(carlos);
    controleBonus.adicionaFuncionario(pedro);
    controleBonus.adicionaFuncionario(maria);

    controleBonus.exibirFuncionarios();
    System.out.printf("\nTotal de bônus: R$%.2f\n", controleBonus.calcularTotalBonus());
  }
}
