import java.util.Scanner;

public class Questao01 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[7];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite o " + (i + 1) + "° valor: ");
      numeros[i] = leitor.nextInt();
    }

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("numeros[" + i + "]=" + numeros[i] + "\t");
    }

    System.out.println();

    for (int i = numeros.length; i > 0; i--) {
      System.out.print("numeros[" + (i - 1) + "]=" + numeros[i - 1] + "\t");
    }
  }
}
