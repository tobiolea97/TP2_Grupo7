package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

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
	
	public Venta(DateFormat fecha, Cliente client, ArrayList<Entrada> entradas) {
		super();
		Numerador = Numerador + 1;
		Id = Numerador;
		Fecha = fecha;
		Client = client;
		Entradas = entradas;
		ListIterator<Entrada> iterator = entradas.listIterator();
		while(iterator.hasNext())
		{
			Total += iterator.next().getPrecio();
		}	
		
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

	@Override
	public String toString() {
		
		ListIterator<Entrada> iterator = Entradas.listIterator();
		String stringEntradas = "";
		while(iterator.hasNext())
		{
			Entrada entrada = iterator.next();
			stringEntradas += "----- Id: " + entrada.getNroEntrada();
			stringEntradas += " - Nombre evento: " + entrada.getNombreEvento() + "\n";
		}
		
		return
			"Numero de entrada: " + Id + "\n" +
			"Fecha: " + Fecha + "\n" +
			"Cliente: " + Client.getApellido() + " " + Client.getNombre()  + "\n" +
			"Total: " + Total + "\n" +
			"Entradas: \n" + stringEntradas;
			
	}
	
}
