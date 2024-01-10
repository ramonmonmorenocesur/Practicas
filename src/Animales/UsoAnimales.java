package Animales;

public class UsoAnimales {

	public static void main (String[] args) {
		Mamifero perro = new Mamifero("perro",15,true);
		Insecto hormiga= new Insecto("hormiga",1,false,true,"oso hormiguero");
		System.out.println("el animal "+hormiga.getNombre()+" tiene de enemigo" +hormiga.getEnemigo().getNombre());
	}
}
