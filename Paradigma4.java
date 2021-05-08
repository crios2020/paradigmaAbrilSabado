public class Paradigma4{
	public static void main(String[] args){
		
		Auto.acelerar();												// 10
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("VW","Gol");
		Auto.acelerar();												// 20
		System.out.println(auto1.getEstado()+" "+Auto.getVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto("Fiat","Palio");
		Auto.acelerar();												// 30
		System.out.println(auto2.getEstado()+" "+Auto.getVelocidad());
		System.out.println(auto1.getEstado()+" "+Auto.getVelocidad());
	}
}

class Auto{
	private String marca;
	private String modelo;
	private static int velocidad;
	
	public Auto(String marca,String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public String getEstado(){
		return marca+" "+modelo;
	}
	
	public static void acelerar(){
		velocidad=velocidad+10;
	}
	
	public static void frenar(){
		velocidad=velocidad-10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
}
