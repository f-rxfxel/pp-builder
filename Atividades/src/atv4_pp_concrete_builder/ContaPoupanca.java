package atv4_pp_concrete_builder;

public class ContaPoupanca extends Builder {

  @Override
  public Builder buildIdCliente(String idClient) {
    conta.setIdCliente(idClient);
    return this;
  }

  @Override
  public Builder buildTipoConta(String tipoConta) {
    conta.setTipoConta(tipoConta);
    return this;
  }

  @Override
  public Builder buildDepositoInicial(double depositoInicial) {
    conta.setDepositoInicial(depositoInicial);
    return this;
  }

  @Override
  public Builder buildNumeroConta(String numeroConta) {
    conta.setNumeroConta(numeroConta);
    return this;
  }

  @Override
  public Builder buildSaldo(double saldo) {
    conta.setSaldo(saldo);
    return this;
  }

}
