/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Esther
 */
public class CreaPropiedades {
    
    public Properties asignarPropiedades(String user, String password, String nombre, String apellido, String email){
        //declaramos una instancia de properties
        Properties prop = new Properties();
        
        //asignamos propiedades y valores
        
        //user y password
        //propiedades para hacer el login, que no tienen por que estar luego en el objeto de la clase Usuario
        prop.setProperty("user", user);
        prop.setProperty("password", password);
        
        //propiedades que luego voy a asignar al objeto de la clase usuario
        prop.setProperty("nombre", nombre);
        prop.setProperty("apellido1", apellido);
        prop.setProperty("email", email);
        
        return prop;
    }
    
    public String grabarPropiedades(Properties prop, String filename) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(filename);
        prop.store(fos, "Archivo de propiedades");
        //En esta parte del codigo es donde se genera el archivo.
        //C:\Users\soporte\Documents\NetBeansProjects\login2\Aplicacion.propiedades
        //src, target, pom.xml, Aplicacion.propiedades
        //devuelvo el nombre del archivo que he recibido para seguir utilizandolo
        return filename;
    }
    
}
