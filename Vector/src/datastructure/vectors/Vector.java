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
    private int size;
    
    public Vector(int capacity){
        this.elements = new String[capacity];
        this.size = 0;
    }
    /*
    - We added a "Vector" construtctor that 
    takes a integer that can delimit
    the capacity of the vector.
    
        - That means that this class Vector can
        copy an primitive type vector, and, just like
        it, can take a number to be its capacity.
    */
    
    public void add(String element) throws Exception{
        
        if(this.size < this.elements.length){
        this.elements[this.size] = element;
        this.size++;
        } else {
            throw new Exception("The vector has no more storage");
        }
        }
        
        /*
        For simplify and turn the algorithm faster, we
        added an integer size as atribute for mark the last
        position. Size starts at 0 because the vector first
        position is zero.
        */

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i = 0; i < this.size-1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        
        if(this.size >0){
            s.append(this.elements[this.size-1]);
        }
        
        s.append("]");
        
        return s.toString();
       
    }
    
    public String search(int position){
        if(!(position >=0 && position < this.size)){
            throw new IllegalArgumentException("Invalid Position");
        }
        return this.elements[position];
        
    }
        
      
    
    
}
