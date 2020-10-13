package ejercicios;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        int x,y,promedio;
        x = leerMostrar("x:");
        y = leerMostrar("y:");
        int[][] numeros= new int[x][y];
        ingresarNumeros(numeros);
        promedio = promedio(numeros);
        System.out.println("promedio:"+promedio);
        busqueda(numeros, promedio);
    }

    
    public static void ingresarNumeros(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = leerMostrar("array"+"["+i+"]"+"["+j+"]:");
            }
        }
    }
    public static int promedio(int[][] numeros) {
        int promedio = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                promedio += numeros[i][j];
            }
        }
        return promedio/(numeros.length*numeros[0].length);
    }

    public static void busqueda(int[][] numeros, int numero) {
        int encontrdos = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                if(numero == numeros[i][j]){
                    System.out.println("encontrado: posicion["+i+"]["+j+"]");
                    encontrdos ++;
                }
            }
        }
        if(encontrdos == 0){
            System.out.println("no se ha encontrado ningun promedio");
        }
    }
    public static int leerMostrar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}
