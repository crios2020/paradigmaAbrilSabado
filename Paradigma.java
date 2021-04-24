import javax.swing.JOptionPane;

public class Paradigma{
	public static void main(String[] args){
		//Punto de entrada 
		System.out.println("Hola Mundo!!!");
		
		//creamos objetos de la clase Auto
		System.out.println("-- auto1 --");
		Auto auto1 = new Auto();	//construye el objeto
		auto1.marca="Fiat";
		auto1.modelo="Toro";
		auto1.acelerar();			// 10
		auto1.acelerar();			// 20
		auto1.acelerar();			// 30
		auto1.frenar();				// 10
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.obtenerVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="VW";
		auto2.modelo="UP";
		auto2.acelerar();				// 10
		auto2.acelerar(24,false);				// 34
		for(int a=0;a<=40;a++){
			auto2.acelerar();
		}
		//auto2.velocidad=450;
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.obtenerVelocidad());
		//auto2.imprimirVelocidad();
		//System.out.println(auto2.obtenerVelocidad());
		
		//JOptionPane.showMessageDialog(null,"Velocidad: "+auto2.obtenerVelocidad());
		
		
	}//end main
}//end class Paradigma


//declaración de clase
class Auto{
	
	// Atributos
	String marca;
	String modelo;
	private int velocidad;
	
	// Métodos
	void acelerar(){								//acelerar
		//velocidad=velocidad+10;
		//if(velocidad>100){
		//	velocidad=100;
		//}
		acelerar(10);
	}
	
	private void acelerar(int kilometros){					//acelerarInt
		velocidad=velocidad+kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void acelerar(int kilometros, boolean nitro){			//acelerarIntBoolean
		if(nitro==true){
			//velocidad=velocidad+kilometros*2;
			acelerar(kilometros*2);
		}else{
			//velocidad=velocidad+kilometros;
			acelerar(kilometros);
		}
		//if(velocidad>100){
		//	velocidad=100;
		//}
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	void imprimirVelocidad(){
		System.out.println(velocidad);
	}
	
	int obtenerVelocidad(){
		return velocidad;
	}
	
}//end class Auto
//					Banco banco=new Banco("Galicia",5000);
//					banco.nombre="Pirulo hms";
//					banco.setNombre("Pirulo");
class Banco {
	// Atributos aquí
	private String nombre;
	private int cantidadDeEmpleados;
	
	// Métodos aquí
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCantidadDeEmpleados(int c) { 
		cantidadDeEmpleados= c;
	}
	
	public int getCantidadDeEmpleados() {
		return cantidadDeEmpleados;
	}
}




