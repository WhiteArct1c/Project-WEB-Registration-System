package vo;

import java.time.LocalDate;

public class Entrega extends Domain {
	private Venda venda;
	private LocalDate dataEntrega;
	
	public Entrega() {
		super();
	}

	public Entrega(int id, Venda venda, LocalDate dataEntrega) {
		super(id);
		this.venda = venda;
		this.dataEntrega = dataEntrega;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	
	
}
