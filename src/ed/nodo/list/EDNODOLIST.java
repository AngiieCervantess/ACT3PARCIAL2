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
public class EDNODOLIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    MyList <Contacto> Lista = new MyList(); 
    Contacto a = new Contacto("10");
    //Mi lista tiene apuntadores y es de tipo Nodo
    Lista.insertFirst(a);
    Lista.showList();
      
    }
}

