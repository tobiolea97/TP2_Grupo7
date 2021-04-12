package dominio;

import java.util.ArrayList;

import interfaces.ListarDatos;

public class TipoEvento implements ListarDatos{
	private int CodigoTipoEvento;
	private String Descripcion;
	
	//CONSTRUCTORES
		public TipoEvento () {
			
		}
		public TipoEvento (int CodigoTipoEvento,String Descripcion) {
			this.CodigoTipoEvento=CodigoTipoEvento;
			this.Descripcion=Descripcion;
		}
		
		public TipoEvento(int id) {
			ArrayList<TipoEvento> tipos = MasterData.GetTiposDeEvento();
			for(TipoEvento obj : tipos) {
				if(obj.getCodigoTipoEvento() == id)
				{
					this.CodigoTipoEvento = id;
					this.Descripcion = obj.getDescripcion();
				}
			}
		}

		
		//GETTERS AND SETTERS
		public int getCodigoTipoEvento() {
			return CodigoTipoEvento;
		}

		public void setCodigoEvento(int codigoTipoEvento) {
			CodigoTipoEvento = codigoTipoEvento;
			
			if(codigoTipoEvento == 1) {
				Descripcion = "Recital";
			}
			else if(codigoTipoEvento == 2) {
				Descripcion = "Teatro";
			}
			else if(codigoTipoEvento == 3) {
				Descripcion = "Infantil";
			}
			else {
				Descripcion = "Deportes";
			}
		}

		public String getDescripcion() {
			return Descripcion;
		}



		@Override
		public String toString() {
			return "CodigoTipoEvento=" + CodigoTipoEvento + ", Descripcion=" + Descripcion;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + CodigoTipoEvento;
			result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof TipoEvento))
				return false;
			TipoEvento other = (TipoEvento) obj;
			if (CodigoTipoEvento != other.CodigoTipoEvento)
				return false;
			if (Descripcion == null) {
				if (other.Descripcion != null)
					return false;
			} else if (!Descripcion.equals(other.Descripcion))
				return false;
			return true;
		}
		@Override
		public void listarReferencias(ArrayList<Entrada> listaEntradas) {
			System.out.println("Entradas a eventos del tipo " + Descripcion);
			for(Entrada obj : listaEntradas) {
				if(obj.getTipoEvento().getCodigoTipoEvento() == CodigoTipoEvento) {
					System.out.println("************************************************");
					System.out.println(obj.toString());
					System.out.println("\n");
				}
			}
		}
}
