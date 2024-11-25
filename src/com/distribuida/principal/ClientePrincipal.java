package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"1721221176","Juan","Taipe","Av.A y B","0912309342","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"1790221176","Luis","Ruiz","Av.Cortazar","0923456342","ruiz@correo.com");

		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
		
	}

}
