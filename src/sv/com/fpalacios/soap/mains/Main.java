package sv.com.fpalacios.soap.mains;

import javax.xml.ws.Endpoint;

import sv.com.fpalacios.soap.services.ClienteServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Endpoint.publish("http://localhost:5050/ws/clientes", new ClienteServiceImpl());
		ClienteServiceImpl implementacion = new ClienteServiceImpl();
		System.out.println("Implementacion: "+ implementacion.obtenerCliente("00002"));
	}
	

}
