package composite;

public class MenuItem extends MenuComponente {
	String nome;
	String descricao;
	double preco;
	
	public MenuItem (String nome, String desc, double preco) {
		this.nome = nome;
		this.descricao = desc;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void print () {
		System.out.print("   " + getNome());
		System.out.println(" - R$ " + getPreco() + " --> "+ getDescricao());
		//System.out.println("     -- "+ getDescricao());
	}
}
