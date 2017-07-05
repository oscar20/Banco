
public class CuentaAhorro extends Cuenta {
	
	public CuentaAhorro(){
		super();
	}
		
	public void retiro(double ret){ //Solo sacar si se tiene arriba de 5 mil
		
		if(balance < 5000)
			System.out.println("No puedes retirar, tienes menos de 5 mil pesos! ");
		else
			balance = balance - ret;
			System.out.println("Retiro exitoso!");
	}
	
}
