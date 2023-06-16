package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeDistancia;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Socio implements ICorredor{

	private TipoDeDistancia distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	
	public Corredor(Integer codigo, String nombre,TipoDeDistancia distanciaPreferida, Integer cantidadDeKilometrosEntrenados) {
		super(codigo, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

	@Override
	public Integer getNumeroDeSocio() {
		return super.getCodigo();
	}

	@Override
	public String getNombreDeSocio() {
		return super.getNombre();
	}

	public TipoDeDistancia getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(TipoDeDistancia distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		
		return this.cantidadDeKilometrosEntrenados;
	}

	
}
