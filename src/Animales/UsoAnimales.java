package Animales;

public class UsoAnimales {

	public static void main (String[] args) {
		
		
		
		Mamifero perro = new Mamifero("perro",15,true);
		Insecto hormiga= new Insecto("hormiga",1,false,true,"oso hormiguero");
		System.out.println("el animal "+hormiga.getNombre()+" tiene de enemigo" +hormiga.getEnemigo().getNombre());
		Insecto volantona;
		volantona=hormiga;
		Insecto atomica = new Insecto(hormiga.getNombre()+"atomica",
				hormiga.getTpVida(),
				hormiga.isAlas(),
				hormiga.isAntenas(),
				hormiga.getEnemigo().getNombre());
		hormiga.setAlas(true);
		
		System.out.println(hormiga.getNombre()+" tiene alas?:  "+hormiga.isAlas());
		System.out.println(atomica.getNombre()+"tiene alas?:  "+atomica.isAlas());
		System.out.println(volantona.getNombre()+"tiene alas?:  "+volantona.isAlas());
		volantona.setNombre(atomica.getNombre());
		System.out.println(volantona.getNombre());
		volantona.atributo="soy binarie y el humane me oprime";
		
		System.out.println("volantona dice: "+ volantona.atributo);
	}
	
}
