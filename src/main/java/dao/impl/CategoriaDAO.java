package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import dao.IDAO;
import vo.Categoria;
import vo.Domain;


public class CategoriaDAO implements IDAO<Categoria> {

	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	@Override
	public String salvar(Domain domain) {
		Categoria categoria = (Categoria) domain;
		
		if(!categorias.contains(domain)) {
			try {
				categorias.add(categoria);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return "Categoria registrada com sucesso!";
	}

	@Override
	public String deletar(Domain domain) {
		
		Optional<Categoria> categoriaTemp = categorias.stream().filter(c -> c.getId() == domain.getId()).findFirst();
		
		try {
			
			Categoria categoria = categoriaTemp.get();
			categorias.remove(categoria.getId()-1);
			
		}catch(NoSuchElementException | IndexOutOfBoundsException e) {	
			return "A catgoria com este código não existe!";
		}
		
		return "Categoria deletada com sucesso!";
	}

	@Override
	public String alterar(Domain domain) {
		
		Categoria categoria = (Categoria) domain;
		
		try {
			categorias.forEach(cat ->{
				if(cat.getId() == domain.getId()) {
					categorias.set(cat.getId()-1, categoria);
				}
			});
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return "Categoria alterada com sucesso!";
		
	}

	@Override
	public List<Categoria> listar() {
		return categorias;
	}


}
