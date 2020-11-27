
package openshop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Naiara
 */
public class Cliente {
    String nombre;
    String apellido;
    String email;
    int dni;
    int telefono;
    String domicilio;
    String provincia;
    String usuario;
    String contrasena;

    public Cliente(String nombre, String apellido, String email, int dni, int telefono, String domicilio, String provincia, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.domicilio = domicilio;
        this.provincia = provincia;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
        
         
    }

    Cliente(int idCliente, String domicilio, String provincia, int dni, String usuario, String contrasena, String mail, String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
