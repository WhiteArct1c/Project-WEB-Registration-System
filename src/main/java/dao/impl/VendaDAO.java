package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import dao.IDAO;
import vo.Domain;
import vo.Venda;

public class VendaDAO implements IDAO<Venda> {

	private List<Venda> vendas = new ArrayList<Venda>();
	
	
	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public List<Venda> getVendas() {
		return vendas;
	}
	

	@Override
	public String salvar(Domain domain) {
		
		Venda venda = (Venda) domain;
		
		if(!vendas.contains(domain)) {
			try {
				vendas.add(venda);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return "Venda cadastrada com sucesso!";
		
		
	}

	@Override
	public String deletar(Domain domain) {
		
		Optional<Venda> vendaTemp = vendas.stream().filter(c -> c.getId() == domain.getId()).findFirst();
		
		try {
			
			Venda venda = vendaTemp.get();
			vendas.remove(venda.getId()-1);
			
		}catch(NoSuchElementException | IndexOutOfBoundsException e) {	
			return "A venda com este código não existe!";
		}
		
		return "Venda deletada com sucesso!";
			
	}

	@Override
	public String alterar(Domain domain) {
		
		Venda produto = (Venda) domain;
		
		try {
			vendas.forEach(vnd ->{
				if(vnd.getId() == domain.getId()) {
					vendas.set(vnd.getId()-1, produto);
				}
			});
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return "Venda alterada com sucesso!";
		
	}

	@Override
	public List<Venda> listar() {
		return vendas;
	}

}
