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
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.velocidad);
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="VW";
		auto2.modelo="UP";
		auto2.acelerar();
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.velocidad);
		
		
	}//end main
}//end class Paradigma


//declaración de clase
class Auto{
	
	// Atributos
	String marca;
	String modelo;
	int velocidad;
	
	// Métodos
	public void acelerar(){
		velocidad=velocidad+10;
	}
	
	public void frenar(){
		velocidad=velocidad-10;
	}
	
}//end class Auto
