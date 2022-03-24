/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author A2
 */
public class Fecha {
    /**
     * declaracion de las variables "dia", "mes", "anio"
     * son los elementos de la fecha
     */
    private int dia;
    private int mes;
    private int anio;
    /**
     * Contructor vacio
     */
    public Fecha(){  
    }
    /**
     * inicializacion del contructor 
     * referencia a los objetos dia, mes, anio
     * @param dia
     * @param mes
     * @param anio 
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     *
     * @return
     */
    public int getDia() {
        return dia;
    }

    /**
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     *
     * @return
     */
    public int getMes() {
        return mes;
    }

    /**
     *
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     *
     * @return
     */
    public int getAnio() {
        return anio;
    }

    /**
     *
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * metodo que regresa la fecha, en un formato en especifico
     * se utiliza como sobre carga cuando hay un 
     * metodo y una clase con el mismo nombre
     * @return 
     */
    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
                }
}
