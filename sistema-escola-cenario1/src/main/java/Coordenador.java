public class Coordenador extends FuncionarioBonificavel {

  private final Integer horasDeCoordenacaoPorSemana;

  public Coordenador(String nome, Double valorHora, Integer horasDeCoordenacaoPorSemana) {
    super(nome, valorHora);
    this.horasDeCoordenacaoPorSemana = horasDeCoordenacaoPorSemana;
  }

  public Double getValorBonus() {
    return this.horasDeCoordenacaoPorSemana * getValorHora() * 4.5 * 0.2;
  }

  @Override
  public String toString() {
    return "Coordenador{" +
        super.toString() +
        ", horasDeCoordenacaoPorSemana=" + horasDeCoordenacaoPorSemana +
        '}';
  }
}
