import javax.swing.*;

public class ExercicioExcecao {

  public static void main(String[] args) {

    while (true) {
      String sSalario = JOptionPane.showInputDialog("Digite o valor do salário");
      if (sSalario == null) System.exit(0);

      String sReajuste = JOptionPane.showInputDialog("Digite o valor do reajuste");
      if (sReajuste == null) System.exit(0);

      try {
        double salario = Double.parseDouble(sSalario);
        int reajuste = Integer.parseInt(sReajuste);

        if (salario < 0) throw new IllegalArgumentException("O valor do salário não pode ser negativo");

        if (reajuste < 0 || reajuste > 100)
          throw new IllegalArgumentException("Valor de reajuste fora dos limites permitidos (0 a 100)");

        JOptionPane.showMessageDialog(null, "Valor do salários reajustado: " +
            (salario + (salario * reajuste / 100)), "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

      } catch (NumberFormatException erro) {
        JOptionPane.showMessageDialog(null, "Digite apenas números válidos\n" +
            erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);

      } catch (IllegalArgumentException erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
