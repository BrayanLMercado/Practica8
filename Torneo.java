/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 8: Relación Entre Clases
*/
public class Torneo {

	public static void main(String[] args) {
	
		int equipos=10,partidosjugados;
		
		System.out.println("Nombre Del Torneo: " + nombreTorneo());
		System.out.println("Región Del Torneo: " + asignarRegion());
		System.out.println("Equipos Participantes: " + equipos);
		partidosjugados=partidosJugados();
		System.out.println("Partidos Jugados: " + partidosjugados);
		System.out.println("Partidos Pendientes: " + partidosPendientes(partidosjugados) + "\n");
		System.out.println("*** Equipos Participantes *** " + "\n");
		Equipo team[]= new Equipo[5];
		
		team[0]=new Equipo();
		for(int i=1;i<team.length;i++){
			team[i]= new Equipo();
		}

	}
	public static String nombreTorneo(){
		String name [] = new String []{"Aros Felices","La Bola De Fuego","Spiritchill",
										"Sportvalley","Movestone","Urbanswing","Spikefast",
										"Suprasports","Northquest"};
		return name[(int)(0 + Math.random()*name.length)];
	}
	
	public static int partidosJugados(){
		return (int)( 0 + Math.random()*20);
	}
	
	public static int partidosPendientes(int jugados){
		return 20-jugados;
	}
	
	public static String asignarRegion(){
		String Reg [] = new String []{"Este", "Oeste"};
		return Reg[(int)(0 + Math.random()*Reg.length)];
	}

}
