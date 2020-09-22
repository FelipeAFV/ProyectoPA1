/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Equipo {
    private boolean status;
    final String tipo;
    private int id_sede;
    private int id_equipo;
    private int id_sala;
    
    public Equipo(){
        this.tipo = JOptionPane.showInputDialog("que tipo de objeto es: ");
        //this.id_equipo = (int)(Math.random() * (1000 - 1 + 1) + 1);
        this.id_equipo = Integer.parseInt(JOptionPane.showInputDialog("ingrese id del equipo"));
        this.id_sala = Integer.parseInt(JOptionPane.showInputDialog("ingrese id del sala"));
        this.id_sede = Integer.parseInt(JOptionPane.showInputDialog("ingrese id del sede"));
        this.status = conversor(JOptionPane.showInputDialog("estado del equipo"));
    }
    
    final public boolean conversor(String s){
        if(s.equals("true")){
            return true;
        }else{
           return false; 
        }
        
    }
    
    public String toString(){
        return tipo + "\nid de equipo = " + id_equipo + 
                  "\nid de sala = " + id_sala + "\nid de sede = " + id_sede + "\nstatus = "
                + status +"\n";
    }
    
    public int devolver_id_equipo(){
        return this.id_equipo;
    }
    
    public int devolver_id_sala(){
        return this.id_sala;
    }
    
    public int devolver_id_sede(){
        return this.id_sede;
    }
    
    public boolean devolver_status(){
        return this.status;
    }
}
