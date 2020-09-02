import java.util.Scanner;

public class Questao03 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "° valor: ");
      numeros[i] = leitor.nextInt();
    }

    int soma = 0;

    for (int i = 0; i < 10; i++) {
      soma += numeros[i];
    }

    System.out.printf("Média: %.2f", (soma / 10.0));
  }
}
