package dominio;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class  Entrada {
	
	private static int ContEntradas;

	private String NroEntrada;
	private String NombreEvento;
	private TipoEvento objTipoEvento;
	private DateFormat FechaHoraEvento;
	private int DuracionEvento;
	private double Precio;
	
	
	//CONSTRUCTORES
	public Entrada ()
	{
		
	}
	
	public Entrada(String nombreEvento, TipoEvento tipoEvento, DateFormat fechaHoraEvento,
			int duracionEvento) {
		NombreEvento = nombreEvento;
		objTipoEvento = tipoEvento;
		FechaHoraEvento = fechaHoraEvento;
		DuracionEvento = duracionEvento;
		Precio = 0;
	}

	//GETTERS AND SETTERS
	public static int getContEntradas() {
		return ContEntradas;
	}

	public static void setContEntradas(int contEntradas) {
		ContEntradas = contEntradas;
	}
	public String getNroEntrada() {
		return NroEntrada;
	}
	public void setNroEntrada(String nroEntrada) {
		NroEntrada = nroEntrada;
	}
	public String getNombreEvento() {
		return NombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		NombreEvento = nombreEvento;
	}
	public TipoEvento getTipoEvento() {
		return objTipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		objTipoEvento = tipoEvento;
	}
	public DateFormat getFechaHoraEvento() {
		return FechaHoraEvento;
	}
	public void setFechaHoraEvento(DateFormat fechaHoraEvento) {
		FechaHoraEvento = fechaHoraEvento;
	}
	public int getDuracionEvento() {
		return DuracionEvento;
	}
	public void setDuracionEvento(int duracionEvento) {
		DuracionEvento = duracionEvento;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	@Override
	public String toString() {

		return " NroEntrada: " + NroEntrada + "\n NombreEvento: " + NombreEvento + "\n TipoEvento: " + objTipoEvento.getDescripcion()
				+ "\n FechaHoraEvento: " + FechaHoraEvento + "\n DuracionEvento: " + DuracionEvento + " mins \n Precio: " + String.format("%.2f", Precio);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DuracionEvento;
		result = prime * result + ((FechaHoraEvento == null) ? 0 : FechaHoraEvento.hashCode());
		result = prime * result + ((NombreEvento == null) ? 0 : NombreEvento.hashCode());
		result = prime * result + ((NroEntrada == null) ? 0 : NroEntrada.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((objTipoEvento == null) ? 0 : objTipoEvento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Entrada))
			return false;
		Entrada other = (Entrada) obj;
		if (DuracionEvento != other.DuracionEvento)
			return false;
		if (FechaHoraEvento == null) {
			if (other.FechaHoraEvento != null)
				return false;
		} else if (!FechaHoraEvento.equals(other.FechaHoraEvento))
			return false;
		if (NombreEvento == null) {
			if (other.NombreEvento != null)
				return false;
		} else if (!NombreEvento.equals(other.NombreEvento))
			return false;
		if (Double.doubleToLongBits(Precio) != Double.doubleToLongBits(other.Precio))
			return false;
		if (objTipoEvento == null) {
			if (other.objTipoEvento != null)
				return false;
		} else if (!objTipoEvento.equals(other.objTipoEvento))
			return false;
		return true;
	}

	public abstract void SetearPrecioEntrada(int tipoEntrada);
	 
}
