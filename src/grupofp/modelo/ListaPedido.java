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

public class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>(); 
    
    public void addPedido(Pedido p){
        pedidos.add(p);
    }
    
    public Pedido getPedido(int p){
        return pedidos.get(p);
    }
    
    public int size(){
        return pedidos.size();
    }
    
    public void eliminar(int i){
        pedidos.remove(i);
    }
    
}