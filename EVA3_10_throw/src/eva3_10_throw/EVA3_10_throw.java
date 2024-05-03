/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_10_throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Persona perso = new Persona();
            perso.setNombre("Juan");
            perso.setApellido("Perez");
            perso.setEdad(-1);
        }   catch (Exception ex) {
            ex.printStackTrace();
        }
  
    }
        
    
}
 class Persona{
 private String nombre; 
 private String apellido;
 private int edad;
 

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "sin nombre";
        this.apellido = "sin apellido";
        this.edad = 0;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if ((edad < 0) || (edad > 150))
            throw new Exception ("Valor capturado en la eda no es valida");
        this.edad = edad;
    }
    
 }
 