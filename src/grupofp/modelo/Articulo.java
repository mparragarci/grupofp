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

 
    
    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", gastosEnvio=" + gastosEnvio + ", tPrep=" + tPrep + '}';
    }
    
   
    
    
    //
    // GETTERS
    //
    public String getCodigo(){
        return codigo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public Double getPrecioVenta(){
        return precioVenta; 
    }
    
    public Double getGastosEnvio(){
        return gastosEnvio;
    }
    
    public Double getTiempoPreparacion(){
        return tPrep; 
    }
    
 
    
    //
    //SETTERS
    //
    public void setCodigo(String c){
        codigo=c; 
    }
    
    public void setDescripcion(String d){
        descripcion = d; 
    }
    
    public void setPrecioVenta(Double precio){
        precioVenta=precio; 
    }
    
    public void setGastosEnvio(Double g){
        gastosEnvio =g; 
    }
    
    public void setTPrep(Double t){
        tPrep = t; 
    }
    
   
}