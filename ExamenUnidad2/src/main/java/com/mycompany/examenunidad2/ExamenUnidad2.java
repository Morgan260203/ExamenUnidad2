/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenunidad2;

import java.util.ArrayList;

/**
 *
 * @author DanielAlejandroCehGarcia-68616-al068616@uacam.mx
 */
public class ExamenUnidad2 {
    private double masaAtomica;
    private int numeroAtomico;
    private String simbolo;
    private String nombre;
    private String color;
    
    public static ArrayList<ExamenUnidad2> elementos = new ArrayList<>();
    
    public ExamenUnidad2() {
    }
    
    public ExamenUnidad2(int numero, String simbolo, String nombre, double masa, String color) {
        masaAtomica = masa;
        numeroAtomico = numero;
        this.simbolo = simbolo;
        this.nombre = nombre;
        this.color = color;
    }
    
    public static void llenarTabla(){
        insertarElemento(7, "N", "Nitrogeno", 14.0067, "Morado");
        insertarElemento(27, "Co", "Cobalto", 58.933195, "Amarillo");
        insertarElemento(37, "Rb", "Rubidio", 85.4678, "Naranja");
        insertarElemento(47, "Ag", "Plata", 107.870, "Amarillo");
    }
    
    public static void insertarElemento(int numero, String simbolo, String nombre, double masa, String color){
        elementos.add(new ExamenUnidad2(numero,simbolo, nombre, masa, color));
          /**
     * @return the masaAtomica
     */
    public double getMasaAtomica() {
        return masaAtomica;
    }

    /**
     * @param masaAtomica the masaAtomica to set
     */
    public void setMasaAtomica(double masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    /**
     * @return the numeroAtomico
     */
    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    /**
     * @param numeroAtomico the numeroAtomico to set
     */
    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    /**
     * @return the simbolo
     */
    public String getSimbolo() {
        return simbolo;
    }

    /**
     * @param simbolo the simbolo to set
     */
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Elemento{" + "masaAtomica=" + masaAtomica + ", numeroAtomico=" + numeroAtomico + ", simbolo=" + simbolo + ", nombre=" + nombre + ", color=" + color + '}';
    }
}