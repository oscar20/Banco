public class Banco {
	private int num_clientes = 0;
	private Cliente[] arreglo_clientes = new Cliente[10]; //arreglos
		
	public Banco(){
		
	}
	
	public void addCliente(Cliente c){ //añadir cliente
		int numero_de_clientes = getNCliente();
		if(numero_de_clientes < 10){
			arreglo_clientes[numero_de_clientes] = c;
			System.out.println("El cliente: " + c.getNombre() + " " + c.getApellido() + " se agrego al arreglo");
			num_clientes = num_clientes + 1;
		}else{
			System.out.println("Excediste en el numero de Clientes en el arreglo");
		}
			
		
	}
	
	public int getNCliente(){
		return num_clientes;
	}
	
	public void getCliente(String nombre_cliente){
		//Cliente customer = null;
		int num_clientes = getNCliente();
		for(int i=0;i<num_clientes;i++){
			if(arreglo_clientes[i].getNombre().equals(nombre_cliente)){
				System.out.println("El cliente existe");//customer = new Cliente(arreglo_clientes[i].getNombre(),arreglo_clientes[i].getApellido()); 
			}else{
				System.out.println("El cliente no existe");//customer = new Cliente();
				
			}
			
		}
		
		
	}
	
	

}
