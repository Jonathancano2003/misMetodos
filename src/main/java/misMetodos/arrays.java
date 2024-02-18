/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misMetodos;
d
public class arrays {
/**
 * Comprueba si un array es lleno
 * @param obj
 * @return 
 */
    public static boolean isFull(Object obj[]) { 

        boolean lleno = true;
        for (int i = 0; i < obj.length && lleno; i++) {
            if (obj[i] == null) {
                lleno = false;
            }
        }

        return lleno;
    }
/**
 * Verifica si esta vacio
 * @param obj
 * @return 
 */
    public static boolean isEmpty(Object obj[]) { 
        boolean vacio = false;
        int contador = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null) {
                contador++;
            }
            if (contador == obj.length) {
                vacio = true;
                break;
            }
        }
        return vacio;
    }

    /**verifica si hay espacio
     * 
     * @param obj
     * @return 
     */
    public static int positionFree(Object obj[]) {
        int posicion = -1;
        boolean encontrado = false;
        for (int i = 0; i < obj.length && !encontrado; i++) {
            if (obj[i] == null) {
                posicion = i;
                encontrado = true;
            }
        }

        return posicion;
    }
}
