package repaso;

public class Prueba_De_Herencia {
	public static void main(String[] args) {
		Gato cat = new Gato(false, "leche", 4, "negro");

		System.out.println("El gato es Vegetariano?" + cat.isVegetarian());
		System.out.println("El gato toma " + cat.getEats());
		System.out.println("El gato tiene " + cat.getNoOfLegs() + " patas.");
		System.out.println("El color del gato es " + cat.getColor());
	}

}
