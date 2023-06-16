package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public abstract class  Socio {

	private Integer codigo;
	private String nombre;


	public Socio(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract Integer getNumeroDeSocio();
	public abstract String getNombreDeSocio();

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
}
