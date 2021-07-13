/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listaenconceptopila;

/**
 *
 * @author frankdev
 */
public class Pila {
    Nodo cima;//PUNTERO PARA OBTENER LA CIMA DE LA PILA
    int tamanio;
    public Pila(){
        cima=null;
        tamanio=0;
    }
    //METODO PARA VERIFICAR SI LA PILA ESTA VACIA
    public boolean estaVacia(){
        return cima==null;
    }
    //METODO PARA EMPUJAR (push) UN NODO EN LA PILA
    public void empujar(int edad){
        Nodo nuevo = new Nodo(edad);
        nuevo.siguiente=cima;
        cima=nuevo;
        tamanio++;
    }
    //METODO PARA SACAR (pop) UN NODO EN LA PILA
    public int sacar(){
        int edad=cima.edad;
        cima=cima.siguiente;
        tamanio--;
        return edad;
    }
    //METODO PARA VERIFICAR EL NODO EN LA CIMA DE LA PILA
    public int cima(){
        return cima.edad;
    }
    //METODO PARA VERIFICAR EL TAMANIO DE LA PILA
    public int tamanioPila(){
        return tamanio;
    }
    //METODO PARA LIMPIAR LA PILA
    public void limpiarPila(){
        while(!estaVacia()){
            sacar();
        }
    }
}
