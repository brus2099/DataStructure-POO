package fes.aragon.partenon;

import java.io.Serializable;
import java.util.ArrayList;

public class Editorial implements Serializable {

	private ArrayList<Libro> libros = new ArrayList<>();
	private String nombre;
	private String sucursal;
	private String direccion;
	private String correo;
	private String telefono;
	
	public Editorial() {
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Editorial [libros=" + libros + ", nombre=" + nombre + ", sucursal=" + sucursal + ", direccion="
				+ direccion + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
	
	
	
}
