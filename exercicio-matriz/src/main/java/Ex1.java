import java.util.Scanner;

public class Ex1 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[][] matriz = new int[2][3];

    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        System.out.printf("Digite o valor da linha %d coluna %d: ", l, c);
        matriz[l][c] = leitor.nextInt();
      }
    }

    System.out.println("[");
    for (int l = 0; l < matriz.length; l++) {
      System.out.print("\t[");
      for (int c = 0; c < matriz[l].length; c++) {
        System.out.print(matriz[l][c]);
        System.out.print((c < matriz[l].length - 1) ? ", " : "");
      }
      System.out.print("]");
      System.out.println((l < matriz.length - 1) ? "," : "");
    }
    System.out.println("]");
  }
}
