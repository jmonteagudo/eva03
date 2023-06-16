package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeDistancia;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class PruebaEva03 {
	
	@Test
	public void queSePuedaCrearUnNadador() {
		Socio nuevo = new Nadador(1, "Camila", "Espalda");

		assertEquals("Espalda", ((Nadador) nuevo).getEstiloPreferido());
		assertEquals((Integer)1, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Socio nuevo = new Corredor(2, "Carolina", TipoDeDistancia.KM_5,0);
		((Corredor) nuevo).setCantidadDeKilometrosEntrenados(50000);
		
		assertEquals(TipoDeDistancia.KM_5, ((Corredor) nuevo).getDistanciaPreferida());
		assertEquals((Integer)50000, ((Corredor) nuevo).getCantidadDeKilometrosEntrenados());
		assertEquals((Integer)2, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Socio nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);

		assertEquals(TipoDeBicicleta.RUTA, ((Ciclista)nuevo).getRuta());
		assertEquals((Integer) 3, nuevo.getNumeroDeSocio());
	}

	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Socio nuevo = new Triatleta(4, "Luna", TipoDeEvento.TRIATLON_OLIMPICO, TipoDeBicicleta.TRIA,0);
		
		assertEquals(TipoDeEvento.TRIATLON_OLIMPICO, ((Triatleta) nuevo).getTipoDeEvento());
		assertEquals(TipoDeBicicleta.TRIA, ((Triatleta) nuevo).getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		Club actual = new Club("CARP");
		
		Socio socio1 = new Corredor(1000, "Camila", TipoDeDistancia.KM_10, 42000);
		Socio socio2 = new Nadador(1003, "Lucrecia", "Pecho");
		Socio socio3 = new Triatleta(1004, "Tamara", TipoDeEvento.TRIATLON_OLIMPICO, TipoDeBicicleta.RUTA,0);
		Socio socio4 = new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN);
		
		actual.agregarDeportista(socio1);
		actual.agregarDeportista(socio2);
		actual.agregarDeportista(socio3);
		actual.agregarDeportista(socio4);

		
			
		assertEquals((Integer) 4, actual.getCantidadSocios());		
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparado{	
		Socio celeste = new Corredor(1000, "Celeste",TipoDeDistancia.KM_5,10000);
		Club actual = new Club("Sitas");
		Evento evento = new Evento(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, 10);
		
		actual.agregarDeportista(celeste);
		actual.crearEvento(evento, "Maraton de aguas abiertas");
		
		assertNotEquals((Integer)1, actual.inscribirEnEvento("Maraton de aguas abiertas", celeste));		
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparado{		
		Socio celeste = new Corredor(1000, "Celeste",TipoDeDistancia.KM_5, 10000);
		Club actual = new Club("Sitas");
		Evento evento = new Evento(TipoDeEvento.TRIATLON_IRONMAN, 10);
		
		actual.agregarDeportista(celeste);
		actual.crearEvento(evento, "Triatlon Khona");
		
		assertNotEquals((Integer)1, actual.inscribirEnEvento("Triatlon Khona", celeste));		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparado{		
		Socio celeste = new Corredor(1000, "Celeste",TipoDeDistancia.KM_42, 10000);
		Club actual = new Club("Moron");
		Evento evento = new Evento(TipoDeEvento.CARRERA_42K, 10);
		((Corredor)celeste).setCantidadDeKilometrosEntrenados(100000);
		actual.agregarDeportista(celeste);
		actual.crearEvento(evento, "Maraton de New York");
		
		assertTrue(actual.inscribirEnEvento("Maraton de New York", celeste));			
	}
}
