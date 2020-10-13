package algoritmos.busqueda;

import java.util.Scanner;
import funcionesConArray.FuncionesArray;
public class BusquedaSecuencial {
    public static void main(String[] args) {
        int[] numeros = {1,4,7,3,0,10,6,11,15,18,12,19,20};
        int num = leerMostrar("numero:");
        int lugarDondeSeEncontro = busqSecuencial(numeros, num);
        if(lugarDondeSeEncontro != -1){
            System.out.println("busquedaLugar:"+lugarDondeSeEncontro);
        }
    } 

    public static int busqSecuencial(int[] numeros, int numero){
        for (int i = 0; i < numeros.length; i++) {
            if(numero == numeros[i]){
                return i;
            }
        }
        return -1;
    }

    public static int leerMostrar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}
