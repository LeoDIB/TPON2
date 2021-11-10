/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author leonardo dibiagi
 */
public class ControladoraPersistencia {

    ClienteJpaController clienteJPA = new ClienteJpaController();
    //Método para alta

    public void crearCliente(Cliente cliente) {

        try {
            clienteJPA.create(cliente);
        } catch (Exception e) {

            System.out.println("No se pudo crear el cliente. Se encuentra vacío");

        }
       
        
    }
    
    //Método para baja
    
    public void eliminarCliente(Cliente cliente) {

        try {
            clienteJPA.destroy(cliente.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void eliminarCliente(int id) {

        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
     //Método para Lectura
     
     public List<Cliente> obtenerCliente(){
     
     return clienteJPA.findClienteEntities();
     
     
     
     }
     
     //Método para modificación
     
     public void modificarCliente(Cliente cliente){
     
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     
     //Método para buscar
     
     public Cliente buscarCliente(Cliente cliente){
     
     return clienteJPA.findCliente(cliente.getNroCliente());
   
     
     }
     
      public Cliente buscarCliente(int id){
     
     return clienteJPA.findCliente(id);
   
     
     }

    }





