package atv3_pp_prototype.st;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		PizzaMG mg = new PizzaMG();
		Pizza clone_mg = mg.clone();

		mg.setNome("PizzaMG");
		mg.setSabor("Calabresa");
		mg.setTamanho(8);

		clone_mg.setNome("PizzaMG Clone");
		clone_mg.setTamanho(4);

		System.out.println(mg.nome + " - tamanho " + mg.getTamanho());
		System.out.println(clone_mg.nome + " - tamanho " + clone_mg.getTamanho());

		PizzaSP sp = new PizzaSP();
		Pizza clone_sp = sp.clone();

		sp.setNome("PizzaSP");
		sp.setSabor("Calabresa");
		sp.setTamanho(8);

		clone_sp.setNome("PizzaSP Clone");
		clone_sp.setTamanho(4);

		System.out.println(sp.nome + " - tamanho " + sp.getTamanho());
		System.out.println(clone_sp.nome + " - tamanho " + clone_sp.getTamanho());
	}
}
