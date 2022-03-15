/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

import Otros.Hora;


public class Articulo {
    private String codigo;
    private String descripcion;
    private Double precioVenta;
    private Double gastosEnvio;
    private Hora tPrep;

    public Articulo(String codigo, String descripcion, Double precioVenta, Double gastosEnvio, Hora tPrep) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tPrep = tPrep;
    }

    public Articulo() {
    }

    
    
    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", gastosEnvio=" + gastosEnvio + ", tPrep=" + tPrep + '}';
    }
    
    
    
    Articulo(String c, String d, double precio, double gE, Hora tiempo){
        codigo=c;
        descripcion = d; 
        precioVenta=precio;
        gastosEnvio=gE; 
        tPrep=tiempo; 
    }
    
    String getCodigo(){
        return codigo;
    }
    
    String getDescripcion(){
        return descripcion;
    }
    
    Double getPrecioVenta(){
        return precioVenta; 
    }
    
  
    
    void setCodigo(String c){
        codigo=c; 
    }
    
    void setDescripcion(String d){
        descripcion = d; 
    }
    
    void setPrecioVenta(Double precio){
        precioVenta=precio; 
    }
    
   
}
