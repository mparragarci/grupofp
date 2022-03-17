/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupofp.modelo;

import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class Lista {
    protected ArrayList<Articulo> articulo = new ArrayList<>();
    protected ArrayList<Cliente> cliente = new ArrayList<>();
    protected ArrayList<Pedido> pedido = new ArrayList<>();
    protected ArrayList<Lista> lista = new ArrayList<>();
}
