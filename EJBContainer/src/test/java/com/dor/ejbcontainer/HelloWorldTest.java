package com.dor.ejbcontainer;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import org.junit.Test;

import com.dor.ejbcontainer.HelloWorld;



public class HelloWorldTest  {
    
    @Test
    public void testSaludar() throws NamingException {
        // Create a properties map to pass to the embeddable container:
        Map<String,Object> properties = new HashMap<String,Object>();

        // Specify that you want to use the WebSphere embeddable container:
        properties.put(EJBContainer.PROVIDER, 
            "com.ibm.websphere.ejbcontainer.EmbeddableContainerProvider");

        // Create the container instance, passing it the properties map:
        EJBContainer ec = EJBContainer.createEJBContainer(properties);
        
        try {
           // Use the container context to look up a bean:
           HelloWorld bean = (HelloWorld) ec.getContext().lookup(
               "java:global/classes/HelloWorld!com.dor.ejbcontainer.HelloWorld");

           // Invoke a method on the bean instance:
           String s =bean.saludar();
           assertEquals(s, "hola");
        } finally {
           // Close the embeddable container:
           ec.close();
        }
    }

    
}
