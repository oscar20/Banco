
public class Cuenta {

	protected double balance; //Variable balance de cuenta, es protegida para poder acceder desde la clase heredada
	
	public Cuenta(){ //Constructor 
		
	}
	
	public void setbalance(double balance){
		this.balance = balance ; 
	}
	
	public double getbalance(){
		return this.balance;
	}
		
	public double getBalance(){
		return balance;
	}
	
	public void deposito(double b){
		System.out.println("Depositaste la cantidad de: " + b);
		balance = balance + b;
		System.out.println("Tu balance ahora es de: " + balance);
		
	}
	
	public void retiro(double b){
		System.out.println("Retiraste la cantidad de: " + b);
		balance = balance - b;
		System.out.println("Ahora el balance es de: " + balance);
		
	}
	
	

}
