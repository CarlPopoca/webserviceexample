package com.webservice.webserviceexample;
import javax.jws.WebService;

@WebService(endpointInterface="com.webservice.webserviceexample.paquete")
public class PaqueteImpl implements Paquete{

	public double registrar(int id, String fecha) {
		// TODO Auto-generated method stub
		return 1000000;
	}

}
