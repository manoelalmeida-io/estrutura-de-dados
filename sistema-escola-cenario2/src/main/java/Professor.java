public class Professor implements Bonificavel {

  private final String nome;
  private final Integer aulasPorSemana;
  private final Double valorHoraAula;

  public Professor(String nome, Integer aulasPorSemana, Double valorHoraAula) {
    this.nome = nome;
    this.aulasPorSemana = aulasPorSemana;
    this.valorHoraAula = valorHoraAula;
  }

  public Double getValorBonus() {
    return this.aulasPorSemana * this.valorHoraAula * 4.5 * 0.15;
  }

  @Override
  public String toString() {
    return "Professor{" +
        "nome='" + nome + '\'' +
        ", aulasPorSemana=" + aulasPorSemana +
        ", valorHoraAula=" + valorHoraAula +
        ", bonus=" + getValorBonus() +
        '}';
  }
}

