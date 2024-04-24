/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_unchecked_exeptions;

/**
 *
 * @author invitado
 */
public class EVA3_2_UNCHECKED_EXEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*Persona persona = null;
        System.out.println(persona.toString());*/
        
        //INDEXOUTOFBOUNDEXEPTION
       /* int arreglo[] = new int[10];
        //0 es la primer posicion n-1 es la ultima (9)
        arreglo[15] = 100;*/
        
        //aritmethicexeption
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);
        
    }
    
}

class Persona {



}