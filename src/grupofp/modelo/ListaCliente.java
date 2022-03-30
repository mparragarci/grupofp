/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author pcsalvador
 */

public class ListaCliente{
    

    //La inicialitzem per a començar a posar clients
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
    
    public void addCliente(Cliente c){
        clientes.add(c);
    }
   
    public Cliente getCliente(int p){
        return clientes.get(p);
    }
    
    public int size(){
        return clientes.size();
    }
    
    public void eliminar(int i){
        clientes.remove(i);
    }
    
  
}