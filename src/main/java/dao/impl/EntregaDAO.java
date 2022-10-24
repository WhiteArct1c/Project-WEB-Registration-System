package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import dao.IDAO;
import vo.Domain;
import vo.Entrega;


public class EntregaDAO implements IDAO<Entrega> {
	
	private List<Entrega> entregas = new ArrayList<Entrega>();
	
	
	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}

	public List<Entrega> getEntregas() {
		return entregas;
	}
	
	@Override
	public String salvar(Domain domain) {
		Entrega entrega = (Entrega) domain;
		
		if(!entregas.contains(domain)) {
			try {
				entregas.add(entrega);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return "Entrega registrada com sucesso!";
	}

	@Override
	public String deletar(Domain domain) {
		Optional<Entrega> entregaTemp = entregas.stream().filter(c -> c.getId() == domain.getId()).findFirst();
		
		try {
			
			Entrega venda = entregaTemp.get();
			entregas.remove(venda.getId()-1);
			
		}catch(NoSuchElementException | IndexOutOfBoundsException e) {	
			return "A entrega com este código não existe!";
		}
		
		return "Registro de entrega deletado com sucesso!";
	}

	@Override
	public String alterar(Domain domain) {
		
		Entrega entrega = (Entrega) domain;
		
		try {
			entregas.forEach(ent ->{
				if(ent.getId() == domain.getId()) {
					entregas.set(ent.getId()-1, entrega);
				}
			});
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return "Registro de entrega alterado com sucesso!";
		
	}

	@Override
	public List<Entrega> listar() {
		return entregas;
	}

}
