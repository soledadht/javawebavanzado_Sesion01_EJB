package com.tecsup.javawebavanzado.sesion01.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless //Anotaciones q se encunetran en las librerias de maven
@LocalBean
public class CalculadoraEJB {
	/**
     * Default constructor. 
     */
    public CalculadoraEJB() {
        // TODO Auto-generated constructor stub
    }

    
    public int sumar(int a, int b) {
    	
    	return a+b;
    }

}
