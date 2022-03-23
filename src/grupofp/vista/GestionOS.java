/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupofp.vista;
import Otros.Fecha;
import Otros.Hora;
import grupofp.modelo.*;
import grupofp.vista.*;
import java.util.Scanner;

/**
 *
 * @author splan
 */
public class GestionOS {
    private int opcio; 
    private int lecturaInt;
    private String lecturaString;
    public Scanner sc = new Scanner(System.in);
    private String confirmar;
    private Boolean eliminar;
    
    private int i; 
    //Variables de articulo
    private Articulo articulo; 
    private String codigo;
    private String descripcion;
    private Double precioVenta;
    private Double gastosEnvio;
    private Double tPrep;
    
    //Variables de pedido
    private Pedido pedido; 
    private int numPedido;
    private String NIF; 
    private String codigoArticulo;
    private int unidades; 
    private String fecha; //Formato: aaaa-mm-dd donde aaaa es el año, mm es el mes y dd es el dia
    private String hora;  //Formato: hh:mm donde hh es hora y mm es minuto
    private Double precioPedido; 
    
    
    //Variables de cliente
    private Cliente cliente;
    
    
    
    public GestionOS(){
        System.out.println("\t----------------------------------");
        System.out.println("\tPROGRAMA DE GESTIÓ DE ONLINE STORE");
        System.out.println("\t----------------------------------\n");
    }
    
    
    
    public int printMenuPrincipal(){
        
        System.out.println("\n--------------");
        System.out.println("0. Finalizar Programa ");
        System.out.println("1. Gestión Articulos ");
        System.out.println("2. Gestión Clients ");
        System.out.println("3. Gestión Pedidos\n->: ");
        opcio = pedirValorMenu(3);
        
        return opcio; 
    }
    
    
    
    //
    // ARTICULOS
    // 
    public int printMenuArticulos(){
        System.out.println("\n--------------");
        System.out.println("0. Menú principal ");
        System.out.println("1. Añadir Artículo ");
        System.out.println("2. Modificar Artículo\n->: ");
        opcio = pedirValorMenu(2);
        
        return opcio; 
    }
    
    public Articulo pedirArticulo(){
        System.out.println("Introducid datos del articulo");
        
        System.out.println("Codigo: ");
        codigo = sc.nextLine(); 
        
        System.out.println("Nombre: ");
        descripcion = sc.nextLine();
        
        System.out.println("Precio_venta/unidad: ");
        precioVenta = sc.nextDouble();
        
        System.out.println("Gasto envío: ");
        gastosEnvio = sc.nextDouble();
        
        System.out.println("Tiempo Preparacion(minutos): ");
        tPrep = sc.nextDouble();
        
        articulo = new Articulo(codigo,descripcion,precioVenta,gastosEnvio,tPrep);
        
        System.out.println("\t¡Articulo añadido!"); 
        return articulo; 
    }
    
    //Mismo metodo que el anterior pero modificamos un articulo concreto
    public Articulo pedirArticulo2(int i){
        System.out.println("Modificamos articulo"+i+":");
        
        System.out.print("Codigo: ");
        codigo = sc.nextLine(); 
        
        System.out.print("Nombre: ");
        descripcion = sc.nextLine();
        
        System.out.print("Precio_venta/unidad: ");
        precioVenta = sc.nextDouble();
        
        System.out.print("Gasto envío: ");
        gastosEnvio = sc.nextDouble();
        
        System.out.print("Tiempo Preparacion(minutos): ");
        tPrep = sc.nextDouble();
        
        articulo = new Articulo(codigo,descripcion,precioVenta,gastosEnvio,tPrep);
        
        System.out.println("\t¡Articulo modificado!"); 
        return articulo; 
    }
    
    public int pedirNumeroArticulo(){
        System.out.print("\nNº Articulo (considere primer articulo es el 0): ");
        opcio = sc.nextInt();
        return i; 
    }
    
    public void printArticulo(Articulo art){
        art.toString();
        System.out.println(""); //Espaciar
    }
    
    
    
    
    //
    //  CLIENTES
    //
    public int printMenuClientes(){
        System.out.println("\n--------------");
        System.out.println("0. Menú principal ");
        System.out.println("1. Mostrar Clientes ");
        System.out.println("2. Añadir Cliente ");
        System.out.println("3. Eliminar Cliente\n->: ");
        opcio = pedirValorMenu(3);
        
        return opcio; 
    }
    
