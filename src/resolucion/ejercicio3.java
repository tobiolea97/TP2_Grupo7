package resolucion;

import java.util.ArrayList;
import java.util.ListIterator;

import dominio.Actor;
import dominio.Banda;
import dominio.Cliente;
import dominio.Entrada;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.GeneroRecital;
import dominio.GeneroTeatro;
import dominio.TipoEvento;
import dominio.Utils;
import dominio.Venta;

public class ejercicio3 {
	public static void main(String[] args) {
		// DECLARACIONES
		ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>();
		ArrayList<Venta> listaVentas = new ArrayList<Venta>();
		
		
		// VENTA 1
		Cliente cliente = new Cliente(
			1000000,
			"Tobias",
			"Olea",
			"40333444",
			"Alvear 1278",
			"Masculino",
			"Don Torcuato",
			"Buenos Aires"
		);
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
		
		listaVentas.add(new Venta(
			Utils.GetDate(12, 5, 2021, 20, 30),
			cliente,
			listaEntradas
		));
		
		
		// VENTA 2
		cliente = new Cliente(
			1000001,
			"John",
			"Doe",
			"11222333",
			"Market 8400",
			"Masculino",
			"Colegiales",
			"CABA"
		);
		
		listaEntradas = new ArrayList<Entrada>();
		listaEntradas.add(new EntradaInfantil(
			"Pepa Pig world tour",
			new TipoEvento(3),
			Utils.GetDate(26, 5, 2021, 20, 30),
			15,
			false,
			1
		));
		
		listaVentas.add(new Venta(
			Utils.GetDate(13, 4, 2021, 20, 30),
			cliente,
			listaEntradas
		));
		
		
		// LISTAR VENTAS
		System.out.println("************************************************");
		System.out.println("                Todas las ventas");
		ListIterator<Venta> iterator = listaVentas.listIterator();
		while(iterator.hasNext())
		{
			System.out.println("************************************************");
			System.out.println(iterator.next());
			System.out.println("\n");
		}
		
	}
}
