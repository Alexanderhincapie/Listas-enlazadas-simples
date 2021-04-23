/* Karen Pineda Acevedo                                          TdeA
    Stiven Alexander Parra Hincapie                        2021
    Estructura de datos 
    Taller de listas enlazadas simples 
*/

package com.mycompany.taller.n3;

public class listaEnlazadaSimple {

    private Nodo cabeza;

    public listaEnlazadaSimple(Nodo cabeza){
        this. cabeza = null;
    }

    public listaEnlazadaSimple() {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isVacia(){
        return this.cabeza == null;
    }
    
    public void anular(){
        this.cabeza = null;
    }
    
    public void Recorrer(){
        Nodo nodoActual;
        
         if(this.cabeza != null){
             nodoActual = this.cabeza;
             System.out.println(nodoActual.getDato());
             while(nodoActual.getSiguiente() != null){
                 nodoActual = nodoActual.getSiguiente();
                 System.out.println(nodoActual.getDato());
             }
         }
    }
    
    public Nodo localizar(Integer x){
        Nodo nodoActual =cabeza;
        Nodo dato = null;
        if(!isVacia()){
            while(nodoActual.getDato() != x && nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
            }
            if(nodoActual.getDato() == x){
                dato = nodoActual;
            }
        }
        return dato;
    }
    
    public void agregarCabeza (Integer d){
        Nodo nuevoNodo = new Nodo(d);
        nuevoNodo.setSiguiente(this.cabeza);
        this.cabeza = nuevoNodo;
    }
    
    public Nodo ultimo (Integer d){
          if(cabeza == null){
            System.out.println("La lista esta vacia.");
            return null;
        }else{
              Nodo nodoActual = this.cabeza;
              Nodo nodoUltimo = null;
                   if(isVacia()){
             while(nodoActual.getSiguiente() != null){
                 nodoActual = nodoActual.getSiguiente();
             }
             if(nodoActual.getSiguiente() == null){
                 nodoUltimo = nodoActual;
             }
         }
                     return nodoUltimo;
          }
    }
    
    public void agregarUltimo (Integer d){
        Nodo nodoNuevo = new Nodo(d);
        if(isVacia()){
            this.cabeza = nodoNuevo;
        }else{
            Nodo puntero = cabeza;
            while(puntero.getSiguiente() != null){
                puntero = puntero.getSiguiente();
            }
            if(puntero.getSiguiente() == null){
                puntero.setSiguiente(puntero);
            }
        }
    }
    
    public void agregarEnPosicion (int i, Integer d){
        int cuenta = 1;
        Nodo nodoNuevo = new  Nodo(d);
        Nodo nodoActual = cabeza;
        Nodo nodoAnterior = null;
        if(isVacia()){
            cabeza = nodoActual;
        }else{
            while(nodoActual.getSiguiente() != null){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
                cuenta ++;
                if(i == 1){
                    agregarCabeza(d);
                    break;
                }else{
                    if(cuenta == i && nodoActual.getSiguiente() != null){
                        nodoNuevo.setSiguiente(nodoActual);
                        nodoAnterior.setSiguiente(nodoNuevo);
                    }else{
                    if(cuenta == i && nodoActual.getSiguiente() == null){
                        nodoNuevo.setSiguiente(nodoActual);
                        nodoAnterior.setSiguiente(nodoNuevo);
                    }else{
                        if(i > cuenta){
                            agregarUltimo(d);
                            break;
                        }
                    }
                   }
                }
            }
        }
    }
    
    public void suprimirCabeza (){
         if(cabeza == null){
            System.out.println("La lista esta vacia.");
        }else{
             if(!isVacia()){
                 cabeza = cabeza.getSiguiente();
             }
         }
    }
    
    public void suprimirCola(){
        if(cabeza != null){
            Nodo nodoActual = cabeza;
            Nodo nodoUltimo = null;
            while( nodoActual.getSiguiente() != null){
                nodoUltimo = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual = nodoUltimo;
            nodoActual.setSiguiente(null);
        }
    }
    
    public void suprimirEnPosicion(Integer i){
        if(cabeza != null){
            int cuenta = 1;
            Nodo nodoActual = cabeza;
            Nodo nodoAnterior = null;
            while(nodoActual.getSiguiente() != null){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
                cuenta ++;
                if(i == 1){
                     suprimirCabeza();
                }else{
                    if(cuenta == i && nodoActual.getSiguiente() != null){
                        nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                    }else{
                        if(cuenta == i && nodoActual.getSiguiente() == null){
                        suprimirCola();
                        }
                    }
                }
            }
        }
    }
     
}
