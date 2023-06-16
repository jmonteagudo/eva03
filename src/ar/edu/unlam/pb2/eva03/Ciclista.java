package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Ciclista extends Socio {

	
	private TipoDeBicicleta ruta;

	public Ciclista(Integer codigo, String nombre, TipoDeBicicleta ruta) {
		super(codigo, nombre);
		this.ruta = ruta;
	}

	@Override
	public Integer getNumeroDeSocio() {
		
		 return super.getCodigo();
	}

	@Override
	public String getNombreDeSocio() {
		
		return super.getNombre();
	}

	public TipoDeBicicleta getRuta() {
		return ruta;
	}

	public void setRuta(TipoDeBicicleta ruta) {
		this.ruta = ruta;
	}

	
	
}
