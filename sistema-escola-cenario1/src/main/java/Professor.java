public class Professor extends FuncionarioBonificavel {

  private final Integer aulasPorSemana;

  public Professor(String nome, Double valorHora, Integer aulasPorSemana) {
    super(nome, valorHora);
    this.aulasPorSemana = aulasPorSemana;
  }

  public Double getValorBonus() {
    return this.aulasPorSemana * this.getValorHora() * 4.5 * 0.15;
  }

  @Override
  public String toString() {
    return "Professor{" +
        super.toString() +
        ", aulasPorSemana=" + aulasPorSemana +
        '}';
  }
}
