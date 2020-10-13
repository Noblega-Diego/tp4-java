/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesConArray;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class FuncionesArray {
    public static void mostrarArray(int[] numeros){         //mostrar array
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + ",");
        }
        System.out.print("\n");
    }
    
    public static void llenarArray(int[] numeros){
        Scanner scanner = new Scanner(System.in);
        int longitud = numeros.length;
        for(int i = 0; i< longitud; i++){
            System.out.println("array["+i+"]:");
            numeros[i] = scanner.nextInt();
        }
    }
    
    public static void llenarArray(String[] strings){
        Scanner scanner = new Scanner(System.in);
        int longitud = strings.length;
        for(int i = 0; i< longitud; i++){
            System.out.println("array["+i+"]:");
            strings[i] = scanner.nextLine();
        }
    }

    public static void permutar(int[] numeros, int a, int b){
        int buffer = numeros[a];                            //guardamos el valor de a
        numeros[a] = numeros[b];                            //b se guarda en el lugar de a
        numeros[b] = buffer;                                //el valor de a se guarda en b
    }
}
