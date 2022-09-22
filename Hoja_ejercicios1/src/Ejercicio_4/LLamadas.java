package Ejercicio_4;

public abstract class LLamadas {

	private String origen;
	private String destino;
	private double duracion;
	
	public LLamadas(String origen, String destino, double duracion) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	
	 public abstract double calcularCoste();

	@Override
	public String toString() {
		return "LLamadas [origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + "]";
	}

	
	
	
		
	
	
}
