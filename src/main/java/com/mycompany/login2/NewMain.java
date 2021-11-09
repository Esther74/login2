/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        //Genero el archivo de propiedades
        CreaPropiedades cp = new CreaPropiedades();
        //user, password, nombre, apellido, email
        //user y nombre me coinciden en este caso, pero podrian no coincidir
        Properties prop = cp.asignarPropiedades("Pepa", "123", "Pepa", "Lopez", "pepa@gmail");
        
        //le doy al archivo el nombre Aplicacion propiedades, como no especifico ninguna ruta
        //se genera aqui: C:\Users\soporte\Documents\NetBeansProjects\login2
        String nombreArchivo = cp.grabarPropiedades(prop, "Aplicacion.propiedades");
        
        //voy a hacer login
        try{
                Aplicacion app = new Aplicacion();
                
                System.out.println("Introduce nombre de usuario (Pepa): ");
                Scanner scan = new Scanner(System.in);
                String u = scan.nextLine();
                
                System.out.println("Introduce password (123): ");
                String p = scan.nextLine();
                
                //nombre de archivo es Aplicacion.propiedades
                Usuario sesion = app.login(u, p, nombreArchivo);
                
                if (sesion != null){
                    System.out.println(sesion);
                }
                
        }catch(IOException e){
            //e.printStackTrace();
            System.out.println(e.toString());
        }
    }
    
}
