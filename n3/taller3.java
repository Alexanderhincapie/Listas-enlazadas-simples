package com.mycompany.taller.n3;

import java.util.Scanner;

public class taller3 {

    public static void main(String[] args) {
     
        listaEnlazadaSimple lista = new listaEnlazadaSimple();
         
        Nodo nodo1 = new Nodo(20);
        Nodo nodo2 = new Nodo(25);
        Nodo nodo3 = new Nodo(10);
        Nodo nodo4 = new Nodo(30);
        Nodo nodo5 = new Nodo(45);
        lista.setCabeza(nodo1);
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        nodo3.setSiguiente(nodo4);
        nodo4.setSiguiente(nodo5);
        lista.Recorrer();
        System.out.println(" la lista se encuentra vacia ? " + lista.isVacia());
        System.out.println("Cabeza y cola eliminada .");
        lista.suprimirCabeza();
        lista.suprimirCola();
        lista.suprimirEnPosicion(2);
        lista.agregarEnPosicion(2, 99);
        lista.agregarUltimo(1);
        System.out.println(lista.localizar(3));
        lista.Recorrer();
        
    }
}