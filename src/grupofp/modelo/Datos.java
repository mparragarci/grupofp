
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupofp.modelo;

/**
 *
 * @author pcsalvador
 */
public class Datos {
    private ListaArticulo listaArticulos; 
    private ListaCliente listaClientes; 
    private ListaPedido listaPedidos;
    private Articulo articulo; 
    private Cliente cliente;
    private Pedido pedido; 
    private int i;
    
    public Datos(){
        listaArticulos=new ListaArticulo(); 
        listaClientes=new ListaCliente(); 
        listaPedidos= new ListaPedido(); 
    }
    
    //
    // ARTICULOS
    //
    public void addArticulo(Articulo a){
        listaArticulos.addArticulo(a);
    }
    
    public Articulo getArticulo(int p){
        return listaArticulos.getArticulo(p);
    }
    
    public int cantidadArticulos(){
        return listaArticulos.size();
    }
    
    public void modificarArticulo(Articulo art,int i){
        listaArticulos.setArticuloLista(articulo, i);
    }
    
    //AMb aquest metode suposem que el article amb el codi introduir si que existeix,
    //Sino, fallarà... Ja farem més endavant les comprovacions de les dades
    public Articulo getArticuloDadoCodigo(String codigo){
        for(i=0; i<listaArticulos.size();i++){
            //Comparem els nif dels clients emmagatzemats amb el nif donat
            if(listaArticulos.getArticulo(i).getCodigo() == codigo ){
                articulo = listaArticulos.getArticulo(i);
            }
        }
        return articulo;
    }
    
    
    
    
    
    //
    // CLIENTES
    //
    public void addCliente(Cliente c){
        listaClientes.addCliente(c);
    }
    
    public Cliente getCliente(int p){
        return listaClientes.getCliente(p);
    }
        
    public int cantidadClientes(){
        return listaClientes.size();
    } 
    
    public int añadirClienteEstandard(){
        return listaClientes.size();
    } 
    
    //AMb aquest metode suposem que el client amb el nif introduit si que existeix,
    //Sino, fallarà... Ja farem més endavant les comprovacions de les dades    
    public Cliente getClienteDadoNif(String nif){
        for(i=0; i<listaClientes.size();i++){
            //Comparem els nif dels clients emmagatzemats amb el nif donat
            if(listaClientes.getCliente(i).getNif() == nif ){
                cliente = listaClientes.getCliente(i);
            }
        }
    return cliente;
    }
    
    
    
    
    public void eliminarCliente(int i){
        listaClientes.eliminar(i);
    }
    
    
    
    
    
    
    
    //
    // PEDIDOS
    // 
    public void addPedido(Pedido p){
        listaPedidos.addPedido(p);
    }
    
    
    
    public Pedido getPedido(int p){
        return listaPedidos.getPedido(p);
    }
   
    public int cantidadPedidos(){
        return listaPedidos.size();
    }
    
    public void eliminarPedido(int i){
        listaPedidos.eliminar(i);
    }
    
    
    
    
}