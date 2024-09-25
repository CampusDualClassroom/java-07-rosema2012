package com.campusdual.classroom;


import java.util.Arrays;
import java.util.List;

public class Exercise07 {

    private static List<Integer> numeros = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

    public static void main(String[] args) {

        positionInAList(20);
        sumFirstNaturalNumbers(40);
        showFirstNaturalNumbers(60);
    }
    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.

    public static void positionInAList(int num) {
        try{
            System.out.println("El elemento "+numeros.get(num-1)+" se encuentra en la posición: "+num);
        }catch (ArrayIndexOutOfBoundsException aio){
            System.out.println(" no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
            int sumaTotal = 0;
            for (int i = 1; i <= num; i++) {
                sumaTotal += i;
            }
            System.out.println(sumaTotal);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }
    }
}
