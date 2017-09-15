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

// ------------------------------------------LISTA SIMPLEMENTE ENLAZADA ---------------------------------------------

public class MyList <T> { //no me marca error porque el <T> me agarra cualquier tipo de dato, es genérico
    
    Node first;
    Node last;
    Node pointer;
    
    //constructor
    MyList() {
    first = null;
    last = null;    
    }
    
    MyList (T d) {
    Node node = new Node(d);
    first = node;
    last = node;
    node.next = null;
    pointer = null;
    }
    
    //Métodos
    
    public boolean isEmpty () {   //para preguntar si está vacío // ¿Está vacío?
    return first == null; //No hace falta poner el last porque con que first sea null con eso basta.
    }
    
    //INSERTAR INICIO
    public void insertFirst (T d){ //insertar al inicio
    Node node = new Node(d);
    if (isEmpty()){  //En todo caso de que la lista esté vacía 
    first = node;
    last = node;
    node.next = null; } 
    else { //caso lista no está vacía, tiene elementos
    node.next= first;
    first = node; 
    }
    }
    
    //INSERTAR FINAL
    public void intertLast (T d){ //insertar al final
    Node node = new Node(d);
    if (isEmpty()){ //En caso de que la lista esté vacía
    first = node;
    last = node;
    node.next = null; }
    else {
    last.next = node;
    last = node;
    }
    
    } // no estamos agarrando el valor, solo busca el valor en la memoria y lo apunta
    
    
    //ELIMINAR INICIO
    public void deleteFirst (){ //Eliminar al inicio
    if (!isEmpty()){
    if (first.next == null){ //Si la lista tiene solo un elemento
    first = null;
    last = null; }
    else {   //Si la lista tiene mas de un elemento     //NO BORRAMOS, SOLO QUITAMOS DE LA REFERENCIA
    first = first.next;
    }
    }
    }
    
    //ELIMINAR FINAL
    public void deleteLast (){
    if (!isEmpty()){ //checa que no esté vacia
    if (first.next == last){ //Si la lista tiene solo tiene un elemento
    first = null;
    last = null; } 
    else {  //recorrer el arreglo con el apuntador "pointer"
    pointer = first;
    while (pointer.next != last){                     //si hacemos que se igual a last perdemos la referencia... 
    pointer = pointer.next;                           //...por eso buscamos hacia adelante, pero no llegar hasta last   
    }
    last = pointer;
    last.next = null;
    pointer = null; //a pointerlo quitamos de ahí
    }
    }  
    }
    
    //BORRAR NODO
    
    public boolean deleteNode(T n) { //n -> node
    Node p = fetchBack(n);
    if (p!=null) {//Si encuentra el elemento
    if (p.data == n) { //si es el primero o el único elemento de la lista
    deleteFirst(); //entonces borra el primero
    } else { //Si está dentro de la lista
    p.next = p.next.next;  }
    return true; }
    return false;  }
    
    
    
    public Node fetch(T n){ //ACTIVIDAD COMPLETAR
    if (!isEmpty()) { //si no está vacía
    if (first == last){ //Si hay un solo elemento en la lista    
    if (first.data == n) //haremos que n sea el dato
        
    return first; //regresame el valor en inicio
    } else { //si no...
    pointer = first;  //... el apuntador será igual al valor de first
    while (pointer.next != null){ //mientras haya valores
    if (pointer.next.data == n){ //el apuntador será n
    return pointer; //regresame el apuntador
    }
    pointer = pointer.next; //el siguiente
    }
    last.data = pointer.data;}   // el ultimo será el valor de pointer, y sabemos que no hay mas valores
    } return null;
    }

    
    
    
    
    
    public Node fetchBack (T n) { //un fetch debería darnos el elemento que buscamos y otro 'anterior' para borrar el dato anterior
    boolean finded = false;
    pointer = first;
    if (!isEmpty()){
    if (first == last) { //si solo tiene un 
    if (first.data == n) { //es el elemento que busco?
    return first; //Se devuelve a sí mismo
    } else {
    return null; //quiere decir que no lo encontré
    }
    } else {  //si hay mas elementos en la lista
    if (first.data==n){ //revisar que el primero no sea el que estoy buscando, si no me lo regresa
    return first; // es el valor que estoy buscando, regresalo
    }else { 
    pointer = first; //coloco en el puntero el primero
    while (pointer.next != last) { //mientras que pointer no llegue al final de la lista, y mientras no lo encontremos
    if (pointer.next.data == n){ //entonces si el siguiente dato, es el que estoy buscando, regresalo
    return pointer; //regreso el puntero
    }
    pointer = pointer.next;     
    } //si llega al ultimo entonces ...
    }   
    }
    } else {
    return null; // ... me regresa nulo
    }
         
        return null;   //checar esto, porque este RETURN no va aqui
    }
    
    //MUESTRA LISTA 
    
}
