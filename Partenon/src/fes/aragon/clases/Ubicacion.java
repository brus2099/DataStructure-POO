package fes.aragon.clases;

public class Ubicacion {

	private String estantes;
	private int filas;
	
	public Ubicacion() {
	}

	public String getEstantes() {
		return estantes;
	}

	public void setEstantes(String estantes) {
		this.estantes = estantes;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	@Override
	public String toString() {
		return "Ubicacion [estantes=" + estantes + ", filas=" + filas + "]";
	}
	
	
	
}
