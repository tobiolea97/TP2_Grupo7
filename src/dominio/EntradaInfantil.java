package dominio;

import java.util.ArrayList;
import java.util.Date;

import interfaces.IEntradaNeg;
import interfaces.ListarDatos;

public class EntradaInfantil extends Entrada implements IEntradaNeg {
	
	private final static String CodigoEntrada = "I-";
	private final double PrecioMenores8 = 250;
	private final double PrecioMayores8 = 500;
	
	private boolean TieneSouvenir;
	
	//CONSTRUCTORES
	public EntradaInfantil() {
		super();
		
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
	}

	public EntradaInfantil(String nombreEvento, TipoEvento tipoEvento, DateFormat fechaHoraEvento, int duracionEvento,boolean tieneSouvenir, int tipo) {
		super(nombreEvento, tipoEvento, fechaHoraEvento, duracionEvento);
		
		TieneSouvenir = tieneSouvenir;
		int numEntrada  = getContEntradas() +1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		SetearPrecioEntrada(tipo);
	}
	
	public void setTieneSouvenir(boolean tieneSouvenir)
	{
		TieneSouvenir = tieneSouvenir;
	}
	
	public boolean getTieneSouvenir()
	{
		return TieneSouvenir; 
	}
	
	@Override
	public void SetearPrecioEntrada(int tipoEntrada) {
		if(tipoEntrada == 1) {
			setPrecio(PrecioMenores8);
		}
		else {
			setPrecio(PrecioMayores8);
		}
		
	}
		
	@Override
	public String toString() {
		return super.toString()+ "\n TieneSouvenir: " + TieneSouvenir;
	}

	@Override
	public void MostrarCantidadEntrasVendidas(ArrayList<Entrada> lista) {
		int cantEntradasConSouvenir = 0;
		int cantEntradasSinSouvenir = 0;

		for(Entrada obj : lista) {
			
			if(obj.getNroEntrada().contains(EntradaInfantil.CodigoEntrada)) {
				
				EntradaInfantil objInfantil = (EntradaInfantil) obj;
				
				if(objInfantil.getTieneSouvenir()) {
					cantEntradasConSouvenir++;
				}
				else {
					cantEntradasSinSouvenir++;
				}

			}
		}
		
		int totalEntradas = cantEntradasConSouvenir + cantEntradasSinSouvenir;
		
		System.out.println("************************************************");
		System.out.println("La cantidad de entradas para un evento infantil Vendidas son:");
		System.out.println("************************************************");
		System.out.println("Sourvenir: " + cantEntradasConSouvenir);
		System.out.println("Sin Souvenir: " + cantEntradasSinSouvenir);
		System.out.println("Total Entradas: " + totalEntradas);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (TieneSouvenir ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof EntradaInfantil))
			return false;
		EntradaInfantil other = (EntradaInfantil) obj;
		if (TieneSouvenir != other.TieneSouvenir)
			return false;
		return true;
	}
		
}
