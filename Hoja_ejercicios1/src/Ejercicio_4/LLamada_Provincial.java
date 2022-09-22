package Ejercicio_4;

public class LLamada_Provincial extends LLamadas{

	private double horarioInicio;
	private double horarioFinal;
	public LLamada_Provincial(double horaI,double horaF,String origen, String destino, double duracion) {
		super(origen, destino, duracion);
		this.horarioInicio= horaI;
		this.horarioFinal=horaF;
		
		// TODO Auto-generated constructor stub
	}


	public double getHorarioInicio() {
		return horarioInicio;
	}


	public void setHorarioInicio(double horarioInicio) {
		this.horarioInicio = horarioInicio;
	}


	public double getHorarioFinal() {
		return horarioFinal;
	}


	public void setHorarioFinal(double horarioFinal) {
		this.horarioFinal = horarioFinal;
	}



	@Override
	public double calcularCoste() {
	this.horarioInicio=
		return 0;
	}

}
