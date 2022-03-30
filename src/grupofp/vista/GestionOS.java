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
import java.io.*;

/**
 * @author splan
 */

public class GestionOS {
    private int opcio; 
    private int lecturaInt;
    private String lecturaString;
    public Scanner sc = new Scanner(System.in);
    InputStreamReader flujo = new InputStreamReader(System.in);
    BufferedReader teclado = new BufferedReader(flujo);
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

    private ClienteEstandard clienteE;
    private ClientePremium clienteP;
    protected String nombre; 
    private Cliente c;
    protected String domicilio; 
    protected String email;
    
    
    public GestionOS(){
        System.out.println("\t----------------------------------");
        System.out.println("\tPROGRAMA DE GESTIÓ DE ONLINE STORE");
        System.out.println("\t----------------------------------\n");
    }
    
    
    
    public int printMenuPrincipal(){
        System.out.println("--------------");
        System.out.println("0. Finalizar Programa ");
        System.out.println("1. Gestión Articulos ");
        System.out.println("2. Gestión Clients ");
        System.out.println("3. Gestión Pedidos ");
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
        System.out.println("2. Mostrar Articulos ");
        System.out.println("3. Modificar Articulo");
        opcio = pedirValorMenu(3);
        
        return opcio; 
    }
    
    public Articulo pedirArticulo() {
        
        System.out.println("Introducid datos del articulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Codigo: ");
        codigo = "";
        codigo = sc.nextLine(); 
        
        System.out.println("Nombre: ");
        descripcion = "";
        //descripcion = sc.nextLine();
        try{
            descripcion = teclado.readLine();
        } catch(IOException e){};
        
        System.out.println("Precio_venta/unidad: ");
        precioVenta = sc.nextDouble();
        
        System.out.println("Gasto envío: ");
        gastosEnvio = sc.nextDouble();
        
        System.out.println("Tiempo Preparacion(minutos): ");
        tPrep = sc.nextDouble();
        
        Articulo articulo = new Articulo(codigo,descripcion,precioVenta,gastosEnvio,tPrep);
        
        printArticulo(articulo);
        System.out.println("\t¡Articulo añadido!"); 
        return articulo; 
    }
    
    
    //Mismo metodo que el anterior pero modificamos un articulo concreto
    public Articulo pedirArticulo2(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Modificamos articulo"+i+":");
        
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
        
        Articulo articulo = new Articulo(codigo,descripcion,precioVenta,gastosEnvio,tPrep);
        
        System.out.println("\t¡Articulo modificado!"); 
        return articulo; 
    }
    
    public int pedirNumeroArticulo(int nMax){
        Scanner sc = new Scanner(System.in);
        if(nMax==1) System.out.println("\nNº Articulo: 0");
        if(nMax>1) System.out.println("\nNº Articulo: 0 - "+(nMax-1));
      
        opcio = sc.nextInt();
        while (opcio <0 || opcio>nMax){
            System.out.println("Error");
            if(nMax==1) System.out.println("\nNº Articulo: 0");
            if(nMax>1) System.out.println("\nNº Articulo: 0 - "+(nMax-1));
            opcio = sc.nextInt();
        }
        return i; 
    }
    
    public void printArticulo(Articulo art){
        // art.toString();
        System.out.println("\n--Articulo--");

        System.out.println("Codigo: "+art.getCodigo());
        System.out.println("Nombre: "+art.getNombre());
        System.out.println("Precio Venta: "+art.getPrecioVenta());
        System.out.println("Gasto Envio: "+art.getGastosEnvio());
        System.out.println("Tiempo prep (min): "+art.getTiempoPreparacion());
    }
    
    
    
    
    //
    //  CLIENTES
    //
    public int printMenuClientes(){
        System.out.println("\n--------------");
        System.out.println("0. Menú principal ");
        System.out.println("1. Añadir Cliente ");
        System.out.println("2. Mostrar Clientes ");
        System.out.println("3. Eliminar Cliente");
        opcio = pedirValorMenu(3);
        
        return opcio; 
    }
    
    public int printTipoCliente(){
        System.out.println("\n--------------");
        System.out.println("1. Añadir Cliente Estandard ");
        System.out.println("2. Añadir Cliente Premium");
        System.out.println("->: ");
        
        opcio = pedirTipoCliente();
        return opcio;
    }
    
    public ClienteEstandard pedirClienteE(){
        System.out.println("Introducid datos cliente(estandard)");
        System.out.println("Nombre: ");
        try{
            nombre = teclado.readLine();
        } catch(IOException e){};
        
        System.out.println("NIF: ");
        NIF = sc.nextLine();
        
        System.out.println("Direccion: ");
        try{
            domicilio = teclado.readLine();
        } catch(IOException e){};
        
        System.out.println("Email: ");
        try{
            email = teclado.readLine();
        } catch(IOException e){};
        
        clienteE = new ClienteEstandard(nombre,NIF,domicilio,email);
        return clienteE;
    }
    
        
    public ClientePremium pedirClienteP(){
        System.out.println("Introducid datos cliente(premium)");
        System.out.println("Nombre: ");
        try{
            nombre = teclado.readLine();
        } catch(IOException e){};
        
        System.out.println("NIF: ");
        NIF = sc.nextLine();
        
        System.out.println("Direccion: ");
        try{
            domicilio = teclado.readLine();
        } catch(IOException e){};
        
        System.out.println("Email: ");
        try{
            email = teclado.readLine();
        } catch(IOException e){};
        
        clienteP = new ClientePremium(nombre,NIF,domicilio,email);
        
        return clienteP;
    }
    
