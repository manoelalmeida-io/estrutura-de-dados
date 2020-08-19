public class Perfume extends Produto {

  private String fragrancia;

  public Perfume(Integer codigo, String descricao, Double preco, String fragrancia) {
    super(codigo, descricao, preco);
    this.fragrancia = fragrancia;
  }

  public Double getValorTributo() {
    return this.getPreco() * 0.27;
  }

  @Override
  public String toString() {
    return "Perfume{" +
        super.toString() +
        ", fragrancia='" + fragrancia + '\'' +
        ", imposto=" + String.format("R$%.2f", getValorTributo()) +
        '}';
  }
}
