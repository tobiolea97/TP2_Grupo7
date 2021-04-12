package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import interfaces.IEntradaNeg;
import interfaces.ListarDatos;

public class EntradaRecital extends Entrada implements IEntradaNeg {
	
	
	private final static String CodigoEntrada = "R-";
	private final double PrecioVIP = 1500;
	private final double PrecioGral = 800;
	
	private Banda Banda = new Banda(0, "-");
	private GeneroRecital genero;
	private Banda PrimeraBandaSoporte = new Banda(0, "-");;
	private Banda SegundaBandaSoporte = new Banda(0, "-");;
	
	//CONSTRUCTORES
	
	public EntradaRecital(){
		super();
		
		int numEntrada = getContEntradas()+1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
	}

	public EntradaRecital(String nombreEvento, TipoEvento tipoEvento, DateFormat fechaHoraEvento,
			int duracionEvento, Banda banda, GeneroRecital gen, Banda primeraBandaSoporte, Banda segundaBandaSoporte) {
		
		super(nombreEvento, tipoEvento, fechaHoraEvento, duracionEvento);
		
		int numEntrada = getContEntradas()+1;
		setContEntradas(numEntrada);
		String nroEntrada = CodigoEntrada + numEntrada;
		setNroEntrada(nroEntrada);
		
		Banda = banda;
		genero = gen;
		PrimeraBandaSoporte = primeraBandaSoporte;
		SegundaBandaSoporte = segundaBandaSoporte;
	}

	//GETTERS AND SETTERS
	public Banda getBanda() {
		return Banda;
	}
	public void setBanda(Banda banda) {
		Banda = banda;
	}
	public GeneroRecital getGenero() {
		return genero;
	}
	public void setGenero(GeneroRecital gen) {
		genero = gen;
	}
	public Banda getPrimeraBandaSoporte() {
		return PrimeraBandaSoporte;
	}
	public void setPrimeraBandaSoporte(Banda primeraBandaSoporte) {
		PrimeraBandaSoporte = primeraBandaSoporte;
	}
	public Banda getSegundaBandaSoporte() {
		return SegundaBandaSoporte;
	}
	public void setSegundaBandaSoporte(Banda segundaBandaSoporte) {
		SegundaBandaSoporte = segundaBandaSoporte;
	}
	
	public static String ObtenerProxNumeroEntrada() {
		String nroEntrada = "9"; //CodigoEntrada + (ContEntradas+1);
		
		return nroEntrada;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Banda: " + Banda.getNombre() + "\n Genero: " + genero.getDescripcion()
			+ "\n PrimeraBandaSoporte: " + PrimeraBandaSoporte.getNombre()
			+ "\n SegundaBandaSoporte: " + SegundaBandaSoporte.getNombre();
	}

	public void SetearPrecioEntrada(int tipoEntrada) {
		
		if(tipoEntrada == 1) {
			setPrecio(PrecioVIP);
		}
		else {
			setPrecio(PrecioGral);
		}
	}

	@Override
	public void MostrarCantidadEntrasVendidas(ArrayList<Entrada> lista) {
		int cantEntradasRock = 0;
		int cantEntradasHM = 0;
		int cantEntradasReggaeton = 0;
		int cantEntradasTrap = 0;
		int cantEntradasLat = 0;
		int cantEntradasPop = 0;

		for(Entrada obj : lista) {
			
			
			if(obj.getNroEntrada().contains(EntradaRecital.CodigoEntrada)) {
				
				EntradaRecital objRecital = (EntradaRecital) obj;
			
				switch (objRecital.getGenero().getId()) {
				
					case 1:
						cantEntradasRock++;
						break;
					case 2:
						cantEntradasHM++;
						break;
					case 3:
						cantEntradasReggaeton++;
						break;
					case 4:
						cantEntradasTrap++;
						break;
					case 5:
						cantEntradasLat++;
						break;
					case 6:
						cantEntradasPop++;
						break;
							
				}								

			}
		}
		
		int totalEntradas = cantEntradasRock + cantEntradasHM + cantEntradasReggaeton + cantEntradasTrap + cantEntradasLat + cantEntradasPop;
		
		System.out.println("************************************************");
		System.out.println("La cantidad de entradas Vendidas por genero de recital son:");
		System.out.println("************************************************");
		System.out.println("Rock: " + cantEntradasRock);
		System.out.println("Heavy Metal: " + cantEntradasHM);
		System.out.println("Reggateon: " + cantEntradasReggaeton);
		System.out.println("Trap: " + cantEntradasTrap);
		System.out.println("Latino: " + cantEntradasLat);
		System.out.println("Pop: " + cantEntradasPop);
		System.out.println("Total Entradas: " + totalEntradas);
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Banda == null) ? 0 : Banda.hashCode());
		result = prime * result + ((PrimeraBandaSoporte == null) ? 0 : PrimeraBandaSoporte.hashCode());
		result = prime * result + ((SegundaBandaSoporte == null) ? 0 : SegundaBandaSoporte.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof EntradaRecital))
			return false;
		EntradaRecital other = (EntradaRecital) obj;
		if (Banda == null) {
			if (other.Banda != null)
				return false;
		} else if (!Banda.equals(other.Banda))
			return false;
		if (PrimeraBandaSoporte == null) {
			if (other.PrimeraBandaSoporte != null)
				return false;
		} else if (!PrimeraBandaSoporte.equals(other.PrimeraBandaSoporte))
			return false;
		if (SegundaBandaSoporte == null) {
			if (other.SegundaBandaSoporte != null)
				return false;
		} else if (!SegundaBandaSoporte.equals(other.SegundaBandaSoporte))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		return true;
	}

	
}
