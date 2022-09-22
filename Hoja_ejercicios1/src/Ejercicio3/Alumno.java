package Ejercicio3;

public class Alumno {

	private  Asignatura asig1;
	private Asignatura asig2;
	private Asignatura asig3;
	
	public Alumno(Asignatura asig1, Asignatura asig2,Asignatura asig3) {
		this.asig1=asig1;
		this.asig2=asig2;
		this.asig3=asig3;
		
	}
	public Alumno(int iden1,int iden2, int iden3) {
		this.asig1= new Asignatura(iden1);
		this.asig2= new Asignatura(iden2);
		this.asig3= new Asignatura(iden3);
	}
	
	public Asignatura getAsig1() {
		return asig1;
	}
	public Asignatura getAsig2() {
		return asig2;
	}
		public Asignatura getAsig3() {
			return asig3;
}
	}
