/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;


public class Cliente {
    protected String nombre; 
    protected Cliente c;
    protected String NIF; 
    protected String domicilio; 
    protected String email;
    protected String tipoC; 
    protected int cuota; 
    protected double dto; 

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", NIF=" + NIF + ", domicilio=" + domicilio + ", email=" + email +'}';
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getNif(){
        return NIF; 
    }
    
    public String getDomicilio(){
        return domicilio; 
    }
    
    public String getEmail(){
        return email; 
    }
    
    public void setNombre(String n){
        nombre = n; 
    }
    
    public void setNIF(String nif){
        NIF = nif; 
    }
   
    public void setDomicilio(String d){
        domicilio = d; 
    }
    
    public void setEmail(String e){
        email = e; 
    }
    
   
    
    public String tipoCliente(Cliente c){
        if(c instanceof ClienteEstandard){
          tipoC= "estandard";  
        }
        if(c instanceof ClientePremium){
          tipoC= "premium";  
        }  
        return tipoC; 
    }
    
    public int cuotaAnual(Cliente c){
        if(c instanceof ClienteEstandard){
         cuota=0;   
        }
        if(c instanceof ClientePremium){
          cuota = 30; 
        }  
        return cuota; 
    }
    
    public double dtoEnvio(){
        if(c instanceof ClienteEstandard){
         dto= 1;   
        }
        if(c instanceof ClientePremium){
          dto = 0.8; //es 0.8 per que es multiplicar per aplicar el 20% de dto
        }  
        return dto; 
    }
      
}