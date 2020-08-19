public class Alimento extends Produto {

  private Integer quantVitamina;

  public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
    super(codigo, descricao, preco);
    this.quantVitamina = quantVitamina;
  }

  public Double getValorTributo() {
    return this.getPreco() * 0.15;
  }

  @Override
  public String toString() {
    return "Alimento{" +
        super.toString() +
        ", quantVitamina=" + quantVitamina +
        ", imposto=" + String.format("R$%.2f", getValorTributo()) +
        '}';
  }
}
