
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupofp.controlador;
import java.util.Scanner;

/**
 *
 * @author Marc
 */
public class OnlineStore 
    {  
    public static void main(String[] args)
    {
        Controlador controlador = new Controlador();
        
        
        
        controlador.cargarDatos(); 
        controlador.accionMenuPrincipal();
       

    }
}