/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero entero");
        int nume = captu.nextInt();
        System.out.println("el valor capturado fue:" + nume);
        }catch(InputMismatchException e){
            System.out.println("el valor introducido no es entero");
        }finally{
            System.out.println("esta introduccion siempre se va a ejecutar");
    }
    
}
