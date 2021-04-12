package dominio;

import java.util.ArrayList;

public class Deporte {
	
	int Id;
	String nombreDeporte;
    double precio;
    final double PrecioFutbol = 300;
    final double PrecioHockey = 380;
    final double PrecioRugby = 450;
	
	public Deporte() {}
	
	
	
	public Deporte(int id) {
		super();
		Id = id;
		this.nombreDeporte = nombreDeporte;
		this.precio = precio;
		
		if(id == 1)
		{
			this.nombreDeporte = "Futbol";
			this.precio = PrecioFutbol;
		}
		if(id == 2)
		{
			this.nombreDeporte = "Hockey";
			this.precio = PrecioHockey;
		}
		if(id == 3)
		{
			this.nombreDeporte = "Rugby";
			this.precio = PrecioRugby;
		}
	}

	/*public Deporte(int id) {
		ArrayList<Deporte> deportes = MasterData.GetDeportes();
		for(Deporte obj : deportes) {
			if(obj.getId() == id)
			{
				this.Id = obj.getId();
				this.nombreDeporte = obj.getNombreDeporte();
				this.precio = obj.getPrecio();
			}
		}
	}*/

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}



	public Deporte(String nombreDeporte, double precio) {
		
		this.nombreDeporte = nombreDeporte;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Deporte [nombreDeporte=" + nombreDeporte + "]";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombreDeporte() {
		return nombreDeporte;
	}

	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}

}
