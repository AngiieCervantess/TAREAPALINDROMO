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

public class Stack <T> {

    private Node top;
    private int size;

    public Stack() {
    this.top = null;
    this.size = 0;
    }

    public Node getTop() {
    return top; }

    public int getSize() {
    return size; }

    public boolean isEmpty() {
    return top == null; 
    }
   
    public void pop() { //desapilar la pila
    if (!isEmpty()) {
    top = top.getNext();
    size--;
    } else {
    System.out.println("La pila no tiene elementos");  }
    }
    
    public Object pop2() { //desapilar la pila
    if (!isEmpty()) {
    Object d = top.getD();
    top = top.getNext();
    size--;
    return d;
    } else {
    System.out.println("La pila no tiene elementos");
    return null;  }
    }
    
     public void push(T d) { //apilar a la pila
    Node node = new Node(d);
    if (isEmpty()) {
    top = node;
    } else {
    node.setNext(top);
    top = node; }
    size++;
    }
    
}

