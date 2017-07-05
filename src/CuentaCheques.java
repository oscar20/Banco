
public class CuentaCheques extends Cuenta {
	
	public CuentaCheques(){
		super();
	}
	
	public void retiro(double ret){
		balance = balance - ret;
	}
	

}
