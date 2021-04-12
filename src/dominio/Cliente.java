package dominio;

public class Cliente extends Persona{

	private int IdCliente;

	
	//CONSTRUCTORES
	public Cliente () {
		
	}
	
	public Cliente(int idCliente) {
		super();
		IdCliente = idCliente;
	}

	
	//GETTERS AND SETTERS
	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	
	
}
