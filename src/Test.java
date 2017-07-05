//import java.util.Scanner;

public class Test {
	static int select = -1;

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new CuentaAhorro();
		cuenta1.setbalance(300);
		cuenta1.deposito(10000);
		cuenta1.retiro(300);
		
		//Creo mis instancias de Cliente
		Cliente customer = new Cliente("Oscar","Almazan",cuenta1);
		Cliente customer2 = new Cliente();
		customer2.setNombre("Raul");
		customer2.setApellido("Gonzalez");
		Cliente customer3 = new Cliente("Karina","Perez");
		
		//Creo mi instancia de banco y agrego clientes
		Banco bank = new Banco();
		bank.addCliente(customer);
		bank.addCliente(customer2);
		bank.addCliente(customer3);
		
		
		int numClientes = bank.getNCliente();
		System.out.println("El número de clientes es de: " + numClientes);
		
		//Cliente result_cliente = 
		bank.getCliente("Oscar");
		//System.out.println("Cliente: " + result_cliente.getNombre());
		
		/*Scanner sc = new Scanner(System.in);
		Cuenta mi_cuenta = new Cuenta();
		Cliente mi_cliente = new Cliente("Oscar","Almazan",mi_cuenta);
		Cliente mi_cliente2 = new Cliente("Raul","Gonzalez",mi_cuenta);
		Banco mi_banco = new Banco();
		
		mi_banco.addCliente(mi_cliente);
		mi_banco.addCliente(mi_cliente2);
		System.out.println("El numero de clientes es: " + mi_banco.getNCliente());
		Cliente c = mi_banco.getCliente(mi_cliente.getNombre());
		
		System.out.println("El balance del cliente: " + mi_cliente.getNombre() + " es de: " +  c.getCuenta().getBalance());
		String nombre_cliente = "";
		
		*/
		/*while(select != 0 ){
			System.out.println("Ingresa la opcion que desees\n"
					+ "1.- Consultar balance\n"
					+ "2.- Depositar\n"
					+ "3.- Retirar\n"
					+ "0.- Salir");
			String valor_seleccionado = sc.nextLine();
			select = Integer.parseInt(valor_seleccionado);
			
				switch(select){
					case 1:
						//double balance =  mi_cuenta.getBalance();
						//System.out.println("Tu balance es de: " + balance);
					    nombre_cliente = mi_cliente.getNombre();
						System.out.println("El balance de " + mi_cliente.getNombre() + " es: " + mi_cliente.getCuenta().getBalance());
						
					break;
					case 2:
						System.out.println("Ingresa la cantidad a depositar..");
						String deposito = sc.nextLine();
						double int_deposito = Double.parseDouble(deposito);
						//mi_cuenta.deposito(int_deposito);
						nombre_cliente = mi_cliente.getNombre();
						mi_cliente.getCuenta().deposito(int_deposito);
						System.out.println("El cliente: " + nombre_cliente + " realizo un deposito por la cantidad de: " + int_deposito + " pesos");
					break;
					case 3:
						System.out.println("Ingresa la cantidad a retirar...");
						String retiro = sc.nextLine();
						double int_retiro = Double.parseDouble(retiro);
						nombre_cliente = mi_cliente.getNombre();
						//mi_cuenta.retiro(int_retiro);
						mi_cliente.getCuenta().retiro(int_retiro);
						System.out.println("El cliente: " + nombre_cliente + " realizo un retiro por la cantidad de: " + int_retiro + " pesos");
					break;
					default:
						System.out.println("No ingresaste un numero correcto! ");
					break;
				}
		}*/
		
		
		
		
		
	}

}
