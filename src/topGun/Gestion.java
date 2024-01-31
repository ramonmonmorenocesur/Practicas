package topGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		escuelaAviacion();

	}
	
	static void escuelaAviacion() {
		// OBJETOS
		
		Scanner teclado = new Scanner(System.in);

		Piloto piloto1 = new Piloto( "Pete Maverick", 10000, "capitan");
		Piloto piloto2 = new Piloto("Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto( "Bradley Rooster", 3500, "teniente");

		// DATOS 4º PILOTO

		System.out.println("Introduce los datos del 4º piloto!");
	
		System.out.println("Nombre: ");
		String nombre4 = teclado.nextLine();

		System.out.println("Número de horas: ");
		int horas4 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Puesto: ");
		String puesto4 = teclado.nextLine();

		Piloto piloto4 = new Piloto( nombre4, horas4, puesto4);

		// DATOS PILOTO 5º

		System.out.println("Introduce los datos del 5º piloto!");

		

		System.out.println("Nombre: ");
		String nombre5 = teclado.nextLine();

		System.out.println("Número de horas: ");
		int horas5 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Puesto: ");
		String puesto5 = teclado.nextLine();

		Piloto piloto5 = new Piloto(nombre5, horas5, puesto5);

		// MOSTRAR INFORMACION PILOTOS

		piloto1.mostrarPiloto();

		piloto3.mostrarPiloto();

		piloto4.mostrarPiloto();

		piloto5.mostrarPiloto();

		// CREAMOS AVIONES

			// AVIONES CREADOS A MANO

		Combate combate1 = new Combate("EuroFighter", 2, piloto1, true);
		Combate combate2 = new Combate("F35", 3, piloto2, false);
		Entrenamiento entrenamiento1 = new Entrenamiento("F22", 2, piloto3, true);

			// AVIONES QUE SE PIDEN POR TECLADO

				// ENTRENAMIENTO 2

		System.out.println("Introduce los datos del avión de entrenamiento 2: ");

	
		System.out.println("Modelo del avión: ");
		String modeloEntre2 = teclado.nextLine();

		System.out.println("Capacidad del avión: ");
		int capEntre2 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("¿Tiene doble mando?: ");
		boolean esDobleMandoEntre2 = teclado.nextBoolean();
		teclado.nextLine();

			// Creamos objeto

		Entrenamiento entrenamiento2 = new Entrenamiento(modeloEntre2, capEntre2, piloto2,
				esDobleMandoEntre2);

			// ENTRENAMIENTO 3

		System.out.println("Introduce los datos del avión de entrenamiento 3: ");


		System.out.println("Modelo del avión: ");
		String modeloEntre3 = teclado.nextLine();

		System.out.println("Capacidad del avión: ");
		int capEntre3 = teclado.nextInt();
		teclado.nextLine();

		System.out.println("¿Tiene doble mando?: ");
		boolean esDobleMandoEntre3 = teclado.nextBoolean();
		teclado.nextLine();

			// Creamos objeto

		Entrenamiento entrenamiento3 = new Entrenamiento(modeloEntre3, capEntre3, piloto3,
				esDobleMandoEntre3);

		// MOSTRAR INFORMACION AVIONES Y PILOTOS RESPECTIVOS

		combate1.mostrarAvion(); 
		combate2.mostrarAvion();
		entrenamiento1.mostrarAvion();

		entrenamiento2.mostrarAvion();
		System.out.println("Cuenta con doble mando?: " + entrenamiento3.isTieneDobleMando());

		entrenamiento3.mostrarAvion();
		System.out.println("Cuenta con doble mando?: " + entrenamiento3.isTieneDobleMando());

		teclado.close();
	}
}