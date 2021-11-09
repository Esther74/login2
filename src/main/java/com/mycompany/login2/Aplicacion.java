/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Esther
 */
public class Aplicacion {
 
    public Usuario login(String u, String p, String nombreArchivo) throws FileNotFoundException, IOException{
        
        
            String archivo = nombreArchivo;
            
            FileInputStream fis;
            fis = new FileInputStream(archivo);
            
            Properties prop = new Properties();
            prop.load(fis);
            
            if(u.equals(prop.get("user")) && p.equals(prop.get("password"))){
                
                System.out.println("login correcto");
                
                Usuario sesion = new Usuario();
                
                //relleno los datos de la clase Usuario en el objeto que llamo sesion
                rellenaUsuarioDeAplicacionPropiedades(prop,sesion);
                                
                return sesion;
            }else{
                System.out.println("login incorrecto");
                return null;
            }
            
    }
    
    private void rellenaUsuarioDeAplicacionPropiedades(Properties prop, Usuario sesion){
        sesion.setNombre(prop.getProperty("nombre"));
        sesion.setApellido1(prop.getProperty("apellido1"));
        sesion.setEmail(prop.getProperty("email"));
        
        
    }
    
    
    
    
}
