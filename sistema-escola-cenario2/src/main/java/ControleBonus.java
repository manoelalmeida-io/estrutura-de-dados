import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

  private final List<Bonificavel> funcionarios;

  public ControleBonus() {
    this.funcionarios = new ArrayList<>();
  }

  public void adicionaFuncionario(Bonificavel b) {
    this.funcionarios.add(b);
  }

  public void exibirFuncionarios() {
    System.out.println("Todos os funcionários bonificáveis");

    for (Bonificavel funcionario : funcionarios) {
      System.out.println(funcionario);
    }
  }

  public Double calcularTotalBonus() {
    Double total = 0.0;

    for (Bonificavel funcionario : funcionarios) {
      total += funcionario.getValorBonus();
    }

    return total;
  }
}
