public class Servico implements Vendavel {

  private Integer codigo;
  private String descricao;
  private Integer quantHoras;
  private Double valorHora;

  public Servico(Integer codigo, String descricao, Integer quantHoras, Double valorHora) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.quantHoras = quantHoras;
    this.valorHora = valorHora;
  }

  public Double getValorVenda() {
    return quantHoras * valorHora;
  }

  @Override
  public String toString() {
    return "Servico{\n" +
        "\tcodigo=" + codigo + ",\n" +
        "\tdescricao='" + descricao + '\'' + ",\n" +
        "\tquantHoras=" + quantHoras + ",\n" +
        "\tvalorHora=" + valorHora + "\n" +
        '}';
  }
}
