package atv3_pp_prototype.nd;

public class PizzaMG implements Pizza {

	protected String nome;
	protected String sabor;
	protected int tamanho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSabor() {
		return nome;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	protected PizzaMG(PizzaMG pessoa){
	  this.nome = pessoa.getNome();
	  this.sabor = pessoa.getSabor();
	  this.tamanho = pessoa.getTamanho();
	}

	public PizzaMG() {}

	@Override
	public Pizza clone() {
		return new PizzaMG(this);
	}
}
