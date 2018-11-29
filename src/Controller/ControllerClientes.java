/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

// importamos los paquetes del modelo
import Model.ClientesCRUD;
import Model.ClientesDatos;  
import java.util.InputMismatchException;

/**
 *
 * @author 
 */
public class ControllerClientes {
    
    //Crear constructor si es necesario instanciar el objeto
    
    public ControllerClientes(){
        
    }
    
    public boolean SaveClientes(int DNI, String apellido, String nombre){
              
        boolean isSaved;
        
        try {           
            // llamar a un metodo del modelo que nos genere el objeto Cliente
            ClientesDatos nuevoCliente = new ClientesDatos(DNI, apellido, nombre);       
            
            // llamar a otro método del modelo que nos guarde en una lista de clientes
            ClientesCRUD listaDeCientes = new ClientesCRUD();
            isSaved = listaDeCientes.AddClientes(nuevoCliente);
            
        } catch (InputMismatchException e ){
            System.out.println("Hubo un error con los datos del dni del cliente");    
            isSaved = false;
        }; 
        
        return isSaved;
        
    }
    
}
