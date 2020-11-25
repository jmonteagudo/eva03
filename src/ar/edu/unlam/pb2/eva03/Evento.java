package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		participantes = new HashMap<Integer, Deportista>();
	}
	
	public Integer agregarParticipante(Deportista nuevo) {
		participantes.put(++this.numeroDeInscripcion, nuevo);
		return this.numeroDeInscripcion;
	}
	
	public TipoDeEvento getTipo() {
		return tipo;
	}
}
