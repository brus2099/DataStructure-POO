package fes.aragon.clases;

public class Autor {

	private String nombre;
	private String correo;
	
	public Autor() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", correo=" + correo + "]";
	}
	
	
	
}
