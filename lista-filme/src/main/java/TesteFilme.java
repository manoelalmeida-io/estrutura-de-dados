import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TesteFilme {

  public static void main(String[] args) {
    ListaObj<Filme> lista = new ListaObj<Filme>(10);

    Scanner leitor = new Scanner(System.in);
    Scanner leitorLinha = new Scanner(System.in);
    boolean sair = false;

    while (!sair) {
      System.out.println("\n1. Adicionar um filme");
      System.out.println("2. Exibir a lista");
      System.out.println("3. Grava a lista em arquivo CSV");
      System.out.println("4. Ler e exibir um arquivo CSV");
      System.out.println("5. Gravar por gênero");
      System.out.println("6. Sair");

      System.out.print("\nDigite a opção desejada: ");

      switch (leitor.nextInt()) {
        case 1:
          Filme filme = new Filme();
          System.out.print("Digite o id do filme: ");
          filme.setIdFilme(leitor.nextInt());
          System.out.print("Digite o nome do filme: ");
          filme.setNome(leitorLinha.nextLine());
          System.out.print("Digite a nota do filme: ");
          filme.setNota(leitor.nextDouble());
          System.out.print("Digite o gênero do filme: ");
          filme.setGenero(leitorLinha.nextLine());
          System.out.print("Digite a idade mínima do filme: ");
          filme.setIdade(leitor.nextInt());

          lista.adiciona(filme);
          break;
        case 2:
          if (lista.getTamanho() == 0) {
            System.out.println("Lista vazia");
          } else {
            lista.exibe();
          }
          break;
        case 3:
          if (lista.getTamanho() == 0) {
            System.out.println("Lista vazia. Não há nada a gravar");
          } else {
            gravaLista(lista, "filme");
            lista.limpar();
          }
          break;
        case 4:
          System.out.print("Digite o nome do arquivo: ");
          leExibeArquivo(leitor.next());
          break;
        case 5:
          if (lista.getTamanho() == 0) {
            System.out.println("Lista vazia. Não há nada a gravar");
          }
          System.out.print("Digite o nome do arquivo: ");
          String nomeArquivo = leitor.next();
          System.out.print("Gênero desejado: ");
          String genero = leitor.next();

          ListaObj<Filme> listaGenero = listaGenero(lista, genero);
          if (listaGenero.getTamanho() == 0) {
            System.out.println("Não há filmes deste gênero na lista");
          }

          gravaLista(listaGenero, nomeArquivo);
          lista.limpar();
          break;
        case 6:
          sair = true;
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }
    }
  }

  public static ListaObj<Filme> listaGenero(ListaObj<Filme> lista, String genero) {
    ListaObj<Filme> retorno = new ListaObj<Filme>(10);

    for (int i = 0; i < lista.getTamanho(); i++) {
      Filme filme = lista.getElemento(i);
      if (filme.getGenero().equals(genero)) {
        retorno.adiciona(filme);
      }
    }

    return retorno;
  }

  public static void leExibeArquivo(String nomeArquivo) {
    FileReader arq = null;
    Scanner entrada = null;
    boolean deuRuim = false;

    try {
      arq = new FileReader((nomeArquivo + ".csv"));
      entrada = new Scanner(arq).useDelimiter(";|\\r\\n");
    } catch (FileNotFoundException erro) {
      System.err.println("Arquivo não encontrado");
      System.exit(1);
    }

    try {
      System.out.printf("%-8s%-20s%-10s%-15s%-5s\n", "ID", "NOME", "NOTA", "GENERO", "IDADE");

      while(entrada.hasNextLine()) {
        int id = entrada.nextInt();
        String nome = entrada.next();
        double nota = entrada.nextDouble();
        String genero = entrada.next();
        int idade = entrada.nextInt();

        System.out.printf("%-8d%-20s%-10.2f%-15s%-5d\n", id, nome, nota, genero, idade);
      }
    } catch (NoSuchElementException erro) {
      System.err.println("Arquivo com problemas");
      deuRuim = true;
    } catch (IllegalStateException erro) {
      System.err.println("Erro na leitura do arquivo");
      deuRuim = true;
    } finally {
      entrada.close();
      try {
        arq.close();
      } catch (IOException erro) {
        System.err.println("Erro ao fechar arquivo");
        deuRuim = true;
      }
      if (deuRuim) {
        System.exit(1);
      }
    }
  }

  public static void gravaLista(ListaObj<Filme> lista, String nomeArquivo) {
    FileWriter arq = null;
    Formatter saida = null;
    boolean deuRuim = false;

    try {
      arq = new FileWriter((nomeArquivo + ".csv"), true);
      saida = new Formatter(arq);
    } catch (IOException erro) {
      System.err.println("Erro ao abrir o arquivo");
      System.exit(1);
    }

    try {
      for (int i = 0; i < lista.getTamanho(); i++) {
        Filme f = lista.getElemento(i);

        saida.format("%d;%s;%.2f;%s;%d", f.getIdFilme(), f.getNome(), f.getNota(), f.getGenero(), f.getIdade());
      }
    } catch (FormatterClosedException erro) {
      System.err.println("Erro ao gravar arquivo");
      deuRuim = true;
    } finally {
      saida.close();
      try {
        arq.close();
      } catch (IOException erro) {
        System.err.println("Erro ao fechar arquivo");
        deuRuim = true;
      }
      if (deuRuim) {
        System.exit(1);
      }
    }
  }
}