    public int printTipoCliente(){
        System.out.println("\n--------------");
        System.out.println("1. Añadir Cliente Estandard ");
        System.out.println("2. Añadir Cliente Premium");
        
        opcio = pedirTipoCliente();
        return opcio;
    }
    
    public void printCliente(Cliente c){
        c.toString();
        System.out.println(""); //Espaciar
    }
    
    public int pedirNumeroCliente(){
        System.out.print("Nº cliente: ");
        i = sc.nextInt();
        return i;
    }
    
    public boolean confirmarEliminacionCliente(Cliente c){
        System.out.println("");
        printCliente(c);
        System.out.print("Seguro que lo desea eliminar: 'si' o 'no' ");
        confirmar = pedirConfirmacion();
        
        if(confirmar=="si"){
            eliminar = true;
        }
        else{
            eliminar = false;
        }
        
        return eliminar;
    }
    
    
    
    
    
    
    
    //
    // PEDIDOS
    //
    public int printMenuPedidos(){
        System.out.println("\n--------------");
        System.out.println("0. Menú principal ");
        System.out.println("1. Añadir Pedido ");
        System.out.println("2. Pedido Pendiente Envío ");
        System.out.println("3. Pedidos Enviados ");
        System.out.println("4. Eliminar Pedido \n->: ");
        opcio = pedirValorMenu(4);
        
        return opcio; 
    }
    
    public Pedido pedirPedido(){
        System.out.println("Introducid datos del pedido: ");
        
        System.out.print("Nº pedido: ");
        numPedido = sc.nextInt();
        
        System.out.print("NIF: ");
        NIF = sc.nextLine();
        
        System.out.print("codigo artículo: ");
        codigoArticulo = sc.nextLine();
                
        System.out.print("unidades: ");
        unidades = sc.nextInt();
        
        System.out.println("Formato fecha: aaaa-mm-dd donde aaaa es año, mm es mes y dd es dia");
        System.out.print("Fecha pedido: ");
        fecha = sc.nextLine();
            
        
        System.out.println("Formato hora: hh:mm donde hh es hora y mm es minutos");
        System.out.print("Hora pedido: ");
        hora = sc.nextLine();
        
        //Ja podem inicialitzar pedido, el preu el calcularem després
        pedido = new Pedido(numPedido,NIF,codigoArticulo,unidades,fecha,hora);
        
        return pedido;
    }
    
    
    public void confirmarPedidoAñadido(Pedido p){
        System.out.println("\n¡Pedido añadido!");
        printPedido(p);
    }
    
    
    public void printPedido(Pedido p){
        p.toString();
        System.out.println("");
    }
    
    
    public int pedirNumeroPedido(){
        System.out.print("Nº pedido: ");
        i = sc.nextInt();
        return i;
    }
    
    public boolean confirmarEliminacionPedido(Pedido p){
        System.out.println("");
        printPedido(p);
        System.out.print("Seguro que lo desea eliminar: 'si' o 'no' ");
        confirmar = pedirConfirmacion();
        
        if(confirmar=="si"){
            eliminar = true;
        }
        else{
            eliminar = false;
        }
        
        return eliminar;
    }
    
    
    
    //
    // OTROS
    //
    
    //Metode per a demanar un valor dels menus,,, de 0 fins a 4
    public int pedirValorMenu(int nMax){
        
        lecturaInt = sc.nextInt();
        
        //Mentre opcio < 0 o opcio>nMAx, demanarem sempre el valor
        while(lecturaInt <0 && lecturaInt > nMax){
            System.out.println("Error");
            System.out.print("Valor de 0 a "+nMax+": ");
            lecturaInt = sc.nextInt();
        }
        
        return lecturaInt;
    }
    
    
    //Assegurar-nos que diu si o no
    public String pedirConfirmacion(){
        
        lecturaString = sc.nextLine();
        
        while(lecturaString!="si" && lecturaString!="no"){
            System.out.println("Error");
            System.out.print("'si' o 'no': ");
            lecturaString = sc.nextLine();
        }
        
        return lecturaString;
    }
    
    //Assegurar-nos que introdueix 1 o 2
    public int pedirTipoCliente(){
        
        lecturaInt=sc.nextInt();
        
        
        while(lecturaInt<1 && lecturaInt>2){
            System.out.println("Error");
            System.out.print("1 o 2 ->: ");
            lecturaInt = sc.nextInt();
        }
        
        return lecturaInt;
    }
    
    
}