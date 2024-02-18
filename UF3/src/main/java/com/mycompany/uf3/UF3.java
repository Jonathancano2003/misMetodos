package com.mycompany.uf3;

public class UF3 {

    public static void main(String[] args) {
        comprobarDni(pedirDni());

    }

    public static String pedirDni() {
        System.out.println("Introduce un dni");
        String dni = misMetodos.solicitarDatos.pedirStringDeUnTamaño(9);
        return dni;
    }

    public static void comprobarDni(String dni) {
        StringBuilder Sbnumbers = new StringBuilder();
        char letter = dni.charAt(8);
        for (int i = 0; i < 8; i++) {
            Sbnumbers.append(dni.charAt(i));
        }
        System.out.println(Sbnumbers);
        System.out.println(letter);
        String numbers = Sbnumbers.toString();
        if (misMetodos.comprobarDatos.comprobarSiStringEsNumero(numbers) &&
                misMetodos.comprobarDatos.comprobarSiCharEsLetra(letter) == true) {
            System.out.println("El dni esta bien");
        } else {
            comprobarDni(pedirDni());
        }

    }

}
