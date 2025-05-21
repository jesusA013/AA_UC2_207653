/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 * Clase que contiene todos los algoritmos de ordenamientos
 *
 * @author Jesus Amarillas 207653
 */
public class Ordenamientos {

    //Declaracion de arreglo que se utilizara para los metods
    private int[] a;

    /**
     * Metodo Constructor que inicializa el arreglo anteriormente declarado
     *
     * @param arr
     */
    public Ordenamientos(int[] arr) {
        this.a = arr;
    }

    /**
     * Metodo que utiliza el algoritmo de ordenamiento de burbuja
     */
    public void metodoBurbuja(int[] a) {

        for (int i = 0; i < a.length - 1; i++) { // asignacion: 1,comparacion: n-1, incremento: n-1 

            for (int j = 0; j < a.length - 1 - i; j++) { //asignacion: 1, comparacion: n-1-i, incr =n-2

                if (a[j] > a[j + 1]) {//  1 comparacion
                    //3 asignaciones
                    int aux = a[j];  //1 asignacion
                    a[j] = a[j + 1]; //1 asignacion
                    a[j + 1] = aux; //1 asignacion
                }
            }
        }
    } // n^2 +n +4

    /**
     * Metodo donde se aplica el algoritmo de insercion
     */
    public void insercion(int[] a) {
        //Recorremos desde el segundo elemento
        for (int i = 1; i < a.length; i++) {
            //Elemento que se quiere insertar en su posicion correcta
            int key = a[i]; // 1 Asigncaion
            int j = i - 1; // 1 Asignacion

            //Ciclo para mover elementos mayores a la derecha
            while (j >= 0 && a[j] > key) {
                //Desplazamiento
                a[j + 1] = a[j]; //1 asignacion
                j--; // 1 decremento

            }
            //Insercion del elemento en su lugar correcto
            a[j + 1] = key; //1 asignacion

        }
    } // Total de operaciones = n^2 +5  orden de crecimiento = 0(n^2)

    public static void seleccion(int[] a) {
        int n = a.length; //1 asignacion
        for (int i = 0; i < n - 1; i++) { // (n-1) iteraciones
            int indiceMinimo = 1;//1 asignacion por iteracion = (n-1) asignaciones

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[indiceMinimo]) { // 1 comparacion
                    indiceMinimo = j; // Actualizar el índice del mínimo
                }

            }

            int temp = a[i]; //1 asignacion
            a[i] = a[indiceMinimo]; //1 asignacion
            a[indiceMinimo] = temp; //1 asignacion

        }
    } // Orden de crecimiento : 0(n^2)
    
    
    

    /**
     * Metodo donde se aplica el algoritmo quicksort
     *
     * @param a
     * @param inicio
     * @param fin
     */
    public static void quickSort(int a[], int inicio, int fin) {

        if (inicio < fin) { // n comparaciones

            int pivote = particionar(a, inicio, fin); //1 llamada recursiva + 1 asignacion

            quickSort(a, inicio, pivote - 1); //1 llamada recursiva

            quickSort(a, pivote + 1, fin); //1 llamada recursiva
        }
    } // Total operaciones = n+4       orden de crecimiento = O(n)

    public static int particionar(int a[], int inicio, int fin) {

        int pivote = a[fin]; //1 asignacion
        int i = inicio - 1;  // 1 asignacion
        for (int actual = inicio; actual < fin; actual++) {
            if (a[actual] <= pivote) { // 1 comparacion por iteracion 1*n = n 
                i++; // 1 incremento

                if (i != actual) {  // 1 comparacion
                    intercambiar(a, i, actual); //1 llamada al metodo
                }
            }
        }

        intercambiar(a, i + 1, fin); // 1 llamada final
        return i + 1; // 1 retorno
    }  // Total de operaciones: n+5 Orden de crecimiento = 0(n)

    /**
     * Segundo Metodo auxiliar para el algoritmo quickSort
     *
     */
    private static void intercambiar(int[] a, int i, int j) {
        int temp = a[i]; //1 asignacion
        a[i] = a[j];  // 1 asignacion 
        a[j] = temp; // 1 asignacion

    }
    // total de Operaciones : 3  orden de Crecimiento O(n^2)

    /**
     * Metodo para mostrar el arreglo en las pruebas
     */
    public void mostar() {

    }

    public void mostrar() {
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("[ " + a[i] + " ]");
        }
    }
}
