/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.nodo.list;

/**
 *
 * @author Angelica
 * @param <T>
 */
public class Node <T> { //instanseamos <T> para que sea de cualquier tipo de dato.
    T data;
    Node next;
    
Node(T d){
    this.data = d;
    this.next = null;
}   



}
