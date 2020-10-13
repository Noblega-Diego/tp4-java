package ejercicios;

import funcionesConArray.FuncionesArray;
import java.util.Scanner;
public class ejercicio2seleccion {


    public static void main(String[] args) {
        int[] numeros = new int[5];
        FuncionesArray.llenarArray(numeros);
        FuncionesArray.mostrarArray(numeros);
        String orden = leerMostrar("tipo de orden:");
        seleccion(numeros,orden);
        FuncionesArray.mostrarArray(numeros);
    }
    /**
     * 
     * @param numeros
     * @param tipo ASC DESC
     */
    public static void seleccion(int[] numeros,String tipo){
        int longitud = numeros.length;
        boolean intercambio;
        for(int i = 0; i < longitud; i++){
            int a = i;                             //almacenamos el lugar del primer numero del array

            for(int j = i+1;  j< longitud; j++){        //recorremos el array empezando desde el numero siguiente del actual
                if(tipo.equals("ASC")){
                    if(numeros[j] < numeros[a]) a = j; 
                }else if(tipo.equals("DESC")){
                    if(numeros[j] > numeros[a]) a = j; 
                }
            }
            //una ves encontrado al a permutamosii
            if(i != a) FuncionesArray.permutar(numeros, i, a);
        }
   }

    public static String leerMostrar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
