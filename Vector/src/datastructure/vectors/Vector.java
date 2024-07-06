/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.vectors;

/**
 *
 * @author Isaac Duarte
 */
public class Vector {
    private String[] elements;
    
    public Vector(int capacity){
        this.elements = new String[capacity];
    }
    /*
    - We added a "Vector" construtctor that 
    takes a integer that can delimit
    the capacity of the vector.
    
        - That means that this class Vector can
        copy an primitive type vector, and, just like
        it, can take a number to be its capacity.
    */
    
    public void add(String element){
        for(int i =0; i < this.elements.length; i++){
        if(this.elements[i] ==null){
            this.elements[i] = element;
            break;
            }
        }
        
        /*
        This method takes an element String and adds
        it at the elements vector if elements[i] 
        == null.
            
            It reads all elements in the elements vector
            and break if finds an null element.
        */
        
      
    }
    
}
