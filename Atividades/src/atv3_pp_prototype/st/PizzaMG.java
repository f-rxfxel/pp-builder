package atv3_pp_prototype.st;

public class PizzaMG extends Pizza {

	protected PizzaMG(PizzaMG pizza) {
		this.nome = pizza.getNome();
		this.sabor = pizza.getSabor();
		this.tamanho = pizza.getTamanho();
	}

	public PizzaMG() {
	}

	@Override
	public Pizza clone() throws CloneNotSupportedException {
		return (Pizza) super.clone();
	}
}
