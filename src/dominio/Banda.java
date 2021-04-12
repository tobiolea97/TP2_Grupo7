package dominio;

import java.util.ArrayList;

public class Banda {
	private int Id;
	private String Nombre;
	public Banda(int id, String nombre) {
		super();
		Id = id;
		Nombre = nombre;
	}
	public Banda(int id) {
		ArrayList<Banda> bandas = MasterData.GetBandas();
		for(Banda obj : bandas) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.Nombre = obj.getNombre();
			}
		}
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Banda))
			return false;
		Banda other = (Banda) obj;
		if (Id != other.Id)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
	
	
	
	
}
