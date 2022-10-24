package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import dao.IDAO;
import vo.Domain;
import vo.Produto;

public class ProdutoDAO implements IDAO<Produto> {

	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	@Override
	public String salvar(Domain domain) {
		
		Produto produto = (Produto) domain;
		
		if(!produtos.contains(domain)) {
			try {
				produtos.add(produto);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return "Produto cadastrado com sucesso!";
		
	}

	@Override
	public String deletar(Domain domain) {
		
		Optional<Produto> produtoTemp = produtos.stream().filter(c -> c.getId() == domain.getId()).findFirst();
		
		try {
			
			Produto produto = produtoTemp.get();
			produtos.remove(produto.getId()-1);
			
		}catch(NoSuchElementException | IndexOutOfBoundsException e) {	
			return "O produto com este código não existe!";
		}
		
		return "Produto deletado com sucesso!";
			
	}

	@Override
	public String alterar(Domain domain) {
		
		Produto produto = (Produto) domain;
		
		try {
			produtos.forEach(prd ->{
				if(prd.getId() == domain.getId()) {
					produtos.set(prd.getId()-1, produto);
				}
			});
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return "Produto alterado com sucesso!";
		
	}

	@Override
	public List<Produto> listar() {
		return produtos;
	}

}
