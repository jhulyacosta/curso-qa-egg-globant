package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author jhuly
 */
public class ServicioMascota {
    
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota() {
        
        System.out.println("Introduzca el nombre:");
        String nombre = leer.next();
        
        System.out.println("Introduzca el apodo:");
        String apodo = leer.next();
        
        System.out.println("Introduzca el tipo:");
        String tipo = leer.next();
        
        
        // en este caso no neceesitamos necesariamente una variable, en etse caso llamada creacionMascota
        //entonces se puede escribir así la sentencia:
        //Mascota creacionMascota = new Mascota(nombre, apodo, tipo);
        // return creacionMascota;
        
        // pero también podemos hacer lo siguiente y nos quedaremos con esta:
        
        return new Mascota(nombre, apodo, tipo);
        
        
        
    }

}
