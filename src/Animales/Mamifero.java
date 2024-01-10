package Animales;

public class Mamifero extends Animal {
 private boolean velloCorporal;

public boolean isVelloCorporal() {
	return velloCorporal;
}

public void setVelloCorporal(boolean velloCorporal) {
	this.velloCorporal = velloCorporal;
}

public Mamifero(String nombre, int tpVida, boolean velloCorporal) {
	super(nombre, tpVida);
	this.velloCorporal = velloCorporal;
}
}
