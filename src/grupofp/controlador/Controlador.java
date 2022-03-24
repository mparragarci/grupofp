/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package grupofp.controlador;
import grupofp.modelo.*;
import grupofp.vista.*;
import java.io.*;
// Falta incluir el paquet de modelo 


/**
 *
 * @author pcsalvador
 */
public class Controlador {
    
    protected Datos datos; 
    protected GestionOS gestion; 
    private int opcion; 
    private Articulo articulo;
    private Cliente cliente; 
    private Pedido pedido; 
    private int i; 
    private boolean confirmar;
    
    Controlador(){
        datos = new Datos(); 
        gestion = new GestionOS(); 
    }
    
    
    public void accionMenuPrincipal(){
        opcion = gestion.printMenuPrincipal();
        switch(opcion){
            case 0 : finalizarPrograma();
            case 1 : gestionArticulos();
            case 2 : gestionClientes();
            case 3 : gestionPedidos(); 
        }
    }
    
    
    public void finalizarPrograma(){
      System.exit(0);  
    }   
    
    
    //
    //  ARTICULOS
    //
    public void gestionArticulos(){
        opcion=gestion.printMenuArticulos();
        switch(opcion){
            case 0 : accionMenuPrincipal();
            case 1 : añadirArticulo();
            case 2 : printArticulos();
            case 3 : modificarArticulo();    
        }
    }
    
    public void añadirArticulo(){
        articulo = gestion.pedirArticulo();
        datos.addArticulo(articulo);
        //Volvemos al menú de articulos
        gestionArticulos(); 
    }
    
    public void printArticulos(){
        for(i=0;i< datos.cantidadArticulos() ;i++){
            articulo = datos.getArticulo(i);
            gestion.printArticulo(articulo);
        }
        //Volvemos al menu
        gestionArticulos();
    }
    
    public void modificarArticulo(){
        i=gestion.pedirNumeroArticulo();
        //Imprimimos articulo i para luego modificarlo
        articulo = datos.getArticulo(i);
        gestion.printArticulo(articulo);
        //Redefinimos articulo con el nuevo articulo ya modificado
        articulo = gestion.pedirArticulo2(i);
        datos.modificarArticulo(articulo,i);
        
        //Volvemos al menu
        gestionArticulos();
    }
    
    //
    //  CLIENTES
    //
    public void gestionClientes(){
        opcion=gestion.printMenuClientes();
        switch(opcion){
            case 0 : accionMenuPrincipal();
            case 1 : printClientes();
            case 2 : añadirCliente();
            case 3 : eliminarCliente();
        }
    }
    
    public void printClientes(){
        for(i=0;i< datos.cantidadClientes() ;i++){
            cliente = datos.getCliente(i);
            gestion.printCliente(cliente);
        }
        //Tornem menu principal
        gestionClientes();
    }
    
    public void añadirCliente(){
        opcion = gestion.printTipoCliente();
        switch(opcion){
            case 1 : añadirClienteEstandard();
            case 2 : añadirClientePremium(); 
        }
        
        //Tornem menu clientes
        gestionClientes();
    }
    
    public void añadirClienteEstandard(){
       
    }
    
    public void añadirClientePremium(){
        
    }
    
    public void eliminarCliente(){
        i= gestion.pedirNumeroCliente();
        cliente = datos.getCliente(i);
        confirmar = gestion.confirmarEliminacionCliente(cliente);
        
        if(confirmar == true){
            datos.eliminarCliente(i);
        }
        
        //Tornem menu principal
        gestionClientes();
    }
    
    //
    // PEDIDOS
    // 
    public void gestionPedidos(){
        opcion=gestion.printMenuPedidos(); 
        switch(opcion){
            case 0 : accionMenuPrincipal();
            case 1 : añadirPedido();
            case 2 : pedidosPendientesEnvio();
            case 3 : pedidosEnviados();
            case 4 : eliminarPedido();    
        }   
    }
    
    
    public void añadirPedido(){
        pedido = gestion.pedirPedido();
        //Ara hem de calcular el preu 
        cliente = datos.getClienteDadoNif(pedido.getNif());
        articulo=datos.getArticuloDadoCodigo(pedido.getCodigoArticulo());
        //Calculem preu del pedido en funcio del client
        pedido.calcularPrecioPedido(cliente,articulo);
        //Ja el podem afegir al arraylist
        datos.addPedido(pedido);
        gestion.confirmarPedidoAñadido(pedido);
        
        //Volvemos al menú de articulos
        gestionPedidos();
    }
    
