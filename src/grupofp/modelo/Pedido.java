
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

import Otros.Hora;
import Otros.Fecha;
import java.util.ArrayList;
/**
 *
 * @author pcsalvador
 */
public class Pedido {
    
    private int numPedido; 
    private String NIF; 
    private String codigoArticulo; 
    private int unidades; 
    private String fecha; //Formato: aaaa-mm-dd donde aaaa es el año, mm es el mes y dd es el dia
    private String hora;  //Formato: hh:mm donde hh es hora y mm es minuto
    private Double precioPedido; 
    
    
    //IMPORTANT: Inicialitzem el pedido sense calcular el preu
    public Pedido(int n, String nif, String c, int unidades, String f, String h){
        numPedido=n;
        NIF=nif;
        codigoArticulo=c;
        this.unidades=unidades; 
        fecha=f;
        hora=h;
    }
    
    int getNumPedido(){
        return numPedido; 
    }
    
    int getUnidades(){
        return unidades;  
    }
    
    public String getNif(){
        return NIF; 
    }
    
    public String getCodigoArticulo(){
        return codigoArticulo; 
    }
    
    Double getPrecioPedido(){
        return precioPedido; 
    }
    
    public void calcularPrecioPedido(Cliente c, Articulo a){
        //Calculem preu genèric: preu = preu unitat * quan/unitats
        precioPedido = a.getPrecioVenta() * unidades;
        
        //Recordem: Clients premiums tenen 20% dto en el enviament
        if(c instanceof ClienteEstandard){
            //No fem res, per que no hi ha dto
        }
        
        if(c instanceof ClientePremium){
            //Apliquem 20% dto, es el mateix que multiplicar per 0.8
            precioPedido = precioPedido*0.8;
        }
    }   
    
    public boolean pedidoEnviado(){
        return false;
    }

    public float precioEnvio(){
        return 0;
    }
    
    
    
    
      @Override
    public String toString() {
        return "Pedido{" + "numPedido=" + numPedido + ", NIF=" + NIF + ", codigoA=" + codigoArticulo + ", unidades=" + unidades + ", fecha=" + fecha + ", hora=" + hora + ", precioPedido=" + precioPedido + '}';
    }
    
}