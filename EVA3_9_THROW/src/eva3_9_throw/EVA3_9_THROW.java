/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_throw;

import static eva3_9_throw.EVA3_9_THROW.MetodoProblematico;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_9_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MetodoProblematico();
        } catch (Exception ex) {
            Logger.getLogger(EVA3_9_THROW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void MetodoProblematico() throws Exception{
        System.out.println("Holi");
        throw new Exception("falla del sistema!!!");
        //System.out.println("Hellow kitty"); NUNCA SE VA A EJECUTAR
    }
}
