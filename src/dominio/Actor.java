package dominio;

import java.util.ArrayList;

public class Actor {
	private int Id;
	private String Nombre;
	private String Apellido;
	
	public Actor(int id, String nombre, String apellido) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
	}
	public Actor(int id) {
		ArrayList<Actor> actores = MasterData.GetActores();
		for(Actor obj : actores) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.Nombre = obj.getNombre();
				this.Apellido = obj.getApellido();
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
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
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
		if (!(obj instanceof Actor))
			return false;
		Actor other = (Actor) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
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
