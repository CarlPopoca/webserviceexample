package com.webservice.webserviceexample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface paquete {
	@WebMethod
	public  double registrar(int id, String fecha);
}

