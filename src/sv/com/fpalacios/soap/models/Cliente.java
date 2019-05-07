package sv.com.fpalacios.soap.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Cliente {
	private String codigo;
	private String tipoDocumento;
	private String nombres;
	private String apellidos;

	public Cliente() {
		super();
	}

	public Cliente(String codigo, String tipoDocumento, String nombres, String apellidos) {
		super();
		this.codigo = codigo;
		this.tipoDocumento = tipoDocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [codigo=");
		builder.append(codigo);
		builder.append(", tipoDocumento=");
		builder.append(tipoDocumento);
		builder.append(", nombres=");
		builder.append(nombres);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append("]");
		return builder.toString();
	}

}
