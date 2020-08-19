public abstract class Produto implements Vendavel {

  private Integer codigo;
  private Double precoCusto;

  public Produto(Integer codigo, Double precoCusto) {
    this.codigo = codigo;
    this.precoCusto = precoCusto;
  }

  @Override
  public String toString() {
    return "Produto{\n" +
        "\t\tcodigo=" + codigo + ",\n" +
        "\t\tprecoCusto=" + precoCusto + "\n" +
        "\t\tprecoVenda=" + this.getValorVenda() + "\n" +
        "\t" + '}';
  }

  public Double getPrecoCusto() {
    return precoCusto;
  }
}
