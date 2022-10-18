package ar.edu.unlam.pb2.yatch;
import java.util.Objects;

public class Yate {

	private String nombre;
	private String duenio;
	private Double ancho;
	private Double calado;
	private Integer largo;
	private Integer tripulacion;
	private Integer peso;

	public Yate(String nombre, String duenio, Double ancho, Double calado, Integer largo, Integer tripulacion,
			Integer peso) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.ancho = ancho;
		this.calado = calado;
		this.largo = largo;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(duenio, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(duenio, other.duenio) && Objects.equals(nombre, other.nombre);
	}


	public String getNombre() {
		return nombre;
	}

	

	public String getDuenio() {
		return duenio;
	}

	public Integer getLargo() {
		return largo;
	}


	 
	
	

}
