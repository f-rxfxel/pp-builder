package atv2_pp_abstract_factory;

public class Cafeteira implements Eletrodomestico {
  public void produtoEscolhido() {
    System.out.println("Cafeteira");
  }

  public void funcaoProduto() {
    System.out.println("Ligar cafeteira");
  }
}
