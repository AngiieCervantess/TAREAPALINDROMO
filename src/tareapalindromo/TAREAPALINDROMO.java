/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapalindromo;
import java.util.Scanner;
/**
 *
 * @author Angelica
 */
public class TAREAPALINDROMO {

    /**
     * @param args the command line arguments
     */
   
 public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner( System.in );
    System.out.print ( "Escribe una palabra o una frase: " );
    String palabra = s.nextLine ( ); // lee la cadena de texto hasta la última línea
    char p[] = palabra.toCharArray ( ); //convertir la cadena a array de caracteres
    if ( verificar ( p ) ) //verificar si la palabra es o no es palíndromo
    System.out.println ( "¡Sí es palíndromo!" ); //verificó es palindromo
    else
    System.out.println ( "¡No es palíndromo!" );
 }
 
    public static boolean verificar ( char [ ] palabra ) { /*Sólo verificaremos si es palindromo, no tiene caso verificar si no es */
    Stack stack = new Stack (  ); //hacemos una nueva pila
    boolean verificado = true;  //preguntar si es o no con boolean 
    for ( int i = 0; i < palabra.length; i++ ){ 
    if ( palabra [i] != ' ' ){ // si es una sóla palabra
    stack.push ( palabra [i] );} //recorre las palabras
    }
    for ( int i = 0; (i < palabra.length) && verificado; i++ ) // si es frase
    if ( palabra [i] != ' ' ) 
    if ( !stack.pop2( ).equals ( palabra [i] ) ) //agarra método Stack
    verificado = false; 
        return verificado;  }
}

