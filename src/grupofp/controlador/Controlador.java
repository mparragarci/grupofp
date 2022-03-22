/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package grupofp.controlador;
import grupofp.modelo.*;
import grupofp.vista.*;
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
        opcion=gestion.printMenuPrincipal();
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
            case 3 : {
                i=gestion.pedirNumeroArticulo(); 
                modificarArticulo(i);
            } 
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
    
    public void modificarArticulo(int i){
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
          lista lista = Datos.añadirClienteEstandard();
        GestionOS.ClientesEstandard(lista);
    }

        
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
        
    }
    
    
            
}