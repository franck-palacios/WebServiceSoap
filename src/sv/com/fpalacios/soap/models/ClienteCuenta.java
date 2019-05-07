package sv.com.fpalacios.soap.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ClienteCuenta {
	private Cliente cliente;
	@XmlElementWrapper(name = "cuentas")
	@XmlElement(name = "cuenta")
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public ClienteCuenta() {
		super();
	}

	public ClienteCuenta(Cliente cliente, List<Cuenta> cuentas) {
		super();
		this.cliente = cliente;
		this.cuentas = cuentas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteCuenta [cliente=");
		builder.append(cliente);
		builder.append(", cuentas=");
		builder.append(cuentas);
		builder.append("]");
		return builder.toString();
	}

}
