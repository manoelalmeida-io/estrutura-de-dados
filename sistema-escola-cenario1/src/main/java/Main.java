/**
 * CENÁRIO 01
 * Coordenador não deve dar aula e professor não deve coordenar.
 */
public class Main {

  /**
   * Questões:
   *
   * Qual seria a melhor forma? Classe abstrata ou interface?
   * R: Como coordenador e professor não possuem relação de herança entre eles e também possuem
   * atributos em comum, é possível criar uma super classe abstrata que possui o método de cálculo
   * de bônus e também os atributos em comum como nome e valor da hora.
   *
   * É necessário ter 2 list ou apenas 1?
   * R: Apenas um liste que recebe uma instância de uma classe que herda da classe
   * FuncionarioBonificavel
   *
   * O polimorfismo está presente no sistema?
   * R: Sim, o método getValorBonus possui diversos comportamentos de acordo com o tipo de
   * funcionário em que ele está contido. E também o método toString que mostra os atributos de
   * acordo com a classe onde ele está presente.
   *
   * */

  public static void main(String[] args) {

    Professor jorge = new Professor("Jorge", 200.0, 3);
    Professor carlos = new Professor("Carlos", 150.0, 5);

    Coordenador pedro = new Coordenador("Pedro", 300.0, 4 );
    Coordenador maria = new Coordenador("Maria", 350.0, 3);

    ControleBonus controleBonus = new ControleBonus();
    controleBonus.adicionaFuncionario(jorge);
    controleBonus.adicionaFuncionario(carlos);
    controleBonus.adicionaFuncionario(pedro);
    controleBonus.adicionaFuncionario(maria);

    controleBonus.exibirFuncionarios();
    System.out.printf("\nTotal de bônus: R$%.2f\n", controleBonus.calcularTotalBonus());
  }
}
