/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Otros;

/**
 *
 * @author pcsalvador
 */
public class Fecha {
    private int dia;
    private int mes;
    private int any;
    
    Fecha(int d, int m, int a){
        dia=d;
        mes=m;
        any=a;
    }
    
    int getDia(){
        return dia;
    }
    
    int getMes(){
        return mes;
    }
    
    int getAny(){
        return any;
    }
    
}
