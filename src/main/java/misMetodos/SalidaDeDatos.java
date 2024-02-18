/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misMetodos;

/**
 *
 * @author canoj
 */
public class SalidaDeDatos {

    public static void mostrarTexto(String... opciones) { //Los 3 puntos es como un array para ir guardando strings
        for (String op : opciones) { //El for each le pones un nombre a la variable que recorrerá el valor de las opciones
            System.out.println(op);
        }
    }
}
