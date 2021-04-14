package dominio;

public class Cliente extends Persona{

	private int IdCliente;

	
	//CONSTRUCTORES
	public Cliente () {
		
	}
	
	
	
	public Cliente(int idCliente, String nombre, String apellido, String dNI, String direccion, String genero, String localidad,
			String provincia) {
		super(nombre, apellido, dNI, direccion, genero, localidad, provincia);
		IdCliente = idCliente;
		// TODO Auto-generated constructor stub
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
