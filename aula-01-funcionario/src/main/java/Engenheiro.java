public class Engenheiro extends Funcionario {

  private Double salario;

  public Engenheiro(String cpf, String nome, Double salario) {
    super(cpf, nome);
    this.salario = salario;
  }

  public Double calcSalario() {
    return salario;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Engenheiro{" +
        super.toString() +
        ", salario=" + salario +
        '}';
  }
}
