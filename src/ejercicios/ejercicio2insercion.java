package ejercicios;

import funcionesConArray.FuncionesArray;
import java.util.Scanner;
public class ejercicio2insercion {


    public static void main(String[] args) {
        int[] numeros = new int[5];
        FuncionesArray.llenarArray(numeros);
        FuncionesArray.mostrarArray(numeros);
        String orden = leerMostrar("tipo de orden:");
        insercion(numeros,orden);
        FuncionesArray.mostrarArray(numeros);
    }
    /**
     * 
     * @param numeros
     * @param tipo ASC DESC
     */
    public static void insercion(int[] numeros,String tipo){
        for(int i = 1; i<numeros.length; i++){              //recorremos el array empesando de 1(n+1)
            int valor = numeros[i];                         //guardamos el numero actual
            int j = i-1;                                    //numero anterior
            if(tipo.equals("ASC")){
                while(j >= 0 && numeros[j] > valor){            //comparamos si algun numero anterior es mayor al actual
                    numeros[j+1] = numeros[j];                  //movemos el numero anterior hacia el fondo
                    j--;                                        //nos movemos hacia el anterior
                }
                numeros[j+1]= valor;                           //valor lo guardamos en la ultima posicion anterior que sea mayor al acual
            }else if(tipo.equals("DESC")){
                while(j >= 0 && numeros[j] < valor){            //comparamos si algun numero anterior es mayor al actual
                    numeros[j+1] = numeros[j];                  //movemos el numero anterior hacia el fondo
                    j--;                                        //nos movemos hacia el anterior
                }
                numeros[j+1]= valor;                            //valor lo guardamos en la ultima posicion anterior que sea mayor al acual
            }
            
        }
   }

    public static String leerMostrar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
