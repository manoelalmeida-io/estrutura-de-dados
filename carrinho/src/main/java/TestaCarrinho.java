import java.util.Scanner;

public class TestaCarrinho {

  public static void main(String[] args) {

    int opcao;
    Carrinho carrinho = new Carrinho();
    Scanner leitor = new Scanner(System.in);
    Scanner leitorLinha = new Scanner(System.in);

    do {
      System.out.println("\n=============================");
      System.out.println(" Loja Compre&Compre");
      System.out.println("=============================");
      System.out.println("1. Adiciona livro");
      System.out.println("2. Adiciona DVD");
      System.out.println("3. Adiciona Servico");
      System.out.println("4. Exibir itens do carrinho");
      System.out.println("5. Exibir total de venda");
      System.out.println("6. Fim");
      System.out.println("=============================");
      System.out.print("Selecione uma opção: ");

      opcao = leitor.nextInt();

      switch (opcao) {
        case 1:
          adicionarLivro(carrinho);
          break;
        case 2:
          adicionarDVD(carrinho);
          break;
        case 3:
          adicionarServico(carrinho);
          break;
        case 4:
          exibirItensCarrinho(carrinho);
          break;
        case 5:
          exibirTotalVenda(carrinho);
          break;
        case 6:
          break;
        default:
          System.out.print("Opção inválida (pressione enter para continuar)");
          leitorLinha.nextLine();
          break;
      }

    } while(opcao != 6);

    System.out.println("\nNossa loja agradece a sua preferência!");
    System.out.println("Fim do programa");
  }

  public static void adicionarLivro(Carrinho carrinho) {
    int codigo;
    double precoCusto;
    String nome, autor, isbn;

    Scanner leitor = new Scanner(System.in);
    Scanner leitorLinha = new Scanner(System.in);

    System.out.println("\nAdicionar livro:");

    System.out.print("Código: ");
    codigo = leitor.nextInt();

    System.out.print("Nome: ");
    nome = leitorLinha.nextLine();

    System.out.print("Preço de custo: ");
    precoCusto = leitor.nextDouble();

    System.out.print("Autor: ");
    autor = leitorLinha.nextLine();

    System.out.print("ISBN: ");
    isbn = leitorLinha.nextLine();

    Livro novoLivro = new Livro(codigo, precoCusto, nome, autor, isbn);
    carrinho.adicionaVendavel(novoLivro);

    System.out.print("Livro adicionado com sucesso! (pressione enter para continuar)");
    leitorLinha.nextLine();
  }

  public static void adicionarDVD(Carrinho carrinho) {
    int codigo;
    double precoCusto;
    String nome, gravadora;

    Scanner leitor = new Scanner(System.in);
    Scanner leitorLinha = new Scanner(System.in);

    System.out.println("\nAdicionar livro:");

    System.out.print("Código: ");
    codigo = leitor.nextInt();

    System.out.print("Nome: ");
    nome = leitorLinha.nextLine();

    System.out.print("Preço de custo: ");
    precoCusto = leitor.nextDouble();

    System.out.print("Gravadora: ");
    gravadora = leitorLinha.nextLine();

    DVD novoDVD = new DVD(codigo, precoCusto, nome, gravadora);
    carrinho.adicionaVendavel(novoDVD);

    System.out.print("DVD adicionado com sucesso! (pressione enter para continuar)");
    leitorLinha.nextLine();
  }

  public static void adicionarServico(Carrinho carrinho) {
    int codigo, quantHoras;
    double valorHora;
    String descricao;

    Scanner leitor = new Scanner(System.in);
    Scanner leitorLinha = new Scanner(System.in);

    System.out.println("\nAdicionar livro:");

    System.out.print("Código: ");
    codigo = leitor.nextInt();

    System.out.print("Descrição: ");
    descricao = leitorLinha.nextLine();

    System.out.print("Quantidade de horas: ");
    quantHoras = leitor.nextInt();

    System.out.print("Valor da hora: ");
    valorHora = leitor.nextDouble();

    Servico servico = new Servico(codigo, descricao, quantHoras, valorHora);
    carrinho.adicionaVendavel(servico);

    System.out.print("Serviço adicionado com sucesso! (pressione enter para continuar)");
    leitorLinha.nextLine();
  }

  public static void exibirItensCarrinho(Carrinho carrinho) {
    Scanner leitorLinha = new Scanner(System.in);

    carrinho.exibeItensCarrinho();
    System.out.print("Pressione enter para continuar");

    leitorLinha.nextLine();
  }

  public static void exibirTotalVenda(Carrinho carrinho) {
    Scanner leitorLinha = new Scanner(System.in);

    System.out.printf("Total da venda: R$%.2f\n", carrinho.calculaTotalVenda());
    System.out.print("\nPressione enter para continuar");

    leitorLinha.nextLine();
  }
}
