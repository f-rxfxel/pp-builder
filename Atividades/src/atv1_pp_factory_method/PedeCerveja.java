package atv1_pp_factory_method;

import atv1_pp_factory_method.bebidas.Cerveja;

public class PedeCerveja extends ChamaOGarcom {

  @Override
  Bebida FazPedido() {
    return new Cerveja();
  }
}
