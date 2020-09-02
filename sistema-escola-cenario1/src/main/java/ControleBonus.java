import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

  private final List<FuncionarioBonificavel> funcionarios;

  public ControleBonus() {
    this.funcionarios = new ArrayList<FuncionarioBonificavel>();
  }

  public void adicionaFuncionario(FuncionarioBonificavel b) {
    this.funcionarios.add(b);
  }

  public void exibirFuncionarios() {
    System.out.println("Todos os funcionários bonificáveis");

    for (FuncionarioBonificavel funcionario : funcionarios) {
      System.out.println(funcionario);
    }
  }

  public Double calcularTotalBonus() {
    Double total = 0.0;

    for (FuncionarioBonificavel funcionario : funcionarios) {
      total += funcionario.getValorBonus();
    }

    return total;
  }
}
