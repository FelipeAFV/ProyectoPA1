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
public class Encargado extends Usuario {
    
    private int idSede;
  
    public Encargado(String nombre, int ID, String cargo, String claveAcceso, int idSede) {
        super(nombre, ID, cargo, claveAcceso);
        this.idSede = idSede;
    }
}
