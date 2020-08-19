import java.util.ArrayList;
import java.util.List;

public class Carrinho {

  private List<Vendavel> itens;

  public Carrinho() {
    this.itens = new ArrayList<Vendavel>();
  }

  public void adicionaVendavel(Vendavel v) {
    this.itens.add(v);
  }

  public Double calculaTotalVenda() {
    Double total = 0.0;

    for (Vendavel item : itens) {
      total += item.getValorVenda();
    }

    return total;
  }

  public void exibeItensCarrinho() {
    if (itens.isEmpty()) {
      System.out.println("\nSeu carrinho ainda está vazio");
    } else {
      System.out.println("\nItens do carrinho:");

      for (Vendavel item : itens) {
        System.out.println(item);
      }
    }
  }
}
