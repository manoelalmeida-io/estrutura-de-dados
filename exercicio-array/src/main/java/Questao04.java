import java.util.Scanner;

public class Questao04 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "° valor: ");
      numeros[i] = leitor.nextInt();
    }

    System.out.print("Digite um número: ");
    int numero = leitor.nextInt();
    int ocorrencias = 0;

    for (int i = 0; i < 10; i++) {
      if (numeros[i] == numero) {
        ocorrencias++;
      }
    }

    if (ocorrencias > 1) {
      System.out.println("O número " + numero + " ocorre " + ocorrencias + " vezes");
    } else if (ocorrencias == 1) {
      System.out.println("O número " + numero + " ocorre " + ocorrencias + " vez");
    } else {
      System.out.println("O número " + numero + " não ocorre nenhuma vez");
    }
  }
}
