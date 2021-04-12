package dominio;

import java.util.ArrayList;
import dominio.Deporte;

public class MasterData {
	
	public static ArrayList<Actor> GetActores()
	{
		ArrayList<Actor> listaActores = new ArrayList<Actor>();
		
		listaActores.add(new Actor(1, "Guillermo", "Francella"));
		listaActores.add(new Actor(2, "Ricardo", "Darin"));
		listaActores.add(new Actor(3, "Soledad", "Villamil"));
		listaActores.add(new Actor(4, "Carla", "Quevedo"));
		listaActores.add(new Actor(5, "Javier", "Godino"));
		
		return listaActores;
		
	}
	
	public static ArrayList<TipoEvento> GetTiposDeEvento()
	{
		ArrayList<TipoEvento> tiposEvento = new ArrayList<TipoEvento>();
		
		tiposEvento.add(new TipoEvento(1, "Recital"));
		tiposEvento.add(new TipoEvento(2, "Teatro"));
		tiposEvento.add(new TipoEvento(3, "Infantil"));
		tiposEvento.add(new TipoEvento(4, "Deporte"));
		
		return tiposEvento;
	}
	
	public static ArrayList<GeneroTeatro> GetGenerosTeatro()
	{
		ArrayList<GeneroTeatro> generosTeatro = new ArrayList<GeneroTeatro>();
		
		generosTeatro.add(new GeneroTeatro(1, "Drama"));
		generosTeatro.add(new GeneroTeatro(2, "Teatro"));
		generosTeatro.add(new GeneroTeatro(3, "Comedia"));
		
		return generosTeatro;
	}
	
	public static ArrayList<GeneroRecital> GetGenerosRecital()
	{
		ArrayList<GeneroRecital> generosTeatro = new ArrayList<GeneroRecital>();
		
		generosTeatro.add(new GeneroRecital(1, "Rock"));
		generosTeatro.add(new GeneroRecital(2, "Heavy Metal"));
		generosTeatro.add(new GeneroRecital(3, "Reggaeton"));
		generosTeatro.add(new GeneroRecital(4, "Trap"));
		generosTeatro.add(new GeneroRecital(5, "Latinos"));
		generosTeatro.add(new GeneroRecital(5, "Pop"));
		
		return generosTeatro;
	}
	
	public static ArrayList<Banda> GetBandas()
	{
		ArrayList<Banda> bandas = new ArrayList<Banda>();
		
		bandas.add(new Banda(1, "Mambru"));
		bandas.add(new Banda(2, "Bandana"));
		bandas.add(new Banda(3, "Los Redondos"));
		bandas.add(new Banda(4, "NTVG"));
		bandas.add(new Banda(5, "Viejas Locas"));
		
		return bandas;
	}
	
}
