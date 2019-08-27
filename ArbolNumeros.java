/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.UD;

import java.util.Optional;

/**
 *
 * @author chris
 */
public abstract class ArbolNumeros {
    
    Integer value;
    
    public abstract void add(Integer value);
     
    public abstract Optional<Node> find(Integer value);
     
    public abstract void printInOrder();
     
    public abstract void printPreOrder();    
 
    public abstract void printPosOrder();
    
    public abstract String toString();
}
    

