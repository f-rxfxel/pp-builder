package atv3_pp_prototype.nd;

public class Client {

	public static void main(String[] args) {

		PizzaMG pizza = new PizzaMG();

		pizza.setNome("PizzaMG");
		pizza.setSabor("Calabresa");
		pizza.setTamanho(8);
		
		PizzaMG pizzaClone = (PizzaMG) pizza.clone();
		
		pizzaClone.setNome("PizzaCloneMG");
		pizzaClone.setSabor("Calabresa");
		pizzaClone.setTamanho(4);
		
		System.out.println(pizza.nome + " - tamanho " + pizza.getTamanho());
		System.out.println(pizzaClone.nome + " - tamanho " + pizzaClone.getTamanho());

		PizzaSP sp = new PizzaSP();

		sp.setNome("PizzaSP");
		sp.setSabor("Calabresa");
		sp.setTamanho(8);

		PizzaSP clone_sp = (PizzaSP) sp.clone();

		clone_sp.setNome("PizzaSP Clone");
		clone_sp.setSabor("Brócolis com bacon");
		clone_sp.setTamanho(4);

		System.out.println(sp.nome + " - tamanho " + sp.getTamanho());
		System.out.println(clone_sp.nome + " - tamanho " + clone_sp.getTamanho());

	}

}
