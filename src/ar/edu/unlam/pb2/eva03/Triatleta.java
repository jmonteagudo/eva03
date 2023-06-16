package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Socio implements ICorredor ,ICiclista, INadador{

	private TipoDeBicicleta tipoDeBicicleta;
	private TipoDeEvento tipoDeEvento;
	private Integer cantidadDeKilometrosEntrenados;
	
	public Triatleta(Integer codigo, String nombre,TipoDeEvento tipoDeEvento ,TipoDeBicicleta tipoDeBiclicleta, Integer cantidadDeKilometrosEntrenados) {
		super(codigo, nombre);
		this.tipoDeBicicleta = tipoDeBiclicleta;
		this.tipoDeEvento = tipoDeEvento;
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

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	
	
}
