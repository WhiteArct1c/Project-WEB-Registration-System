package vo;

import java.util.ArrayList;
import java.util.List;

public class Produto extends Domain {
	private String nome;
	private String descricao;
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private double preco;
	
	public Produto() {
		super();
	}
	
	public Produto(int id, String nome, String descricao, List<Categoria> categorias, double preco) {
		super(id);
		this.nome = nome;
		this.descricao = descricao;
		this.categorias = categorias;
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
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
