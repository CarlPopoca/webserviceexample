package com.webservice.webserviceexample;

public class PaqueteConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaqueteImplService paqImp = new PaqueteImplService();
		Paquete consumerPaq = paqImp.getPaqueteImplPort();
		
		System.out.println("Primer prueba");
		System.out.println(consumerPaq.registrar(123, "prueba 1"));
		
		System.out.println("Segunda prueba");
		System.out.println(consumerPaq.registrar(456, "prueba 2"));
		
	}

}
