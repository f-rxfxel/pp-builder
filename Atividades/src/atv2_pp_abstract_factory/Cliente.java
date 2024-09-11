package atv2_pp_abstract_factory;

public class Cliente {
  public static void main(String[] args) {
    FabricaA fa = new FabricaA();
    FabricaB fb = new FabricaB();

    Eletronico t = fa.criaEletronico();
    Eletrodomestico g = fa.criaEletrodomestico();

    Eletronico r = fb.criaEletronico();
    Eletrodomestico c = fb.criaEletrodomestico();

    t.produtoEscolhido();
    g.produtoEscolhido();
    r.produtoEscolhido();
    c.produtoEscolhido();
  }
}
