package ejercicios;

import funcionesConArray.FuncionesArray;
import java.util.Scanner;
public class ejercicio2burbuja {


    public static void main(String[] args) {
        int[] numeros = new int[5];
        FuncionesArray.llenarArray(numeros);
        FuncionesArray.mostrarArray(numeros);
        String orden = leerMostrar("tipo de orden:");
        burbuja(numeros,orden);
        FuncionesArray.mostrarArray(numeros);
    }
    /**
     * 
     * @param numeros
     * @param tipo ASC DESC
     */
    public static void burbuja(int[] numeros,String tipo){
        int longitud = numeros.length;
        boolean intercambio;
        do{
            intercambio = false;                    //lo iniciamos en false
            for(int i = 1; i < longitud; i++){
                if(tipo.equals("ASC")){
                    if(numeros[i-1] > numeros[i]){      //Si el numero anterior es mayor
                        FuncionesArray.permutar(numeros, i-1, i);
                        intercambio = true;             //ha cambiado el orden
                    }
                }else if(tipo.equals("DESC")){
                    if(numeros[i-1] < numeros[i]){      //Si el numero anterior es mayor
                        FuncionesArray.permutar(numeros, i-1, i);
                        intercambio = true;             //ha cambiado el orden
                    }
                }
                
            }
        }while(intercambio == true);                //comprovaamos si el orden ha sido modificado el array
         
   }

    public static String leerMostrar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
