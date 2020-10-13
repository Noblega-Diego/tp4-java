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
public class porInsercion {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        FuncionesArray.llenarArray(numeros);
        FuncionesArray.mostrarArray(numeros);
        insercion(numeros);
        FuncionesArray.mostrarArray(numeros);
    }
    public static void insercion(int[] numeros){
        for(int i = 1; i<numeros.length; i++){              //recorremos el array empesando de 1(n+1)
            int valor = numeros[i];                         //guardamos el numero actual
            int j = i-1;                                    //numero anterior
            while(j >= 0 && numeros[j] > valor){            //comparamos si algun numero anterior es mayor al actual
                numeros[j+1] = numeros[j];                  //movemos el numero anterior hacia el fondo
                j--;                                        //nos movemos hacia el anterior
            }
             numeros[j+1]= valor;                           //valor lo guardamos en la ultima posicion anterior que sea mayor al acual
        }
    }
    
    
}
