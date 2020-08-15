import java.util.ArrayList;
import java.util.List;

public class Empresa {

  private List<Funcionario> funcionarios;

  public Empresa() {
    this.funcionarios = new ArrayList<Funcionario>();
  }

  public void adicionaFunc(Funcionario f) {
    funcionarios.add(f);
  }

  public void exibeTodos() {
    funcionarios.forEach(System.out::println);
  }

  public void exibeTotalSalario() {
    var salario = funcionarios.stream()
        .map(Funcionario::calcSalario)
        .reduce(Double::sum)
        .orElse(0.0);

    System.out.printf("R$%.2f\n", salario);
  }

  public void exibeHoristas() {
    funcionarios.stream()
        .filter(funcionario -> funcionario instanceof Horista)
        .forEach(System.out::println);
  }
}
