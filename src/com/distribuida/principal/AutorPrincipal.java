package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor(1, "Henry", "Andrade", "Quito", "CDP", "1721029191", "henry@gmail.com");
		System.out.println(autor.toString());
	}

}
