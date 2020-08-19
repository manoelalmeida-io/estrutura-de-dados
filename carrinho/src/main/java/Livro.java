public class Livro extends Produto {

  private String nome;
  private String autor;
  private String isbn;

  public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
    super(codigo, precoCusto);
    this.nome = nome;
    this.autor = autor;
    this.isbn = isbn;
  }

  public Double getValorVenda() {
    return this.getPrecoCusto() * 1.10;
  }

  @Override
  public String toString() {
    return "Livro{\n" +
        "\tnome='" + nome + '\'' + ",\n" +
        "\t" + super.toString() + ",\n" +
        "\tautor='" + autor + '\'' + ",\n" +
        "\tisbn='" + isbn + '\'' + "\n" +
        '}';
  }
}
