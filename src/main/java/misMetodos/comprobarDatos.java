/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misMetodos;

/**
 *
 * @author canoj
 */
public class comprobarDatos {
/**
 * Compruba siun caracter es un letra
 * @param comprobar
 * @return si es letra es true
 */
    public static boolean comprobarSiCharEsLetra(char comprobar) {
        boolean esLetra = false;
        comprobar = Character.toLowerCase(comprobar);

        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w'};

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == comprobar) {
                esLetra = true;
                break;
            }
        }
        return esLetra;
    }
/**
 * Comprueba si el string que pasamos es un numero
 * @param comprobar
 * @return 
 */
    public static boolean comprobarSiStringEsNumero(String comprobar) {
        try {
            int numero = Integer.parseInt(comprobar);
            return true;
        } catch (java.lang.NumberFormatException e) {

            return false;
        }
    }
}
