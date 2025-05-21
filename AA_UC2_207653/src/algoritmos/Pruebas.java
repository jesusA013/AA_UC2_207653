/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author Jesus
 */
public class Pruebas {
    public static void main(String[] args) {
        int[] a = {3,6,5,4}; // Arreglo desordenado
        Ordenamientos ado = new Ordenamientos(a);
        ado.mostrar();
        ado.quickSort(a, 0, a.length-1);
        ado.mostrar();
        
    }
}
