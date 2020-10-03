import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteListaAlunoGrava {

  public static void main(String[] args) {
    boolean fim = false;
    Scanner leitor = new Scanner(System.in);

    ListaObj<Aluno> lista = new ListaObj<Aluno>(10);

    while(!fim) {
      System.out.println("\n1. Adicionar Aluno");
      System.out.println("2. Exibir a lista");
      System.out.println("3. Exibir um aluno da lista");
      System.out.println("4. Gravar a lista em um arquivo txt");
      System.out.println("5. Gravar a lista em um arquivo csv");
      System.out.println("6. Ler e exibir arquivo txt");
      System.out.println("7. Ler e exibir arquivo csv");
      System.out.println("8. Fim");
      System.out.print("\nDigite uma opção: ");

      int opcao = leitor.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o ra do aluno: ");
          int ra = leitor.nextInt();
          System.out.print("Digite o nome do aluno: ");
          String nome = leitor.next();
          System.out.print("Digite a nota do aluno: ");
          double nota = leitor.nextDouble();

          lista.adiciona(new Aluno(ra, nome, nota));
          break;
        case 2:
          if (lista.getTamanho() == 0) {
            System.out.println("Lista vazia");
          } else {
            lista.exibe();
          }
          break;
        case 3:
          System.out.print("Digite o índice do aluno: ");
          Aluno aluno = lista.getElemento(leitor.nextInt());
          if (aluno == null) {
            System.out.println("Índice inválido");
          } else {
            System.out.println(aluno);
          }
          break;
        case 4:
          if (lista.getTamanho() == 0) {
            System.out.println("Lista vazia. Não há o que gravar");
          } else {
            gravaLista(lista, false);
            lista.limpar();
          }
          break;
        case 5:
          if (lista.getTamanho() == 0) {
            System.out.println("Lista vazia. Não há o que gravar");
          } else {
            gravaLista(lista, true);
            lista.limpar();
          }
          break;
        case 6:
          leExibeArquivo(false);
          break;
        case 7:
          leExibeArquivo(true);
          break;
        case 8:
          fim = true;
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }
  }

  public static void gravaLista(ListaObj<Aluno> lista, boolean isCSV) {
    FileWriter arq = null;
    Formatter saida = null;
    boolean deuRuim = false;
    String nomeArquivo;

    if (isCSV) {
      nomeArquivo = "aluno.csv";
    } else {
      nomeArquivo = "aluno.txt";
    }

    try {
      arq = new FileWriter(nomeArquivo, true);
      saida = new Formatter(arq);
    }
    catch (IOException erro) {
      System.err.println("Erro ao abrir arquivo");
      System.exit(1);
    }

    try {
      for (int i = 0; i < lista.getTamanho(); i++) {
        Aluno a = lista.getElemento(i);

        if (isCSV) {
          saida.format("%d;%s;%.2f%n", a.getRa(), a.getNome(), a.getNota());
        } else {
          saida.format("%d %s %.2f%n", a.getRa(), a.getNome(), a.getNota());
        }
      }
    }
    catch (FormatterClosedException erro) {
      System.err.println("Erro ao gravar no arquivo");
      deuRuim = true;
    }
    finally {
      saida.close();
      try {
        arq.close();
      }
      catch (IOException erro) {
        System.err.println("Erro ao fechar arquivo");
        deuRuim = true;
      }

      if (deuRuim) {
        System.exit(1);
      }
    }
  }

  public static void leExibeArquivo(boolean isCSV) {
    FileReader arq = null;
    Scanner entrada = null;
    String nomeArquivo;
    boolean deuRuim = false;

    if (isCSV) {
      nomeArquivo = "aluno.csv";
    } else {
      nomeArquivo = "aluno.txt";
    }

    try {
      arq = new FileReader(nomeArquivo);
      if (isCSV) {
        entrada = new Scanner(arq).useDelimiter(";|\\r\\n");
      } else {
        entrada = new Scanner(arq);
      }
    } catch (FileNotFoundException erro) {
      System.err.println("Arquivo não encontrado");
      System.exit(1);
    }

    try {
      System.out.printf("%-8s%-10s%7s\n", "RA", "NOME", "NOTA");

      while (entrada.hasNext()) {
        int ra = entrada.nextInt();
        String nome = entrada.next();
        double nota = entrada.nextDouble();
        System.out.printf("%-8d%-10s%7.2f\n", ra, nome, nota);
      }
    }
    catch (NoSuchElementException erro) {
      System.err.println("Arquivo com problemas");
      deuRuim = true;
    }
    catch (IllegalStateException erro) {
      System.err.println("Erro na leitura do arquivo");
      deuRuim = true;
    }
    finally {
      entrada.close();
      try {
        arq.close();
      }
      catch (IOException erro) {
        System.err.println("Erro ao fechar arquivo");
        deuRuim = true;
      }

      if (deuRuim) {
        System.exit(1);
      }
    }
  }
}
