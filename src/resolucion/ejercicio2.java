package resolucion;

import dominio.TipoEvento;
import dominio.Utils;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.GeneroRecital;
import dominio.GeneroTeatro;
import dominio.Deporte;
import dominio.Entrada;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import dominio.Actor;
import dominio.Banda;
import dominio.DateFormat;


public class ejercicio2 {

	public static void main(String[] args) {
		

		/////////////////////////////////// PUNTO A ///////////////////////////////////
		/// Creacion de Lista
		TreeSet<Entrada> listarEntrada = new TreeSet<Entrada>();

		
		
		/// Creacion de entradas
		listarEntrada.add(new EntradaDeporte("Deporte",
				new TipoEvento(4, "Deporte"), 
				Utils.GetDate(12, 5, 2021, 19, 15),120,
				new Deporte(1),false));
		
		listarEntrada.add( new EntradaTeatro(
				"Casados con hijos",
				new TipoEvento(2),
				Utils.GetDate(7, 4, 2021, 20, 30),
				60,
				new GeneroTeatro(2),
				new Actor(3),
				new Actor(4),
				new Actor(5) ));

		listarEntrada.add(new EntradaRecital(
				"Cosquin Rock",
				new TipoEvento(1),
				Utils.GetDate(21, 07, 2022, 21, 00),
				1,
				155,
				new Banda(4),
				new GeneroRecital(2),
				new Banda(5),
				null));
		
		listarEntrada.add(new EntradaInfantil(
				"Pepa Pig world tour",
				new TipoEvento(3),
				Utils.GetDate(26, 5, 2021, 20, 30),
				15,
				false,
				1
			));
			
		listarEntrada.add( new EntradaTeatro(
				"Casa Blanca",
				new TipoEvento(2),
				Utils.GetDate(9, 4, 2021, 20, 30),
				60,
				new GeneroTeatro(2),
				new Actor(3),
				new Actor(4),
				new Actor(5) ));
		
		
		/// Interador 
		Iterator<Entrada> it = listarEntrada.iterator();
		
		System.out.println("************************************************");
		System.out.println("Todas las entradas ordenadas por N� de Entrada de forma creciente");
		
		// recorrer Interador
		while(it.hasNext()) {
			System.out.println("************************************************");
			Entrada d=(Entrada) it.next();
			System.out.println(d.toString());
		}

		/////////////////////////////////// PUNTO C ///////////////////////////////////
		System.out.println("\n");
		System.out.println("******************************* PUNTO C *******************************");
		//COMPARACION DE OBJETOS TIPO ENTRADA RECITAL.
		EntradaRecital objReci = new EntradaRecital();
		objReci.setBanda(new Banda(1));
		objReci.setGenero(new GeneroRecital(1));
		objReci.setPrimeraBandaSoporte(new Banda(2));
		objReci.setFechaHoraEvento((DateFormat)Utils.GetDate(11, 12, 2021, 20, 30));
		objReci.setNombreEvento("RockNacional");
		objReci.setTipoEvento(new TipoEvento(1));
		objReci.setDuracionEvento(120);
		objReci.SetearPrecioEntrada(1);
		
		EntradaRecital objReci2 = new EntradaRecital();
		objReci2.setBanda(new Banda(1));
		objReci2.setGenero(new GeneroRecital(1));
		objReci2.setPrimeraBandaSoporte(new Banda(2));
		objReci2.setFechaHoraEvento((DateFormat)Utils.GetDate(11, 12, 2021, 20, 30));
		objReci2.setNombreEvento("RockNacional");
		objReci2.setTipoEvento(new TipoEvento(1));
		objReci2.setDuracionEvento(120);
		objReci2.SetearPrecioEntrada(1);
		
		if(objReci.equals(objReci2)) {
			System.out.println("SON IGUALES!!");
		}
		else {
			System.out.println("NO SON IGUALES. :(");
		}
		
		//COMPARACION DE OBJETOS TIPO ENTRADA INFANTIL.
		EntradaInfantil objInfan = new EntradaInfantil(
			"Pepa Pig world tour",
			new TipoEvento(3),
			(DateFormat)Utils.GetDate(26, 5, 2021, 20, 30),
			15,
			false,
			1
		);
		EntradaInfantil objInfan2 = new EntradaInfantil(
			"Pepa Pig world tour",
			new TipoEvento(3),
			(DateFormat)Utils.GetDate(26, 5, 2021, 20, 30),
			15,
			false,
			2
		);
		
		if(objInfan.equals(objInfan2)) {
			System.out.println("SON IGUALES!!");
		}
		else {
			System.out.println("NO SON IGUALES. :(");
		}
		
		// ENTRADAS TEATRO				
		EntradaTeatro objTeatro = new EntradaTeatro(
				"Los arboles mueren de pie",
				new TipoEvento(2),
				(DateFormat)Utils.GetDate(12, 5, 2021, 19, 15),
				120,
				new GeneroTeatro(1),
				new Actor(1),
				new Actor(2),
				null
		);
		EntradaTeatro objTeatro2 =new EntradaTeatro(
				"Los arboles mueren de pie",
				new TipoEvento(2),
				(DateFormat)Utils.GetDate(12, 5, 2021, 19, 15),
				120,
				new GeneroTeatro(1),
				new Actor(1),
				new Actor(2),
				null	
		);
		
		if(objTeatro.equals(objTeatro2)) {
			System.out.println("SON IGUALES!!");
		}
		else {
			System.out.println("NO SON IGUALES. :(");
		}

		
		

		
		
}
}