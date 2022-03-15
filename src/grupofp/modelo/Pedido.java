/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

import Otros.Hora;
import Otros.Fecha;
/**
 *
 * @author pcsalvador
 */
public class Pedido {
    private int numPedido; 
    private String NIF; 
    private String codigoA; 
    private int unidades; 
    private Fecha fecha; 
    private Hora hora; 
    private Double precioPedido; 

    @Override
    public String toString() {
        return "Pedido{" + "numPedido=" + numPedido + ", NIF=" + NIF + ", codigoA=" + codigoA + ", unidades=" + unidades + ", fecha=" + fecha + ", hora=" + hora + ", precioPedido=" + precioPedido + '}';
    }
    
    
    
    Pedido(int n, String nif, String c, int u, Fecha f, Hora h){
        numPedido=n;
        NIF=nif;
        codigoA=c;
        fecha=f;
        hora=h;
    }
    
    int getNumPedido(){
        return numPedido; 
    }
    
    int getUnidades(){
        return unidades;  
    }
    
    String getNIF(){
        return NIF; 
    }
    
    String getCodigoArticulo(){
        return codigoA; 
    }
    
    Double getPrecioPedido(){
        return precioPedido; 
    }
    
    void calcularPrecioPedido(){
        
        
    }
    
    
    
}
