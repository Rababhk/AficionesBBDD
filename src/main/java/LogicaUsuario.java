
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damA
 */
public class LogicaUsuario {
    private static List<Cliente> listaClientes= new  ArrayList<>();
    
    public static void anadirCliente (Cliente cliente){
        listaClientes.add(cliente);
    }
    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public static void Borrarcliente(int indice)
    {
        listaClientes.remove(indice);
    }
    public static void BorrarCascada()
    {
        listaClientes.clear();
    }
}
