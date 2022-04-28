/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 8: Relación Entre Clases
*/
public class Jugador {

	public Jugador(){
		String nombre,posicion;
		int numero,puntosAnotados;
		double estatura;
		nombre=createName();
		numero=asignarNumero();
		posicion=asignarPosicion();
		estatura=estatura();
		System.out.println("Nombre Del Jugador: " + nombre);
		System.out.println("Número De Jugador: " + numero);
	}
	
	public String createName(){
		String name[]= new String []{"Devin","Rudy","Joel","Kawhi","Anthony","Nikola",
									 "Kobe","Chris","Damian","Jimmy","Paul","Bam","Donovan",
									 "Jayson","Ben","Moses","Stephen","LeBron"};
		
		String apellido[]= new String []{"Booker","Gobert","Embiid","Leonard","Davis","Jokic",
										 "Bryant","Paul","Lillard","Butler","George","Abebayo","Mitchell",
										 "Tatum","Simmons","Malone","Curry","James"};
		
		StringBuilder playerName = new StringBuilder();
		playerName.append(name[(int)(0 + Math.random()*name.length)] + " " + apellido[(int)(0 + Math.random()*apellido.length)]);
		return playerName.toString();
	}
	
	public int totalPoints(){
		return (int)(10 + Math.random()*120);
	}
	
	public int asignarNumero(){
		return (int)(1 + Math.random()*99);
	}
	
	public String asignarPosicion(){
		String place[]= new String []{"Base","Escolta","Alero","Ala-Pivot","Pivot"};
		String posicion=place[(int)(0 + Math.random()*place.length)];
		return posicion;
	}
	
	public double estatura(){
		double a=1.6 + Math.random()*2;
		return Math.round(a*100.0)/100.0;
	}
	
	
}
