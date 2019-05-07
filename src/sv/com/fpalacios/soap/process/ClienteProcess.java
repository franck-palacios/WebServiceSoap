package sv.com.fpalacios.soap.process;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import sv.com.fpalacios.soap.models.Cliente;
import sv.com.fpalacios.soap.models.ClienteCuenta;
import sv.com.fpalacios.soap.models.Cuenta;
import sv.com.fpalacios.soap.models.Transaccion;

public class ClienteProcess {

	public String convertirObjecToXml(ClienteCuenta clienteCuenta) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		String xml = null;

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ClienteCuenta.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(clienteCuenta, outputStream);
			xml = new String(outputStream.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return xml;
	}

	public List<ClienteCuenta> crearDatosFicticios() {
		List<ClienteCuenta> clientesCuenta = new ArrayList<ClienteCuenta>();
		for (int j = 1; j < 6; j++) {
			ClienteCuenta clienteCuenta = new ClienteCuenta();
			Cliente cliente = new Cliente("0000" + j, "tipoDocumento" + j, "nombre" + j, "apellidos" + j);
			List<Cuenta> cuentas = new ArrayList<Cuenta>();
			for(int k=1; k<3; k++) {
				List<Transaccion> transacciones = new ArrayList<Transaccion>();
				for (int i = 1; i < 4; i++) {
					Transaccion transaccion = new Transaccion("00" + i, "tipo" + i, "valor" + i, "fecha" + i);
					transacciones.add(transaccion);
				}	
				Cuenta cuenta = new Cuenta("id"+k, "saldo"+k, "estado"+k, transacciones);
				cuentas.add(cuenta);
			}
			clienteCuenta.setCliente(cliente);
			clienteCuenta.setCuentas(cuentas);
			clientesCuenta.add(clienteCuenta);
		}
		return clientesCuenta;
	}
	
	public ClienteCuenta filtrarClientePorDui(List<ClienteCuenta> clientes, String dui) {
		ClienteCuenta clienteEncontrado = new ClienteCuenta();
		for(ClienteCuenta cliente: clientes) {
			if(cliente.getCliente().getCodigo().equalsIgnoreCase(dui)) {
				clienteEncontrado = cliente;
				break;
			}
		}
		return clienteEncontrado;
	}

}
