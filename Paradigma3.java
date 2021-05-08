public class Paradigma3{
	public static void main(String[] args){
		ClienteIndividuo c1= new ClienteIndividuo("27014589");
		CajaDeAhorro cda= c1.obtenerCajaDeAhorro();
		cda.depositar(2500);
	}
}

class CajaDeAhorro {
	// Atributos aquí
	private float saldo;												// 18000
	private float saldoDescubierto;										//  5000
	
	// Metodos aquí
	public void depositar(float monto) {
		saldo = saldo + monto;
	}
	
	public void debitar(int monto) {									// 20000
		if( monto % 100 !=0) { 
			System.out.println("El monto ingresado debe ser multiplo de 100");
		}
		
		if( saldo >= monto ) {
			saldo = saldo - monto;
			System.out.println("Extraccion ok");
		}else{
			float montoExcedente = monto - saldo;						//  12000
			if( montoExcedente <= saldoDescubierto) {
				saldo = 0;
				saldoDescubierto = saldoDescubierto - montoExcedente;
				System.out.println("Extraccion ok");
			}else{
				System.out.println("No hay fondos suficientes");
			}
		} 
		   
	}
}

class ClienteIndividuo {
	// Atributos aquí
	private String dni;
	private CajaDeAhorro cuenta;
	
	// Constructores
	ClienteIndividuo(String d) {
		dni= d;
		// busca en la Base de Datos los datos 
		// de este cliente según el dni y 
		// completa los atributos
		cuenta=new CajaDeAhorro();
	}
	
	// Métodos aquí
	public CajaDeAhorro obtenerCajaDeAhorro(){ 
		return cuenta; 
	}
}
