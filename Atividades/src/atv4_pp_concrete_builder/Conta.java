package atv4_pp_concrete_builder;

public class Conta {
  private String idCliente;
  private String tipoConta;
  private double depositoInicial;
  private String numeroConta;
  private final String numeroAgencia = "001";
  private final String numeroBanco = "1";
  private double saldo;

  // Getters
  public String getIdCliente() {
  return idCliente;
  }

  public String getTipoConta() {
  return tipoConta;
  }

  public double getDepositoInicial() {
  return depositoInicial;
  }

  public String getNumeroConta() {
  return numeroConta;
  }

  public String getNumeroAgencia() {
  return numeroAgencia;
  }

  public String getNumeroBanco() {
  return numeroBanco;
  }

  public double getSaldo() {
  return saldo;
  }

  // Setters
  public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
  }

  public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
  }

  public void setDepositoInicial(double depositoInicial) {
    this.depositoInicial = depositoInicial;
    this.saldo = depositoInicial;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Conta [idCliente=" + idCliente + ", tipoConta=" + tipoConta + ", depositoInicial=" + depositoInicial
        + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
  }

}
