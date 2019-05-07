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
public class Cuenta {
	private String id;
	private String saldo;
	private String estado;
	@XmlElementWrapper(name = "transacciones")
	@XmlElement(name = "transaccion")
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();

	public Cuenta() {
		super();
	}

	public Cuenta(String id, String saldo, String estado, List<Transaccion> transacciones) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.estado = estado;
		this.transacciones = transacciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuenta [id=");
		builder.append(id);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", transacciones=");
		builder.append(transacciones);
		builder.append("]");
		return builder.toString();
	}

}
