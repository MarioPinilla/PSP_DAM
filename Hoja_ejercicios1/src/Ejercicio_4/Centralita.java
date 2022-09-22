package Ejercicio_4;

public class Centralita {

	private String tipo_llamada;
	private int contador_llamadaLocal=0;
	private int contador_llamadaProvincial=0;
	private double total_llamadaLocal;
	private double total_llamadaProvincial;
	

	public void Registro() {
		
		if(tipo_llamada.equalsIgnoreCase("Local")){
			System.out.println("Llamada local registrada");
			contador_llamadaLocal++;
			//total_llamadaLocal=contador_llamadaLocal
		}
		
		else if(tipo_llamada.equalsIgnoreCase("Provincial")) {
			System.out.println("Llamada provincial registrada");
			contador_llamadaProvincial++;
		}
		
		
	}



}
