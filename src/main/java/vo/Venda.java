package vo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends Domain {
	private LocalDate data;
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();
	private int qtdProduto;
	private double desconto;
	private double valorTotal;
	
	public Venda() {
		super();
	}
	
	public Venda(int id, LocalDate data, Cliente cliente, List<Produto> produtos, int qtdProduto, double desconto,
			double valorTotal) {
		super(id);
		this.data = data;
		this.cliente = cliente;
		this.produtos = produtos;
		this.qtdProduto = qtdProduto;
		this.desconto = desconto;
		this.valorTotal = valorTotal;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
