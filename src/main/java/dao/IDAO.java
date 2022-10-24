package dao;


import java.util.List;

import vo.Domain;

public interface IDAO<T> {
	
	public String salvar(Domain domain);
	
	public String deletar(Domain domain);
	
	public String alterar(Domain domain);
	
	public List<T> listar();
}
