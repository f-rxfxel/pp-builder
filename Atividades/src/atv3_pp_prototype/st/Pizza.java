package atv3_pp_prototype.st;

public abstract class Pizza implements Cloneable {
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

	public Pizza clone() throws CloneNotSupportedException {
		return (Pizza) super.clone();
	}
}
