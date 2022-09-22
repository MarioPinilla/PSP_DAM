package Ejercicio_4;

public class LLamada_Local extends LLamadas {

	private double precio = 0.15;
	
	public LLamada_Local(double precio, String origen, String destino, double duracion) {
		super(origen, destino, duracion);
		this.precio= precio;
		// TODO Auto-generated constructor stub
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcularCoste() {
		return this.precio*this.getDuracion();
		
	}

}
