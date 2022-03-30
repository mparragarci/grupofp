/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

/**
 *
 * @author pcsalvador
 */
public  class ClientePremium extends Cliente{
    
    public ClientePremium(String n, String nif, String d, String email ){
        nombre = n;
        NIF= nif; 
        domicilio = d; 
        this.email=email; 
    }
    
}