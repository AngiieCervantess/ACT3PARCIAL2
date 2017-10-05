/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.nodo.list;

/**
 *
 * @author Angelica
 */
public class Contacto {
    String nombre;
    String telefono;
    public Contacto (String a){
    this.nombre = "Ed";
    this.telefono = "8333296857";
    
    
    }
    
    @Override
    public String toString(){
    return this.nombre + " " + this.telefono;
    }
    
}
