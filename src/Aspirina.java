import java.util.Scanner;

public class Aspirina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Humano Farmaceutica = new Humano("Alba", 167, 65.5, 2000, 20);
		Humano Madre = new Humano("Caren", 170, 71.5, 1500, 0);
		Humano Hijo = new Humano("Jorge", 180, 82, 0, 0);
		double cantDinero = 0;

		Hijo.saludarHijo();
		Madre.estadoMadre();
		Hijo.buscarAspirinas();
		Hijo.respuestaHijo();
		System.out.print("Introduce la cantidad de dinero a dar: ");
		cantDinero = in.nextDouble();
		Hijo.recibirDinero(cantDinero, Madre);
		System.out.println("\nLlegando a la farmacia.... \n");
		Hijo.llegarFarmacia(Farmaceutica);
		Hijo.Farmacia(Farmaceutica, Madre);
		System.out.println("\nLlegando a casa..... \n");
		Hijo.yaEnCasa(Madre);
		Hijo.finalHistoria(Madre);

		System.out.println("Al final de la historia " + Hijo.getNombre() + " consiguio quedarse con " + Hijo.getDinero()
				+ "€.Y la madre se quedo con " + Madre.getAspirinas()
				+ " aspirinas por si le vuelve a doler la cabeza.");
		in.close();
	}
}