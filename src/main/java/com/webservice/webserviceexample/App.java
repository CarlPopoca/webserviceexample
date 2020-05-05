package com.webservice.webserviceexample;

import javax.xml.ws.Endpoint;

public class App 
{
    public static void main( String[] args )
    {
      Endpoint.publish ("http://localhost:8068/webserviceexample/paquete", new PaqueteImpl());
    }
}
