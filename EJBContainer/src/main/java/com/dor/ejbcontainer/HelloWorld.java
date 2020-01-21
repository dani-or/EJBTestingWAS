package com.dor.ejbcontainer;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorld
 */
@Stateless
@LocalBean
public class HelloWorld {

    public String saludar() {
        return "hola";
    }

}
