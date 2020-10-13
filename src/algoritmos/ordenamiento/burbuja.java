/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.ordenamiento;
import funcionesConArray.FuncionesArray;
/**
 *
 * @author diego
 */
public class burbuja {
    
    public static void main(String[] args) {
        int[] numeros = new int[5];
        FuncionesArray.llenarArray(numeros);
        FuncionesArray.mostrarArray(numeros);
        burbuja(numeros);
        FuncionesArray.mostrarArray(numeros);
    }
    
    public static void burbuja(int[] numeros){
        int longitud = numeros.length;
        boolean intercambio;
        do{
            intercambio = false;                    //lo iniciamos en false
            for(int i = 1; i < longitud; i++){
                if(numeros[i-1] > numeros[i]){      //Si el numero anterior es mayor
                    int aux = numeros[i-1];         //guardamos el numero anterior
                    //los intercambimos
                    numeros[i-1] = numeros[i];      //guardamos el numero actual en su nueva posicion
                    numeros[i] = aux;               //lo movemos a la casilla actual
                    intercambio = true;             //ha cambiado el orden
                }
            }
        }while(intercambio == true);                //comprovaamos si el orden ha sido modificado el array
         
   }
}
