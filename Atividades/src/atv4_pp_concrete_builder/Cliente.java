package atv4_pp_concrete_builder;

public class Cliente {
  public static void main(String[] args) {
      Conta builder = new Conta();

      ContaCorrente contaTeste = new ContaCorrente();
      contaTeste.buildIdCliente("001");

  }
}
