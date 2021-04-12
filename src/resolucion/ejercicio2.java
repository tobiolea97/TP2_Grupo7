package resolucion;

import dominio.Actor;
import dominio.Banda;
import dominio.DateFormat;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.GeneroRecital;
import dominio.GeneroTeatro;
import dominio.TipoEvento;
import dominio.Utils;

public class ejercicio2 {

	public static void main(String[] args) {
        
		
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
