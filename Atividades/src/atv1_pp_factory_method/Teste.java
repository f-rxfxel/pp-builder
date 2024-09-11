package atv1_pp_factory_method;

public class Teste {
  public static void main(String[] args) {

    PedeCerveja pedidoCerveja = new PedeCerveja();
    PedeWhisky pedidoWhisky = new PedeWhisky();

    Bebida b1 = pedidoCerveja.FazPedido();
    Bebida b2 = pedidoWhisky.FazPedido();

    b1.Hello();
    b1.BebidaEscolhida();

    b2.Hello();
    b2.BebidaEscolhida();
  }
}
