package Ejercicio3;

public class Asignatura {

	private int identificador;
	private double calificacion;

	public Asignatura(int iden) {
		this.identificador=iden;
	}

	public int getIndentificador() {
		return this.identificador;
	}
	public double getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(double cali) {
		this.calificacion=cali;
	};
		
}
