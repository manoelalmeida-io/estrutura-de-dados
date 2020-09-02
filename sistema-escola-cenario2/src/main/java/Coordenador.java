public class Coordenador extends Professor {

  private final Integer horasDeCoordenacaoPorSemana;
  private final Double valorHoraCoordenacao;

  public Coordenador(
      String nome,
      Integer aulasPorSemana,
      Double valorHoraAula,
      Integer horasDeCoordenacaoPorSemana,
      Double valorHoraCoordenacao
  ) {
    super(nome, aulasPorSemana, valorHoraAula);

    this.horasDeCoordenacaoPorSemana = horasDeCoordenacaoPorSemana;
    this.valorHoraCoordenacao = valorHoraCoordenacao;
  }

  @Override
  public Double getValorBonus() {
    return super.getValorBonus() + horasDeCoordenacaoPorSemana * valorHoraCoordenacao * 4.5 * 0.2;
  }

  @Override
  public String toString() {
    return "Coordenador{" +
        super.toString() +
        ", horasDeCoordenacaoPorSemana=" + horasDeCoordenacaoPorSemana +
        ", valorHoraCoordenacao=" + valorHoraCoordenacao +
        '}';
  }
}
