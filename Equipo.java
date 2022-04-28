/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 8: Relación Entre Clases
*/
public class Equipo {
	public Equipo(){
		String entrenador;
		int torneosParticipados,jugadoresT=10,puntosTotales=0;
		entrenador=asignarEntrenador();
		torneosParticipados=participacionEnTorneos(torneosGanados(),torneosPerdidos());
		
		System.out.println("Nombre Del Equipo: " + asignarNombre());
		System.out.println("Divisón: " + asiganrDivision());
		System.out.println("Jugadores Registrados: " + jugadoresT);
		
		// Creación de Jugadores
		Jugador jugadores[]= new Jugador[10];
		jugadores[0]=new Jugador();
		
		for(int i=1;i<jugadores.length;i++){
			jugadores[i]= new Jugador();
			puntosTotales+=jugadores[i].totalPoints();
		}
		System.out.println("Puntos Totales Del Equipo: " + puntosTotales + "\n");
	}
	
	// Métodos
	public int participacionEnTorneos(int ganados,int perdidos){
		return ganados+perdidos;
	}
	
	public int torneosGanados(){
		return (int)(0 + Math.random()*99);
	}
	
	public int torneosPerdidos(){
		return (int)(0 + Math.random()*99);
	}
	
	public String asiganrDivision(){
		String division[]= new String[]{"Atlántico","Central","Sureste","Noroeste",
										"Pacífico","Suroeste"};
		return division[(int)(0 + Math.random()*division.length)];
	}
	
	public String asignarEntrenador(){
		String Entrenador [] = new String[]{"Nate McMillan","Steve Nash","Billy Donovan","J. Bickerstaff",
											"Dwane Casey","Rick Carlisle","Wes Unseld Jr","Tom Thibodeau",
											"Nick Nurse","Doc Rivers","Dwane Casey","Jason Kidd","Tyronn Lue",
											"Chris Finch","Willie Green","Mark Daigneault"};
		return Entrenador[(int)(0 + Math.random()*Entrenador.length)];
	}
	
	public String asignarNombre(){
		String Team[]= new String[]{"Warriors","Celtics","Nets","Lakers","Suns","Raptors","76ers","Bulls",
									"Bucks","Heat","Mavericks","Timberwolves","Grizzilies","Pelicans",
									"Hawks","Nuggets","Jazz","Spurs","Knicks","Cavaliers","Hornets","Wizards",
									"Blazers","Thunder","Spurs","Rockets","Kings","Harlem Globetrotters"};
		return Team[(int)(0 + Math.random()*Team.length)];
	}
	
}
