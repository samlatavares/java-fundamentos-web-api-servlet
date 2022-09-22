package br.com.samla.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer chaveSequencial= 1;
	
	/*static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");

		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}*/
	
	public List<Empresa> getListaEmpresas() {
		return Banco.listaEmpresas;
	}
	
	public Empresa buscarEmpresa(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId().equals(id)) {
				return empresa;
			}
		}
		return null;
	}

	public void adicionar(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		listaEmpresas.add(empresa);
	}
	

	public void removerEmpresa(Integer id) {
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId().equals(id)) {
				it.remove();
			}
		}	
	}
}
