package ar.edu.unlam.pb2.eva03;

public class Nadador extends Socio{
	
	private String estiloPreferido;

	public Nadador(Integer codigo, String nombre,String estiloPreferido) {
		super(codigo, nombre);
		this.estiloPreferido = estiloPreferido;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	@Override
	public Integer getNumeroDeSocio() {
		return super.getCodigo();
	}


	@Override
	public String getNombreDeSocio() {
		return super.getNombre();
	}


	
	
}
