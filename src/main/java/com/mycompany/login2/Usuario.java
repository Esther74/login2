/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login2;

/**
 *
 * @author soporte
 */
public class Usuario {
    private String nombre;
    private String apellido1;
    private String email;
    
    //constructor

    public Usuario() {
    }
    
    

    public Usuario(String nombre, String apellido1, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.email = email;
    }
    
    //toString
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", email=" + email + '}';
    }
    
    //getters setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
