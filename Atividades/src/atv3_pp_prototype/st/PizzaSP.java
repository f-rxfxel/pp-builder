package atv3_pp_prototype.st;

public class PizzaSP extends Pizza {

	protected PizzaSP(PizzaSP pizza) {
		this.nome = pizza.getNome();
		this.sabor = pizza.getSabor();
		this.tamanho = pizza.getTamanho();
	}

	public PizzaSP() {
	}

	@Override
	public Pizza clone() throws CloneNotSupportedException {
		return (Pizza) super.clone();
	}
}
