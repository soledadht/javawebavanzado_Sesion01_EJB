package com.tecsup.javawebavanzado.sesion01.ejb;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;


@Stateful
@LocalBean


public class ContadorEJB {

	int cont = 0;
	
    /**
     * Default constructor. 
     */
    public ContadorEJB() {
        // TODO Auto-generated constructor stub
    }

	public int getCont() {
		return cont;
	}
    

	public void incrementar(){
		cont++;
	}
    


}
