public class DVD extends Produto {

  private String nome;
  private String gravadora;

  public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
    super(codigo, precoCusto);
    this.nome = nome;
    this.gravadora = gravadora;
  }

  public Double getValorVenda() {
    return this.getPrecoCusto() * 1.20;
  }

  @Override
  public String toString() {
    return "DVD{\n" +
        "\tnome='" + nome + '\'' + ",\n" +
        "\t" + super.toString() + ",\n" +
        "\tgravadora='" + gravadora + '\'' + "\n" +
        '}';
  }
}
