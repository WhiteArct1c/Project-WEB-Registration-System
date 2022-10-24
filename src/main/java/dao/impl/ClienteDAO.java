package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import dao.IDAO;
import vo.Cliente;
import vo.Domain;

public class ClienteDAO implements IDAO<Cliente> {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public ClienteDAO(){
		clientes.add(new Cliente(1, "Roberval", "Roberval", "Roberval", "Roberval"));
	}
	
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}


	@Override
	public String salvar(Domain domain) {
		
		Cliente cliente = (Cliente) domain;
		
		if(!clientes.contains(domain)) {
			try {
				clientes.add(cliente);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return "Cliente cadastrado com sucesso!";
		
		
	}

	@Override
	public String deletar(Domain domain) {
		
		Optional<Cliente> clientesTemp = clientes.stream().filter(c -> c.getId() == domain.getId()).findFirst();
		
		try {
			
			Cliente cliente = clientesTemp.get();
			clientes.remove(cliente.getId()-1);
			
		}catch(NoSuchElementException | IndexOutOfBoundsException e) {	
			return "O cliente com este código não existe!";
		}
		
		return "Cliente deletado com sucesso!";
			
	}

	@Override
	public String alterar(Domain domain) {
		
		Cliente cliente = (Cliente) domain;
		
		try {
			clientes.forEach(cli ->{
				if(cli.getId() == domain.getId()) {
					clientes.set(cli.getId()-1, cliente);
				}
			});
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return "Cliente alterado com sucesso!";
		
	}

	@Override
	public List<Cliente> listar() {
		return clientes;
	}

}
