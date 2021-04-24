public class Paradigma2{
	public static void main(String[] args){
		
		System.out.println("-- cuenta1 --");
		Cuenta cuenta1=new Cuenta(1,"args");
		cuenta1.depositar(60000);
		cuenta1.depositar(70000);
		cuenta1.debitar(15000);
		System.out.println(cuenta1.getEstado());
		
		System.out.println("-- cliente1 --");
		Cliente cliente1=new Cliente(1,"Ana",2);
		Cuenta cuenta=cliente1.getCuenta();
		cuenta.depositar(30000);
		
		cliente1.getCuenta().depositar(50000);
		cliente1.getCuenta().debitar(10000);
		
		System.out.println(cliente1.getEstado());
		System.out.println(cliente1.getCuenta().getEstado());
		
	}
}

class Cliente{
	private int nro;
	private String nombre;
	private Cuenta cuenta;
	
	public Cliente(int nro, String nombre, int nroCuenta){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=new Cuenta(nroCuenta,"args");
	}
	
	public Cuenta getCuenta(){
		return cuenta;
	}
	
	public String getEstado(){
		return nro+", "+nombre;
	}
}

class Cuenta{
	private int nro;
	private String moneda;
	private double saldo;
	
	public Cuenta(int nro, String moneda){
		this.nro=nro;
		this.moneda=moneda;
	}
	
	public void depositar(float monto){
		saldo=saldo+monto;
	}
	
	public void debitar(float monto){
		if(monto<=saldo){
			saldo=saldo-monto;
		}else{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public String getEstado(){
		return nro+", "+moneda+", "+saldo;
	}
}
