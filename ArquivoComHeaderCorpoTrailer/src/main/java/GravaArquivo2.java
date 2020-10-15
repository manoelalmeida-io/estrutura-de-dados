import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GravaArquivo2 {

  public static void main(String[] args) {
    String nomeArq = "ArquivoNotas2.txt";
    Integer contador = 0;
    Boolean sair = false;

    String header = "";
    String corpo = "";
    String trailer = "";

    Scanner leitor = new Scanner(System.in);
    Scanner leitorLinha = new Scanner(System.in);

    Date dataDeHoje = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    header += "00NOTA20202";
    header += formatter.format(dataDeHoje);
    header += "01";

    gravaRegistro(nomeArq, header, true);

    while(!sair) {
      System.out.println("\n1. Adicionar um aluno");
      System.out.println("2. Sair");

      System.out.print("\nDigite uma opção: ");

      switch (leitor.nextInt()) {
        case 1:
          corpo = "02";

          System.out.print("Digite o curso: ");
          corpo += String.format("%-5s", leitor.next());

          System.out.print("Digite o RA do aluno: ");
          corpo += leitor.next();

          System.out.print("Digite o nome do aluno: ");
          corpo += String.format("%-50s", leitorLinha.nextLine());

          System.out.print("Digite o nome da disciplina: ");
          corpo += String.format("%-40s", leitorLinha.nextLine());

          System.out.print("Digite a nota do aluno: ");
          corpo += String.format("%05.2f", leitor.nextDouble());

          System.out.print("Digite a quantidade de faltas do aluno: ");
          corpo += String.format("%03d", leitor.nextInt());

          contador++;
          gravaRegistro(nomeArq, corpo, false);
          break;
        case 2:
          sair = true;
          break;
        default:
          System.out.println("\nDigite uma opção válida");
          break;
      }
    }

    // monta o trailer
    trailer += "01";
    trailer += String.format("%010d", contador);
    gravaRegistro(nomeArq, trailer, false);
  }

  public static void gravaRegistro(String nomeArq, String registro, boolean novo) {
    BufferedWriter saida = null;

    try {
      if (novo) {
        saida = new BufferedWriter(new FileWriter(nomeArq, false));
      } else {
        saida = new BufferedWriter(new FileWriter(nomeArq, true));
      }
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
    }

    try {
      saida.append(registro + "\n");
      saida.close();
    } catch (IOException e) {
      System.err.printf("Erro ao gravar arquivo: %s.\n", e.getMessage());
    }
  }
}
