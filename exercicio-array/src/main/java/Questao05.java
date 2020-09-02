import java.util.Scanner;

public class Questao05 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String[] modelos = new String[5];
    int[] rendimentos = new int[5];

    for (int i = 0; i < modelos.length; i++) {
      System.out.print("Digite o nome do modelo: ");
      modelos[i] = leitor.next();
      System.out.print("Digite o consumo desse modelo: ");
      rendimentos[i] = leitor.nextInt();
    }

    int maiorRendimento = 0;

    for (int i = 0; i < modelos.length; i++) {
      if (rendimentos[i] > rendimentos[maiorRendimento]) {
        maiorRendimento = i;
      }
    }

    System.out.println("Veículo com maior rendimento: " + modelos[maiorRendimento]);
  }
}
