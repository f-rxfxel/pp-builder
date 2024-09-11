package atv4_pp_concrete_builder;

public abstract class Builder {

	protected Conta conta;
	
	public Builder() {
		this.conta = new Conta();
	}
	
	public abstract Builder buildIdCliente(String idClient);
	public abstract Builder buildTipoConta(String tipoConta);
	public abstract Builder buildDepositoInicial(double depositoInicial);
	public abstract Builder buildNumeroConta(String numeroConta);
	public abstract Builder buildSaldo(double saldo);
	
	public Conta getConta() {
		return conta;
	}
}
