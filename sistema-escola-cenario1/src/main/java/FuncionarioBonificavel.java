public abstract class FuncionarioBonificavel {

  private String nome;
  private Double valorHora;

  public FuncionarioBonificavel(String nome, Double valorHora) {
    this.nome = nome;
    this.valorHora = valorHora;
  }

  public abstract Double getValorBonus();

  @Override
  public String toString() {
    return "FuncionarioBonificavel{" +
        "nome='" + nome + '\'' +
        ", valorHora='" + valorHora + '\'' +
        ", bonus=" + getValorBonus() +
        '}';
  }

  public Double getValorHora() {
    return valorHora;
  }
}
