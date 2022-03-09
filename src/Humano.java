public class Humano {
	private String nombre = "";
	private int estatura = 0;
	private double peso = 0;
	private double dinero;
	private int aspirinas;

	public Humano(String nombre, int estatura, double peso, double dinero, int aspirinas) {
		this.nombre = nombre;
		this.estatura = estatura;
		this.peso = peso;
		this.dinero = dinero;
		this.aspirinas = aspirinas;
	}

	public int getEstatura() {
		return estatura;
	}

	public double getPeso() {
		return peso;
	}

	public String getNombre() {
		return nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public int getAspirinas() {
		return aspirinas;
	}

	public void saludarHijo() {
		System.out.println(nombre + ": Hola mama, ¿Que tal estas?.");
	}

	public void estadoMadre() {
		System.out.println(nombre
				+ ": Un poco mal hijo, me esta empezando a doler mucho la cabeza. ¿Podrias acercarte al botiquin y traerme una aspirina ?.");
	}

	public void buscarAspirinas() {
		System.out.println(nombre + ": Voy a ver si hay, dame un momento.");
	}

	public void respuestaHijo() {
		System.out.println(nombre
				+ ": Mamá no quedan aspirinas en el botiquin. Dame dinero y voy a comprar unas aspirinas a la farmacia de al lado.");
	}

	public void recibirDinero(double cantDinero, Humano rol) {
		System.out.println(rol.nombre + ": Toma " + cantDinero + "€ hijo.");
		dinero += cantDinero;
		rol.dinero -= cantDinero;
		System.out.println(nombre + ": Gracias mama. Ahora vuelvo , no tardo nada.");
	}

	public void llegarFarmacia(Humano rol) {
		System.out.println(rol.nombre + ": Buenos dias chico, ¿que desea?.");
		System.out.println(nombre + ": Muy buenas. Queria una caja de aspirinas para mi madre.");
	}

	public void Farmacia(Humano rol, Humano rol1) {
		boolean tener = true;
		System.out.println(rol.nombre
				+ ": Pues mire tenemos un paquete de diez aspirinas por 15,99€ o cinco aspirinas por 7,99€. ¿Cual prefiere?.");
		if (dinero >= 15.99) {
			System.out.println(nombre + ": Deme la de 15,99€ por favor.");
			rol1.aspirinas += 10;
			dinero -= 15.99;
		} else if (dinero >= 7.99) {
			System.out.println(nombre + ": Deme la de 7,99€ por favor.");
			dinero -= 7.99;
			rol1.aspirinas += 5;
		} else {
			tener = false;
		}

		if (tener) {
			System.out.println(rol.nombre + ": Aqui tiene.");
			System.out.println(nombre + ": Muchas gracias.");
			System.out.println(rol.nombre + ": A ti , que pase un buen dia y que se mejore tu madre!" + "\n" + nombre
					+ ": Gracias... Adios!");
		} else {
			System.out.println(nombre + ": Lo siento no me llega el dinero. Voy a casa y vuelvo. Hasta ahora!.\n"
					+ rol.nombre + ": De acuerdo. Hasta ahora");
		}

	}

	public void yaEnCasa(Humano rol) {
		System.out.println(nombre + ": Hola mama, ya he vuelto. ¿Como te encuentras?.");
		System.out.println(rol.nombre + ": Ahi ahi hijo." + "\n" + nombre + ": Compre " + aspirinas
				+ " aspirinas. Toma una,ahora te traigo un vaso de agua.");
		rol.aspirinas--;
	}

	public void finalHistoria(Humano rol) {
		System.out.println(rol.nombre + ": Muchas gracias hijo.");
		System.out.println(nombre + ": Por cierto toma el dinero que me sobro" + "\n" + rol.nombre
				+ ": Quedate con el cambio para gastar en lo que quieras.");
		System.out.println(nombre + ": gracias mama");
	}

}