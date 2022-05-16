package br.com.samla.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}

	public void adicionar(Empresa empresa) {
		listaEmpresas.add(empresa);		
	}
	
	public List<Empresa> getListaEmpresas() {
		return Banco.listaEmpresas;
	}

}
