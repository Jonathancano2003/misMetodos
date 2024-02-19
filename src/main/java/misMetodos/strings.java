
package misMetodos;

import java.util.Scanner;

public class strings {
      /**
     * Quita los espacios de un string y la devuelve
     *
     * @param palabra
     * @return string builder de string sin espacios
     */
    public static StringBuilder eliminarEspacios(String palabra) {
        StringBuilder palabraSb = new StringBuilder(palabra);

        for (int i = 0; i < palabraSb.length(); i++) {
            if (palabraSb.charAt(i) == ' ') {
                palabraSb.deleteCharAt(i);

                i = -1;
            }

        }
        return palabraSb;
    }

    /**
     * Sustituye un letra por otra que introduzcamos
     *
     * @param palabra
     * @return palabra cambiada
     */
    public static StringBuilder sustituirLetras(String palabra) {
        StringBuilder palabraSb = new StringBuilder(palabra);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la letra que quieres sustituir de " + palabra);
        char buscarChar = sc.next().charAt(0);
        System.out.println("Introduce la letra que quieres poner");
        char addChar = sc.next().charAt(0);

        for (int i = 0; i < palabraSb.length(); i++) {
            if (palabraSb.charAt(i) == buscarChar) {
                palabraSb.setCharAt(i, addChar);
            }
        }
        return palabraSb;
    }
    
    /**
     * cuenta los carcateres que tiene una palabra 
     * @param palabra
     * @param minuscula
     * @param mayuscula
     * @return 
     */
    public static int contarCaracteres(String palabra,char minuscula,char mayuscula){
          int count=0;
        for(int i =0;i<palabra.length();i++){
            if(palabra.charAt(i)==minuscula|| palabra.charAt(i)==mayuscula ){
               count++;
            }
                
        }
        System.out.println(count);
        return count;
    }
}
