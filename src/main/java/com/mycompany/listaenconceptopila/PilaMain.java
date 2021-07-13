/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listaenconceptopila;

import javax.swing.JOptionPane;

/**
 *
 * @author frankdev
 */
public class PilaMain {
    public static void main(String args[]){
        int op=0,edad=0;
        Pila pila = new Pila();
        do{
            try{
                op=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar dato a la pila\n"
                    + "2. Sacar un elemento de la pila\n"
                    + "3. ¿La pila esta vacia?\n"
                    + "4. ¿Que elemento esta en la cima de la pila?\n"
                    + "5. Tamaño de la pila\n"
                    + "6. Vaciar la pila\n"
                    + "7. Salir\n"
                    + "Que desea hacer?","Menu de opciones",
                    JOptionPane.INFORMATION_MESSAGE));
                switch(op){
                    case 1:
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese tu edad","Apilando..",
                                JOptionPane.INFORMATION_MESSAGE));
                        pila.empujar(edad);
                        break;
                    case 2:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: "
                                    + pila.sacar(),"Desapilando...",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia! No hay nada que desapilar");
                        }
                        break;
                    case 3:
                        if(pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"La pila esta vacia",
                                    "Pila",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila contiene datos",
                                    "Pila",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"La cima de la pila es: "
                                    + pila.cima(),"Datos de la pila",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Pila Vacia..!",
                                    "Datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"El tamaño de la pila es"
                                + pila.tamanioPila(),"Datos de la pila",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if(!pila.estaVacia()){
                            pila.limpiarPila();
                            JOptionPane.showMessageDialog(null,"La pila se ha vaciado",
                                    "Datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila no contiene datos, Nada que vaciar.!",
                                    "Datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Gracias por utilizar los servicios de FrankDev",
                                "Fin proceso",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"La opcion no existe en el menu de opciones",
                                "Opcion desconocido",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
            }
        }while(op!=7);
    }
}
