import java.util.Scanner;

public class ExemploVetor {

  public static void exibeVetor(int[] v) {
    System.out.println("Elementos do vetor");
    for (int i = 0; i < v.length; i++) {
      System.out.print("v[" + i + "]=" + v[i] + "\t");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    // Declarando um vetor de 5 elementos
    int[] vetor = new int[5];

    // Declarando um segundo vetor, já inicializado com valores
    int[] vet2 = {100, 200, 300, 400, 500, 600, 700};

    // Declarando um terceiro vetor, de String, de 4 elementos
    String[] vet3 = new String[4];

    String[] diasSemana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta" };

    // Declarando um quinto vetor, de int, cujo tamanho será digitado pelo usuário
    int[] vet5;
    int tamanho;

    // Preenchendo valores dos elementos do vetor
    // com valores digitados pelo usuário
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = i * 10;
    }

    exibeVetor(vetor);

    // Preenchendo valores dos elementos do vetor
    // com valores digitados pelo usuário
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Digite o valor de vetor[" + i + "]");
      vetor[i] = leitor.nextInt();
    }

    // Exibe os valores do vetor
    exibeVetor(vetor);

    exibeVetor(vet2);

    // Preenchendo o vet3 com valores digitados pelo usuário
    for (int i = 0; i < vet3.length; i++) {
      System.out.println("Digite o valor de vet3[" + i + "]");
      vet3[i] = leitor.next();
    }

    // Exibe o vet3 com o for aprimorado
    for (String s : vet3) {
      System.out.print(s + "\t");
    }

    System.out.println();

    // Criar um vetor de Strings, já inicializado com os dias da semana
    // (A partir de Domingo)
    // Solicitar para o usuário digitar um número, sendo que 1 é Domingo
    // 2 é segunda
    // Ficar no loop até que o usuário digite um valor válido (1 a 7)
    // Exibir o dia da semana correspondente ao número digitado pelo usuário
    boolean sair = false;

    while(!sair) {
      System.out.print("Digite um número corresponde ao dia da semana: ");
      int numero = leitor.nextInt();

      if (numero > 0 && numero < 8) {
        System.out.println(diasSemana[numero - 1]);
        sair = true;
      } else {
        System.out.println("Número inválido");
      }
    }

    // Exibir a soma dos elementos do vetor
    int soma = 0;

    for(int i = 0; i < vetor.length; i++) {
      soma += vetor[i];
    }

    System.out.println("Soma dos elementos: " + soma);

    // Exibir a quantidade dos elementos pares do vetor
    int qtd = 0;

    for (int i = 0; i < vet3.length; i++) {
      if (i % 2 == 0) {
        qtd++;
      }
    }

    System.out.println("Elementos pares: " + qtd);

    // Pedir para o usuário digitar o tamanho de vet5
    System.out.println("Digite o tamanho do vetor vet5 (maior do que zero)");
    tamanho = leitor.nextInt();
    while (tamanho <= 2) {
      System.out.println("Tamanho inválido. Digite novamente:");
      tamanho = leitor.nextInt();
    }

    // Criar o vetor vet5 com o tamanho digitado
    vet5 = new int[tamanho];

    for (int i = 0; i < vet5.length; i++) {
      System.out.println("Digite o valor de vet5[" + i + "]");
      vet5[i] = leitor.nextInt();
    }

    exibeVetor(vet5);
  }
}
