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
public class Ejercicio03 {
    public static void main(String[]args){
	int contador;
	String punto = ("."),puntos2 = (".");
	System.out.println(punto);
	for (contador = 1;(!(contador == 10)) ; contador++) {
            punto = punto + puntos2;
            System.out.println(punto);
	}
    }
}


