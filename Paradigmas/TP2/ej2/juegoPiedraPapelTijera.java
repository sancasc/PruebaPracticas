package ej2;

import java.util.Random;
import java.util.Scanner;

public class juegoPiedraPapelTijera {

	public static final int PIEDRA = 0;
	public static final int PAPEL = 1;
	public static final int TIJERA = 2;
	
	
	public static void main(String[] args) {
		
		String exit = "inicial";
		
		while (!exit.toUpperCase().equals("SALIR"))
		{
			System.out.println("Piedra, papel o tijera? ya!");
			Scanner sc = new Scanner(System.in);
			String fase = sc.next();
			
			int numeroRandom = new Random().nextInt(3);
			
			switch(fase.toUpperCase())
			{
			case "PIEDRA":
				if (PIEDRA == numeroRandom) System.out.println("Empate!");
				if (numeroRandom == 1)	System.out.println("Gana la compu!");
				if (numeroRandom == 2)	System.out.println("Ganaste!!");
				break;
			case "PAPEL":
				if (PAPEL == numeroRandom) System.out.println("Empate!");
				if (numeroRandom == 2) System.out.println("Gana la compu!");
				if (numeroRandom == 0) System.out.println("Ganaste!!");
				break;
			case "TIJERA":
				if (TIJERA == numeroRandom) System.out.println("Empate!");
				if (numeroRandom == 0) System.out.println("Gana la compu!");
				if (numeroRandom == 1) System.out.println("Ganaste!!");
				break;			
			}
			
			
			System.out.println("Presione una tecla para continuar");
			System.out.println("Presione salir para cerrar el juego");
			exit = sc.next();	
		}
}

}
