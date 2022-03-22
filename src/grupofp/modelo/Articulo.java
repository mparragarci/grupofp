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
    private double tPrep; // ES el tiempo en minutos

    public Articulo(String codigo, String descripcion, Double precioVenta, Double gastosEnvio, double tPrep) {
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
    
    
    
    Articulo(String c, String d, double precio, double gE, double tiempo){
        codigo=c;
        descripcion = d; 
        precioVenta=precio;
        gastosEnvio=gE; 
        tPrep=tiempo; 
    }
    
    
    //
    // GETTERS
    //
    String getCodigo(){
        return codigo;
    }
    
    String getDescripcion(){
        return descripcion;
    }
    
    Double getPrecioVenta(){
        return precioVenta; 
    }
    
    Double getGastosEnvio(){
        return gastosEnvio;
    }
    
    Double getTiempoPreparacion(){
        return tPrep; 
    }
    
 
    
    //
    //SETTERS
    //
    void setCodigo(String c){
        codigo=c; 
    }
    
    void setDescripcion(String d){
        descripcion = d; 
    }
    
    void setPrecioVenta(Double precio){
        precioVenta=precio; 
    }
    
    void setGastosEnvio(Double g){
        gastosEnvio =g; 
    }
    
    void setTPrep(Double t){
        tPrep = t; 
    }
    
   
}