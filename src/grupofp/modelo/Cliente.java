/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;


public abstract class Cliente {
    protected String nombre; 
    protected String NIF; 
    protected String domicilio; 
    protected String email;
    private String tipoC; 
    private int cuota; 
    private int dto; 

    public Cliente(String nombre, String NIF, String domicilio, String email, String tipoC, int cuota, int dto) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.domicilio = domicilio;
        this.email = email;
        this.tipoC = tipoC;
        this.cuota = cuota;
        this.dto = dto;
    }

    public Cliente() {
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", NIF=" + NIF + ", domicilio=" + domicilio + ", email=" + email + ", tipoC=" + tipoC + ", cuota=" + cuota + ", dto=" + dto + '}';
    }
    
    
    String getNombre(){
        return nombre;
    }
    
    String getNIF(){
        return NIF; 
    }
    
    String getDomicilio(){
        return domicilio; 
    }
    
    String getEmail(){
        return email; 
    }
    
    void setNombre(String n){
        nombre = n; 
    }
    
    void setNIF(String nif){
        NIF = nif; 
    }
    
    void setDomicilio(String d){
        domicilio = d; 
    }
    
    void setEmail(String e){
        email = e; 
    }
    
    String tipoCliente(Cliente c){
        if(c instanceof ClienteEstandard){
          tipoC= "estandard";  
        }
        if(c instanceof ClientePremium){
          tipoC= "premium";  
        }  
        return tipoC; 
    }
    
    int cuotaAnual(Cliente c){
        if(c instanceof ClienteEstandard){
         cuota=0;   
        }
        if(c instanceof ClientePremium){
          cuota = 30; 
        }  
        return cuota; 
    }
    
    int dtoEnvio(Cliente c){
        if(c instanceof ClienteEstandard){
         dto= 0;   
        }
        if(c instanceof ClientePremium){
          dto = 20; 
        }  
        return dto; 
    }
}
