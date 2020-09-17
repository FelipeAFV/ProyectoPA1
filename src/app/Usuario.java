/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author f_fig
 */
public abstract class Usuario {
    
    private String nombre;
    private int ID;
    private String cargo;
    private String claveAcceso;
    
    public Usuario(String nombre, int ID, String cargo, String claveAcceso) {
        this.nombre = nombre;
        this.ID = ID;
        this.cargo = cargo;
        this.claveAcceso = claveAcceso;
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public int getId() {
        return ID;
    }
    
}
