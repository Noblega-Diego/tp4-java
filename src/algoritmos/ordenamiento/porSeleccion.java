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
public class porSeleccion {
    
    public static void main(String[] args) {
        int[] numeros = new int[5];
        FuncionesArray.llenarArray(numeros);
        FuncionesArray.mostrarArray(numeros);
        Seleccion(numeros);
        FuncionesArray.mostrarArray(numeros);
    }
    
    public static void Seleccion(int[] numeros){
        int longitud = numeros.length;
        boolean intercambio;
        for(int i = 0; i < longitud; i++){
            int minimo = i;                             //almacenamos el lugar del primer numero del array
            for(int j = i+1;  j< longitud; j++){        //recorremos el array empezando desde el numero siguiente del actual
                if(numeros[j] < numeros[minimo]){       //si encontramos un numero menor al al actual
                    minimo = j;                         //guardamos la posicion de este
                }
            }
            //una ves encontrado al minimo permutamos
            FuncionesArray.permutar(numeros, i, minimo);
        }
   }
}
