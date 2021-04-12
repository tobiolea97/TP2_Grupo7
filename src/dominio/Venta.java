package dominio;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
	
	private static int Numerador = 0;

	// Propiedades
	private int Id;
	private DateFormat Fecha;
	private Cliente Client;
	private double Total;
	private ArrayList<Entrada> Entradas;
	
	// Constructores
	public Venta() {
		super();
	}
	
	public Venta(DateFormat fecha, Cliente client, double total, ArrayList<Entrada> entradas) {
		super();
		Numerador = Numerador + 1;
		Id = Numerador;
		DateFormat = fecha;
		Client = client;
		Total = total;
		Entradas = entradas;
	}
	
	// Getters y setter
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public DateFormat getFecha() {
		return Fecha;
	}
	public void setFecha(DateFormat fecha) {
		Fecha = fecha;
	}
	public Cliente getClient() {
		return Client;
	}
	public void setClient(Cliente client) {
		Client = client;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public ArrayList<Entrada> getEntradas() {
		return Entradas;
	}
	public void setEntradas(ArrayList<Entrada> entradas) {
		Entradas = entradas;
	}
	
	// Metodos
	
}
