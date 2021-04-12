package dominio;

import java.util.ArrayList;

import interfaces.ListarDatos;

public class GeneroTeatro implements ListarDatos {
	
	private int Id;
	private String Descripcion;
	public GeneroTeatro(int id, String descripcion) {
		super();
		Id = id;
		Descripcion = descripcion;
	}
	public GeneroTeatro(int id) {
		ArrayList<GeneroTeatro> generos = MasterData.GetGenerosTeatro();
		for(GeneroTeatro obj : generos) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.Descripcion = obj.getDescripcion();
			}
		}
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	@Override
	public void listarReferencias(ArrayList<Entrada> listaEntradas) {
		System.out.println("************************************************");
		System.out.println("Entradas a eventos del tipo Teatro y genero " + Descripcion);
		for(Entrada obj : listaEntradas) {
			if(obj instanceof EntradaTeatro)
			{
				EntradaTeatro entradaTeatro = (EntradaTeatro)obj;
				if(entradaTeatro.getGenero().getId() == Id)
				{
					System.out.println("************************************************");
					System.out.println(obj.toString());
					System.out.println("\n");
				}
			}
		}
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + Id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GeneroTeatro))
			return false;
		GeneroTeatro other = (GeneroTeatro) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (Id != other.Id)
			return false;
		return true;
	}
	
	
	
}
