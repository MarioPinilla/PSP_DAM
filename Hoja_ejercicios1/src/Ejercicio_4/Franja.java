package Ejercicio_4;

public class Franja {
public int inicio;
public int fin ;
public double coste;
public int franja;


public Franja(int inicio, int fin) {
	super();
	this.inicio = inicio;
	this.fin = fin;
}



public int getInicio() {
	return inicio;
}



public void setInicio(int inicio) {
	this.inicio = inicio;
}



public int getFin() {
	return fin;
}



public void setFin(int fin) {
	this.fin = fin;
}



public void clacularFranja() {
	if(inicio>=1&&fin<=8) {
		franja=1;
		coste = 20;
	}
	
	else if(inicio>=9&&fin<=16) {
		franja=2;
		coste=25;
	}
	else if(inicio>=15&&fin<=24) {
		franja=3;
		coste=20;
	}
}

}
