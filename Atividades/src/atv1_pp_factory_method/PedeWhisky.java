package atv1_pp_factory_method;

import atv1_pp_factory_method.bebidas.Whisky;

public class PedeWhisky extends ChamaOGarcom {

  @Override
  Bebida FazPedido() {
    return new Whisky();
  }
}
