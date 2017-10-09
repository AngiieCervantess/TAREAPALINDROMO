/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapalindromo;

/**
 *
 * @author Angelica
 * @param <T>
 */

public class Node <T> {
    //Atributos
    private T d;
    private Node next;
    
    //Constructor
    public Node(T d){
        this.d = d;
        this.next = null;
    }
    //Métodos
    
    public void setD(T d){
        this.d = d;
    }
    public T getD(){
        return this.d;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
}
    