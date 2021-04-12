package resolucion;
import java.util.ArrayList;
import java.util.Date;

import dominio.Entrada;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.GeneroRecital;
import dominio.GeneroTeatro;
import dominio.TipoEvento;
import dominio.Utils;
import dominio.Actor;
import dominio.Banda;
import dominio.Deporte;
import dominio.EntradaDeporte;

public class ejercicio1 {

	public static void main(String[] args) {
		// DECLARACIONES
		ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>();
		
		// ENTRADAS
		listaEntradas.add(new EntradaRecital(
				"Cosquin Rock",
				new TipoEvento(1),
				Utils.GetDate(21, 07, 2022, 21, 00),
				1,
				155,
				new Banda(4),
				new GeneroRecital(2),
				new Banda(5),
				null
		));
		listaEntradas.add(new EntradaTeatro(
				"Los arboles mueren de pie",
				new TipoEvento(2),
				Utils.GetDate(12, 5, 2021, 19, 15),
				120,
				new GeneroTeatro(1),
				new Actor(1),
				new Actor(2),
				null
		));
		listaEntradas.add(new EntradaTeatro(
				"Casados con hijos",
				new TipoEvento(2),
				Utils.GetDate(7, 4, 2021, 20, 30),
				60,
				new GeneroTeatro(2),
				new Actor(3),
				new Actor(4),
				new Actor(5)	
		));
		listaEntradas.add(new EntradaInfantil(
			"Pepa Pig world tour",
			new TipoEvento(3),
			Utils.GetDate(26, 5, 2021, 20, 30),
			15,
			false,
			1
		));
		listaEntradas.add(new EntradaDeporte(
			"Evento Futbol",
			new TipoEvento(4),
			Utils.GetDate(23, 9, 1992, 20, 30),
			160,
			new Deporte(1),
			true
		));
		
		System.out.println("************************************************");
		System.out.println("                Todas las entradas");
		for(Entrada obj : listaEntradas) {
			System.out.println("************************************************");
			System.out.println(obj.toString());
			System.out.println("\n");
		}
		
	}

}
