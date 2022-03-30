/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupofp.modelo;
import java.util.ArrayList;


/**
 *
 * @author splan
 */
public class Lista<T> {
    protected ArrayList<T> lista;
    
    public Lista() {        
       lista = new ArrayList<T>();
    }
    
    public void addElemento(T t){
        lista.add(t);
    }
    
    public T getElemento(int p){
        return lista.get(p);
    }
    
    public void setElementoLista(T t, int i){
        lista.remove(i);
        lista.add(i,t);
    }
    
    public int size(){
        return lista.size();
    }
    
    public void eliminarElemento(int i){
        lista.remove(i);
    }
    
    
}