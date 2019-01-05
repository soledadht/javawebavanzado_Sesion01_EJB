package com.tecsup.javawebavanzado.sesion01.ejb;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

@Singleton
@LocalBean

public class PropiedadEJB {
	String mensaje;
	
	
    /**
     * Default constructor. 
     */
    public PropiedadEJB() {
        // TODO Auto-generated constructor stub
    }


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


}
