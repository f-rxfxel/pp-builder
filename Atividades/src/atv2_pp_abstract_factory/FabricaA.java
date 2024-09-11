package atv2_pp_abstract_factory;

public class FabricaA extends FabricaAbstrata {

  Eletrodomestico criaEletrodomestico() {
    return new Geladeira();
  }

  Eletronico criaEletronico() {
    return new Televisor();
  }

}
