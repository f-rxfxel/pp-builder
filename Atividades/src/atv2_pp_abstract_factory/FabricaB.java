package atv2_pp_abstract_factory;

public class FabricaB extends FabricaAbstrata {

  Eletrodomestico criaEletrodomestico() {
    return new Cafeteira();
  }

  Eletronico criaEletronico() {
    return new Radio();
  }

}
