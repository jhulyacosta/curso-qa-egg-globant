/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author jhuly
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        
        Mascota mascotaUno = new Mascota();
        
        mascotaUno.apodo = "Chiquito";
        mascotaUno.nombre = leer.next();
        mascotaUno.tipo = "Perro";
        mascotaUno.edad = 14;
        mascotaUno.raza = "Beagle";
        mascotaUno.cola = true;
        mascotaUno.color = "Tricolor";
        
        System.out.println(mascotaUno.apodo+" "+mascotaUno.edad+" "+mascotaUno.tipo);
        
        
        
//    public String nombre;
//    public String apodo;
//
//    // perro, gato, loro, conejo, carpincho
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
}

}
