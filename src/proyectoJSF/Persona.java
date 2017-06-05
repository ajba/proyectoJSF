package proyectoJSF;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Persona {
	
	
	public Persona(){
		super();
	}
	
	private String nombre = "Nombre por defecto";

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
