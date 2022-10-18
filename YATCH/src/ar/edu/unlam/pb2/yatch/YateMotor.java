package ar.edu.unlam.pb2.yatch;

public class YateMotor extends Yate{

	final Double PRECIO_MOTOR = 10000.0;
	
	public YateMotor(String nombre, String duenio, Double ancho, Double calado, Integer largo, Integer tripulacion,
			Integer peso) {
		super(nombre, duenio, ancho, calado, largo, tripulacion, peso);
		
	}

	public Double obtenerPrecioAmarra() {
		Double precio = 0.00;
		if(getLargo() <= 20) {
			precio = 2000.00;
		}else
		{
			precio = 3000.00;
		}
		return precio+PRECIO_MOTOR;
	}
	

}