    public void pedidosPendientesEnvio(){
        
        
    }
    
    public void pedidosEnviados(){
        
        
    }
    
    public void eliminarPedido(){
        i= gestion.pedirNumeroPedido();
        pedido = datos.getPedido(i);
        confirmar = gestion.confirmarEliminacionPedido(pedido);
        
        if(confirmar == true){
            datos.eliminarPedido(i);
        }
        
        //Tornem menu principal
        gestionPedidos();
    }
        
        
    
    //
    //   OTROS METODOS
    //
    
    public void cargarDatos(){
        //Posar valors inicials
        
        articulo = new Articulo("A12","aguactae",2.2,30.0,3);
        datos.addArticulo(articulo);
        
        articulo = new Articulo("P1","Poma",1.5,20.0,2);
        datos.addArticulo(articulo);
        
         articulo = new Articulo("M7","maduixa",4.1,15.0,2);
        datos.addArticulo(articulo);
        
        articulo = new Articulo("C4","cereals",3.2,17.0,7);
        datos.addArticulo(articulo);
        
         articulo = new Articulo("P4","platan",1.7,14.0,2);
        datos.addArticulo(articulo);
        
        articulo = new Articulo("K8","Kiwi",2.2,22.0,6);
        datos.addArticulo(articulo);
        
         articulo = new Articulo("T6","taronja",1.4,22.0,6);
        datos.addArticulo(articulo);
        
        articulo = new Articulo("P8","pomelo",2.3,16.0,8);
        datos.addArticulo(articulo);
        
        
        
        
        
        
        
        
        
        cliente = new Cliente("Juan","53652541G","Carrer Barbera","juangmail@gmail.com");
        datos.addCliente(cliente);
        
        cliente = new Cliente("Pepe","53651541G","Carrer Llevant","pepepepito@gmail.com");
        
        cliente = new Cliente("Marisa","43542317M","Carrer Elisenda","marisaremo@gmail.com");
        datos.addCliente(cliente);
        
        cliente = new Cliente("Antonio","65454576A","Carrer Bonavista","antoniogarcia@gmail.com");
        datos.addCliente(cliente);
        
        cliente = new Cliente("Raul","56767654R","Avinguda Catalunya","raulperez3@gmail.com");
        datos.addCliente(cliente);
        
        cliente = new Cliente("Santiago","43232123S","Carrer Sepulveda","santiagomare@gmail.com");
        
        cliente = new Cliente("Laura","56547865L","Carrer Font Pudenta","lauratarante@gmail.com");
        datos.addCliente(cliente);
        
        cliente = new Cliente("Francisco","67543452F","Carrer Mallorca","franciscogil3@gmail.com");
        datos.addCliente(cliente);
   
        
        
        pedido = new Pedido(2,"53652568H","0236",4,"13-06-2022","14:02:23",2);
        datos.addPedido(pedido);
        
        pedido = new Pedido(6,"52452547Y","234",6,"11-06-2022","16:14:43",7);
        datos.addPedido(pedido);
        
                pedido = new Pedido(5,"54343214T","321",8,"23-11-2022","15:32:23",1);
        datos.addPedido(pedido);
        
        pedido = new Pedido(4,"43215456I","232",5,"11-12-2022","03:43:33",9);
        datos.addPedido(pedido);
        
                pedido = new Pedido(2,"32458765Y","565",5,"23-04-2022","20:05:23",2);
        datos.addPedido(pedido);
        
        pedido = new Pedido(4,"34654354L","21",1,"12-12-2022","13:32:34",5);
        datos.addPedido(pedido);
        
                pedido = new Pedido(5,"43254313E","436",6,"11-11-2022","11:34:22",5);
        datos.addPedido(pedido);
        
        pedido = new Pedido(4,"32123445H","45",6,"23-08-2022","21:26:45",7);
        datos.addPedido(pedido);
        
   
        
        
        
     
        
        // ClienteEstandard clienteE = new ClienteEstandard("Manolo","44444332K","carrer mare ramon","manolo.garcia@gmail.com");
        datos.addCliente(cliente);
        
    }
    
    
            
}