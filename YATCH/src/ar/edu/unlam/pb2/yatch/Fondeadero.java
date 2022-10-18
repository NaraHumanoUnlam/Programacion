package ar.edu.unlam.pb2.yatch;
import java.util.ArrayList;
import java.util.Iterator;

public class Fondeadero {
	private ArrayList<Yate> amarras;
	
	public Fondeadero(Integer ingreso) {
		
		amarras = new ArrayList<Yate>(ingreso);
	}

	public void agregarYate(Yate nuevoYate) {
		if(!buscarYate(nuevoYate)) {
			amarras.add(nuevoYate);
		}
				
	}

	private Boolean buscarYate(Yate nuevoYate) {
		Boolean loEncontre = false;
		for (Yate yate : amarras) {
			if(nuevoYate.equals(yate)) {
				loEncontre = true;
			}
		}
		return loEncontre;
	}

	public Integer getFondeada(Yate y) {
		Integer fondeada = 0;
		if (buscarYate(y)) {
			fondeada = 1;
		}
		return fondeada;
	}

	public void quitarYate(Yate nuevoYate) {
		if(buscarYate(nuevoYate)) {
			amarras.remove(nuevoYate);
		}
	}

	public Integer obtenerCantidadDeYatesAmarrados() {
		Integer contador = 0;
		for (Integer i = 0; i < amarras.size(); i++) {
			
			if(amarras.get(i)!=null) {
				contador+=1;
			}
		}
		return contador;
	}

	public Integer obtenerCantidadDeYatesLibre() {
		
		return amarras.size() - obtenerCantidadDeYatesAmarrados();
	}

	

}
