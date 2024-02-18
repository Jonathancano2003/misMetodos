package misMetodos;

import java.util.Scanner;

public class solicitarDatos {
d
    /**
     * Solicita un string en base al tamaño que le hemos dado de parametro
     *
     * @param tamaño
     * @return el string con ese tamaño
     */
    public static String pedirStringDeUnTamaño(int tamaño) {
        String palabra = "";
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        do {
            try {
                System.out.println("Introduce una palabra de tamaño " + tamaño + ":");
                palabra = sc.next();
                if (palabra.length() == tamaño) {
                    correct = true;
                } else {
                    System.out.println("La palabra debe tener exactamente " + tamaño + " caracteres.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato sin conversión");
                sc.nextLine();
            }

        } while (!correct);
        return palabra;
    }

    /**
     * Pide un numero entero
     *
     * @param min el numero minimo
     * @param max el numero maximo
     * @return devuelve el numero introducido
     */
    public static int pedirEnteroEntre(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            try {
                System.out.println("Introduce un numero entero entre a " + min + " y " + max);
                valor = sc.nextInt();
                if (valor < min || valor > max) {
                    System.out.println("Valor incorrecto ");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato sin conversión");
                valor = min - 1;
                sc.nextLine();
            }
        } while (valor < min || valor > max);
        return valor;
    }

    /**
     * Pide un numero double
     *
     * @param min el numero minimo
     * @param max el numero maximo
     * @return devuelve el numero introducido
     */
    public static double pedirDoubleEntre(double min, double max) {
        Scanner sc = new Scanner(System.in);
        double valor;

        do {
            try {
                System.out.println("Introduce un número decimal entre " + min + " y " + max);
                valor = sc.nextDouble();

                if (valor < min || valor > max) {
                    System.out.println("Valor incorrecto. Debe estar entre " + min + " y " + max);
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato sin conversión. Debe ser un número decimal.");
                valor = min - 1;
                sc.nextLine(); // Limpiar el búfer del scanner
            }

        } while (valor < min || valor > max);

        return valor;
    }
}