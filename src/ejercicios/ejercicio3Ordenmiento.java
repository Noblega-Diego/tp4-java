package ejercicios;

import java.text.BreakIterator;

import funcionesConArray.FuncionesArray;
import java.util.Scanner;
public class ejercicio3Ordenmiento {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        FuncionesArray.llenarArray(numeros);
        String orden = leerMostrar("orden <ASC> <DESC>"+"\n"+"orden:");
        menu(numeros, orden);
        FuncionesArray.mostrarArray(numeros);
    }
    public static void menu(int[] numeros,String orden) {
        System.out.println( "a- Burbuja"+ "\n"+
                            "b- Insercion"+ "\n"+
                            "c- Seleccion"+ "\n");
        char tipo = leerMostrar("N° algoritmo:").charAt(0);
        switch(tipo){
            case 'a':
                ejercicio2burbuja.burbuja(numeros, orden);
            break;
            case 'b':
                ejercicio2insercion.insercion(numeros, orden);
            break;
            case 'c':
                ejercicio2seleccion.seleccion(numeros, orden);
            break;
            default:
            System.out.print("ingrese una letra correcta");
            menu(numeros, orden);
        }
    }
    public static String leerMostrar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
