package dominio;

import java.util.ArrayList;
import java.util.Date;

import interfaces.IEntradaNeg;

public  class EntradaDeporte  extends Entrada {
		Deporte D1;
		private final static String CodigoEntrada = "D-";
		double valorEntrada;
		boolean Internacional = false;
		
		
	public EntradaDeporte() {
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);}	
	
	
	public EntradaDeporte(String nombreEvento, TipoEvento tipoEvento, DateFormat date, int duracionEvento, Deporte d1, boolean internacional) {
		super(nombreEvento, tipoEvento, date, duracionEvento);
		
		
		this.D1 = d1;
		//this.valorEntrada=calcularValorEntrada();
		this.Internacional = internacional;
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		SetearPrecioEntrada(0);
	}


	public Deporte getD1() {
		return D1;
	}



	public void setD1(Deporte d1) {
		D1 = d1;
	}

	@Override
	public void SetearPrecioEntrada(int valorEntrada) {
		
		setPrecio(this.Internacional ? this.getD1().getPrecio() * 1.3 : this.getD1().getPrecio());  
	}


	@Override
	public String toString() {
		return super.toString()+ "\n";
	}
}
