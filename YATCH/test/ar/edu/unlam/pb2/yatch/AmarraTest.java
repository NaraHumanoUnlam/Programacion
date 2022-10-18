package ar.edu.unlam.pb2.yatch;
import org.junit.Assert;
import org.junit.Test;

public class AmarraTest {
	
	@Test
	public void siExisteAmarra() {
		Fondeadero nuevaAmarra = seCreaAmarra(70);
		Assert.assertNotNull(nuevaAmarra);
	}
	
	
	@Test
	public void siExisteYateYTieneAmarra () {
		Fondeadero nuevo = seCreaAmarra(70);
		Yate nuevoYate = seCreaYate("AZ1","Adrés Borgeat", 18.87,5.15,119,37,5500);
		seAsignaAmarraAYate(nuevo,nuevoYate);
		Integer vo = nuevo.getFondeada(nuevoYate);
		Integer ve = 1;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	public void siSeDesamarraYate() {
		Fondeadero nuevo = seCreaAmarra(70);
		Yate nuevoYate = seCreaYate("AZ1","Adrés Borgeat", 18.87,5.15,119,37,5500);
		seAsignaAmarraAYate(nuevo,nuevoYate);
		seDesasignaAmarra(nuevo,nuevoYate);
		Integer vo = nuevo.getFondeada(nuevoYate);
		Integer ve = 0;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	public void siSeObtieneCantidadDeOcupado() {
		Fondeadero nuevo = seCreaAmarra(70);
		Yate nuevoYate = seCreaYate("AZ1","Adrés Borgeat", 18.87,5.15,119,37,5500);
		Yate yate2 = seCreaYate("AZ2","Adrés Borgeat", 18.87,5.15,119,37,5500);
		seAsignaAmarraAYate(nuevo,nuevoYate);
		seAsignaAmarraAYate(nuevo,yate2);
		Integer ve = 2;
		Integer vo = nuevo.obtenerCantidadDeYatesAmarrados();
		
	}
	
	@Test
	public void siSeObtieneCantidadLibres() {
		Fondeadero nuevo = seCreaAmarra(70);
		Yate nuevoYate = seCreaYate("AZ1","Adrés Borgeat", 18.87,5.15,119,37,5500);
		Yate yate2 = seCreaYate("AZ2","Adrés Borgeat", 18.87,5.15,119,37,5500);
		seAsignaAmarraAYate(nuevo,nuevoYate);
		seAsignaAmarraAYate(nuevo,yate2);
		Integer ve = 68;
		Integer vo = nuevo.obtenerCantidadDeYatesLibre();
		
	}
	
	@Test
	public void siSeObtienePrecioPorAmarra() {
		Fondeadero nuevo = seCreaAmarra(70);
		YateMotor yateMotor =  seCreaYateMotor("AZ1","Adrés Borgeat", 18.87,5.15,119,37,5500);
		Double vo = 13000.00;
		Double ve = yateMotor.obtenerPrecioAmarra();
		
	}
	
	private YateMotor seCreaYateMotor(String nombre, String duenio, Double d, Double e, Integer i, Integer j, Integer k) {
		// TODO Auto-generated method stub
		return new YateMotor(nombre, duenio, d, e, i, j, k);
	}


	private void seDesasignaAmarra(Fondeadero nuevo, Yate nuevoYate) {
		
		nuevo.quitarYate(nuevoYate);
		
	}


	private void seAsignaAmarraAYate(Fondeadero nuevaAmarra, Yate nuevoYate) {
		nuevaAmarra.agregarYate(nuevoYate);
	}


	private Yate seCreaYate(String nombre, String duenio, Double ancho, Double calado, Integer largo, Integer tripulacion, Integer peso) {
		
		return new Yate(nombre,duenio,ancho,calado,largo,tripulacion,peso);
	}


	private Fondeadero seCreaAmarra(Integer i) {
		
		return new Fondeadero(i);
	}
	
	

}
