import java.util.Scanner;

public class Questao06 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] diasMeses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    System.out.print("Digite o número do dia: ");
    int dia = leitor.nextInt();

    System.out.print("Digite o número do mês: ");
    int mes = leitor.nextInt();

    int diaDoAno = 0;

    for (int i = 0; i < mes - 1; i++) {
      diaDoAno += diasMeses[i];
    }

    diaDoAno += dia;

    System.out.printf("%d/%d corresponde ao dia: %d", dia, mes, diaDoAno);
  }
}
