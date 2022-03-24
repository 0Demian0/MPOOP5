/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author A2
 */
public class Circulos {
    /**
     * declaracion de constante PI que no puede cambiar 
     * declaracion de una variable "radio"
     */
    public final float PI = 3.1416f;
    private float radio;
    /**
     * contructor vacio
     */
    public Circulos(){
    }

    /**
     *
     * @return
     */
    public float getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    /**
     * inicializando al contructor
     * haciendo referencia al objeto radio
     * @param radio 
     */
    public Circulos(float radio){
        this.radio = radio;
    }
    /**
     * Metodo que realiza el perimetro usando la constante PI y la variable radio 
     * imprime el perimetro 
     */
    public void perimetro(){
        float perimetro=2*PI*radio;
        System.out.println("Perimetro= "+perimetro);
    }
    /**
     * Metodo que calcula el area 
     * multiplicando PI por radio^2
     * imprime el area 
     */
    public void area(){
        System.out.println("Area= "+(PI*radio*radio));
    }
    /**
     * 
     * @return 
     */
    /**
     * metodo que regresa el radio, en un formato ya especificado
     * se utiliza como sobre carga cuando hay un 
     * metodo y una clase con el mismo nombre
     * @return 
     */
    public String toString(){
        return "circulo{radio= "+radio+"}";

    }
}       
