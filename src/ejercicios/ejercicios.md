# Algoritmos de ordenamiento y busqueda
==
## Algoritmo ordenamiento
### Ordenamiento por Inserción
 Se recorre un array empesando desde el sugundo espacio (pensando que el primero es el menor) luego a este lo comparamos con el anterior si es asi a los anteriores   los corremos hacia el fondo quedandonos el actual en la posicion que pertenece. Este proceso se repite con cada casillero del array.

    `
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
    `

### Ordenamiento por burbuja
 se recorre el array por pareja(a,b) cambiando de lugares si el a es mayor que b se permutan. Cuando un cambio sucede se lo recorre nuevamente al array. asi hasta finalizar( que no se efectue ningun otro cambio).

    `
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

    `

### Ordenamiento por Seleccion
se agarra al menor empezando desde el csillero 0 y se encuentra al menor menor comparando con los siguientes casilleros una ves encontrado se permuta con el primero. luego se empieza con el siguiente casillero y se repite la operacion.

    `
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
    `

### Ordenamiento por quick-sort


## Algoritmo busqueda 

### Búsqueda secuencial 
 Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde un  elemento  al  siguiente,  comenzando  en  la  primera posición  de  la  lista  y  se detiene cuando encuentra el elemento buscado o bien se alcanza el final de la lista sin haberlo encontrado. 

    `
    public static boolean busqSecuencial(int[] numeros, int numero){
        for (int i = 0; i < numeros.length; i++) {
            if(numero == numeros[i]){
                return true;
            }
        }
        return false; //si no encontro ninguna coincidencia
    }
    `

### Búsqueda binaria
(teniendo en cuenta que se encuentra ordenado) se divide en dos segmentos al array y se buscara el valor ingresado en una o en otra dependiendo si el valor medio(numero tomado para dividir en dos partes el array) es mayor o menor a este. Una ves seleccionado la mitad se procede a lo mismo se lo divide en dos partes a este. Así sucesivamente hasta encontrar el numero.



## Aloritmo de Recorrido
### recorrido de profundidad
 En el recorrido en profundidad, el proceso exige un camino desde el nodo raıź a través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a 
 un  segundo  hijo.
 
### recorrido de anchura
 En el recorrido en anchura, el proceso se realiza horizontalmente desde el raıź a todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta que  todos  los  nodos  han  sido  procesados. 
