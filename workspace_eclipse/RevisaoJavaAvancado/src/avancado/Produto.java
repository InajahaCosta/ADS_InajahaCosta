package avancado;

public class Produto {
	private Long id;
	
	private String descricao;
	
	Double preco;

	public Produto(Long id, String descricao, Double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
}