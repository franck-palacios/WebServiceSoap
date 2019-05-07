package sv.com.fpalacios.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ClienteService {

	@WebMethod
	public String obtenerCliente(String dui);
}
