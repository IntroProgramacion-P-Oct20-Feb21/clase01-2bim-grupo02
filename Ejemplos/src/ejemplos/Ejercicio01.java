/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author USUARIO
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        String frase = "Hola Mundo";
        char posicion;
        int i;
        int conMayus = 0;
        int conMin = 0;
        String cadena = "Frase con:\n";
        for (i = 0; i < frase.length(); i++) { //Minusculas
            posicion = frase.charAt(i);
            if ((((int) posicion) >= 65) && (((int) posicion) <= 90)) {
                conMayus += 1;
            } else {
                if ((((int) posicion) >= 97) && (((int) posicion) <= 122)) {
                    conMin += 1;

                }

            }
            
        }
    System.out.printf("%sNúmero de minusculas: %d\nNúmero de Mayusculas: %d\n",
                    cadena, conMin, conMayus);

}
}