    public void printCliente(Cliente c){
        if(c instanceof ClienteEstandard) System.out.println("\n--Cliente Estandard--");
        if(c instanceof ClientePremium){
            System.out.println("\n--Cliente Premium--");
        }
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("NIF: "+c.getNif());
        System.out.println("Direccion: "+c.getDomicilio());
        System.out.println("Mail: "+c.getEmail());
    }
    
    public int pedirNumeroCliente(int nMax){
        Scanner sc = new Scanner(System.in);
        if(nMax==1) System.out.println("Solo un cliente: 0");
        if (nMax>1) System.out.println("Nº cliente: 0 - "+(nMax-1));
        System.out.println("->: ");

        opcio = sc.nextInt();
        while (opcio <0 || opcio>nMax){
            System.out.println("Error");
            if(nMax==1) System.out.println("Solo un cliente: 0");
            if (nMax>1) System.out.println("Nº cliente: 0 - "+(nMax-1));
            System.out.println("Valor de 0 - "+(nMax-1)+": ");
            opcio = sc.nextInt();
        }
        
        return opcio;
    }
    
    public boolean confirmarEliminacionCliente(Cliente c){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        printCliente(c);
        System.out.println("Seguro que lo desea eliminar: 1-si o 2-no ");
        System.out.println("->: ");
        opcio = pedirConfirmacion();
        
        if(opcio==1){
            eliminar = true;
            System.out.println("¡Cliente eliminado!");
        }
        else{
            eliminar = false;
        }
        
        return eliminar;
    }
    
    public void noHayClientes(){
        System.out.println("¡No hay clientes!");
    }
    
    
    
    
    
    //
    // PEDIDOS
    //
    public int printMenuPedidos(){
        System.out.println("\n--------------");
        System.out.println("0. Menú principal ");
        System.out.println("1. Añadir Pedido ");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Eliminar Pedido");
        opcio = pedirValorMenu(3); 
        
        return opcio; 
    }
    
    public Pedido pedirPedido(){
        
        System.out.println("Introducid datos del pedido: ");
        
        System.out.println("Nº pedido: ");
        numPedido = sc.nextInt();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("NIF: ");
        NIF = sc.nextLine();
        
        System.out.println("codigo artículo: ");
        codigoArticulo = sc.nextLine();
                
        System.out.println("unidades: ");
        unidades = sc.nextInt();
        
        System.out.println("Formato fecha: aaaa mm dd donde aaaa es año, mm es mes y dd es dia");
        System.out.print("Fecha pedido: ");
        try{
            fecha = teclado.readLine();
        } catch(IOException e){};
            
        
        System.out.println("Formato hora: hh mm donde hh es hora y mm es minutos");
        System.out.print("Hora pedido: ");
        try{
            hora = teclado.readLine();
        } catch(IOException e){};
        
        //Ja podem inicialitzar pedido, el preu el calcularem després
        Pedido pedido = new Pedido(numPedido,NIF,codigoArticulo,unidades,fecha,hora);
        printPedido(pedido);
        
        return pedido;
    }
    
    
    public void confirmarPedidoAñadido(Pedido p){
        System.out.println("\n\t¡Pedido añadido!");
        printPedido(p);
    }
    
    
    public void printPedido(Pedido p){
        System.out.println("\n--Pedido--");
        System.out.println("Nª pedido: "+p.getNumPedido());
        System.out.println("NIF: "+p.getNif());
        System.out.println("Articulo: "+p.getCodigoArticulo());
        System.out.println("Unidades: "+p.getUnidades());
        System.out.println("Fecha: "+p.getFecha());
        System.out.println("Hora: "+p.getHora());
    }
    
    
    public int pedirNumeroPedido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº pedido: ");
        i = sc.nextInt();
        return i;
    }
    
    public boolean confirmarEliminacionPedido(Pedido p){
        printPedido(p);
        System.out.println("Seguro que lo desea eliminar: 1-si | 2-no ");
        System.out.println("->: ");
        opcio = pedirConfirmacion();
        
        if(opcio==1){
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
        Scanner sc = new Scanner(System.in);
        System.out.println("->: ");
        //lecturaInt = sc.nextInt();
        lecturaInt = sc.nextInt();
        //Mentre opcio < 0 o opcio>nMAx, demanarem sempre el valor
        while(lecturaInt <0 || lecturaInt > nMax){
            System.out.println("Error");
            System.out.println("Valor de 0 a "+nMax+": ");
            lecturaInt = sc.nextInt();
        }
        
        return lecturaInt;
    }
    
    
    //Assegurar-nos que diu si o no
    public int pedirConfirmacion(){
        Scanner sc = new Scanner(System.in);
      
        lecturaInt = sc.nextInt();
        
        while(lecturaInt<1 || lecturaInt>2){
            System.out.println("Error");
            System.out.println("1-si | 2-no ");
            lecturaInt = sc.nextInt();
        }
        
        return lecturaInt;
    }
    
    //Assegurar-nos que introdueix 1 o 2
    public int pedirTipoCliente(){
        Scanner sc = new Scanner(System.in);
        lecturaInt=sc.nextInt();
       
        while(lecturaInt<1 || lecturaInt>2){
            System.out.println("Error");
            System.out.println("1 o 2 ->: ");
            lecturaInt = sc.nextInt();
        }
        
        return lecturaInt;
    }
    
    
}