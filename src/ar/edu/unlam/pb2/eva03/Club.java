package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	
	private String nombre;
	private Set<Socio> socios = new HashSet<Socio>();
	private Map<String, Evento> competencias = new HashMap<String, Evento>();
	
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Socio>();
		this.competencias = new HashMap<String, Evento>();
	}


	public void agregarDeportista(Socio socio) {
		this.socios.add(socio);
	}


	public Integer getCantidadSocios() {
		return socios.size();
	}


	public void crearEvento(Evento evento, String nombre) {
		competencias.put(nombre, evento);
	}


	public Boolean inscribirEnEvento(String nombre, Socio socio) throws NoEstaPreparado {
		Evento evento = competencias.get(nombre);
		
		TipoDeEvento tipoDeEvento = evento.getTipo();
		
		for (Socio socio1 : socios) {
			if(tipoDeEvento.equals(TipoDeEvento.CARRERA_5K) || tipoDeEvento.equals(TipoDeEvento.CARRERA_10K) || tipoDeEvento.equals(TipoDeEvento.CARRERA_21K) || tipoDeEvento.equals(TipoDeEvento.CARRERA_42K)) {
				if(socio1 instanceof ICorredor) {
					evento.agregarParticipante(socio1.getCodigo(), socio1);
					return true;
				}
			}if(tipoDeEvento.equals(TipoDeEvento.TRIATLON_SHORT) || tipoDeEvento.equals(TipoDeEvento.TRIATLON_OLIMPICO) || tipoDeEvento.equals(TipoDeEvento.TRIATLON_MEDIO) || tipoDeEvento.equals(TipoDeEvento.TRIATLON_IRONMAN)) {
				if(socio1 instanceof INadador || socio1 instanceof ICiclista) {
					evento.agregarParticipante(socio1.getCodigo(), socio1);
					return true;
				}
			}
		}
		throw new NoEstaPreparado("No está preparado");
	}
	
	
}
