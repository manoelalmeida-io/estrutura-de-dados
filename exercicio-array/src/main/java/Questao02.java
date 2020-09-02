import java.util.Scanner;

public class Questao02 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String[] nomes = new String[10];
    boolean encontrou = false;

    for (int i = 0; i < nomes.length; i++) {
      System.out.print("Digite o nome do índice " + i + ": ");
      nomes[i] = leitor.nextLine();
    }

    System.out.print("Digite um nome: ");
    String nome = leitor.nextLine();

    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i].equals(nome)) {
        System.out.println("Nome encontrado no índice " + i);
        encontrou = true;
      }
    }

    if (!encontrou) {
      System.out.println("Nome não encontrado");
    }
  }
}
