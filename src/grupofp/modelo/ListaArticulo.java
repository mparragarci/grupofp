
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author pcsalvador
 */

public class ListaArticulo {
    private ArrayList<Articulo> articulos = new ArrayList<Articulo>(); 
    
    public void addArticulo(Articulo a){
        articulos.add(a);
    }
    
    public Articulo getArticulo(int p){
        return articulos.get(p);
    }
    
}