/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ast;
        //for (int i=1;i<=10;i++){
          //  System.out.println("*"*(i+1));
         for (int i= 65;i<=96;i++){
             ast = (char)i;
             System.out.printf("%d |%s|\n",i,ast);
         
         }
         System.out.println("");
         for (int i= 97;i<=122;i++){
             ast = (char)i;
             System.out.printf("%d |%s|\n",i,ast);
         
         }
        }
    }
    

