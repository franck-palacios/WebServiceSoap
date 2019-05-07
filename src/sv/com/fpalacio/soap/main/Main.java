package sv.com.fpalacio.soap.main;

import sv.com.fpalacio.soap.service.ClienteService;
import sv.com.fpalacio.soap.service.ClienteServiceImplService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteServiceImplService clienteServiceImplService = new ClienteServiceImplService();
		ClienteService clienteService = clienteServiceImplService.getClienteServiceImplPort();
		System.out.println("Respuesta:====>>"+ clienteService.obtenerCliente("000003"));

	}

}
