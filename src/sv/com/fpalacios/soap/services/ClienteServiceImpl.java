package sv.com.fpalacios.soap.services;

import java.util.List;

import javax.jws.WebService;

import sv.com.fpalacios.soap.models.ClienteCuenta;
import sv.com.fpalacios.soap.process.ClienteProcess;

@WebService(endpointInterface = "sv.com.fpalacios.soap.services.ClienteService")
public class ClienteServiceImpl implements ClienteService {

	@Override
	public String obtenerCliente(String dui) {
		String clienteXml = "";
		ClienteProcess clienteProcess = new ClienteProcess();
		List<ClienteCuenta> clientesFicticios = clienteProcess.crearDatosFicticios();

		ClienteCuenta clienteFiltrado = clienteProcess.filtrarClientePorDui(clientesFicticios, dui);

		clienteXml = clienteProcess.convertirObjecToXml(clienteFiltrado);

		// TODO Auto-generated method stub
		return clienteXml;
	}

}
