/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Otros;

/**
 *
 * @author pcsalvador
 */
public class Hora {
    private int hora; 
    private int minutos; 
    
    
    Hora(int h, int min){
        hora=h;
        minutos=min; 
    }
    
    int getHora(){
        return hora;
    }
    
    int getMinutos(){
        return minutos; 
    }
    
    void setHora(int h){
        hora=h; 
    }
    
    void setMinutos(int m){
        minutos=m; 
    }
    
}
