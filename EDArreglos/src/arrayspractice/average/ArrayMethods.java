package arrayspractice.average;

import java.util.Arrays;
import java.util.Scanner;

/**
 * En esta clase van los métodos que vamos a usar
 * @author Carlos Jara - Bachiller en Ingeniería de Software UPAO
 */
public class ArrayMethods {
    /**
     * Entonces, aquí vamos a declarar variables y métodos para luego
     * implementarlas en la consola
     */
    // Para la lectura de datos se puede usar Scanner o BufferedReader
    public static Scanner sc = new Scanner(System.in);
    
    /**
     * Este método va a retornar los enteros que iremos introduciento por consola
     * @param number Número de elementos a introducir
     * @return 
     */
    public int[] getIntegers(int number) {
        int[] intArray = new int[number];
        
        for (int i = 0; i < number; i++) {
            System.out.printf("Ingrese valor para n%d: ", i);
            intArray[i] = sc.nextInt();
        }
        
        return intArray;
    }
    
    /**
     * Este método va a imprimir el arreglo
     * @param intArray arreglo de enteros
     */
    public void printArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray)); // Aquí hago uso de la clase Arrays
    }
    
    /**
     * Este método devuelve el promedio de los elementos del arreglo
     * @param intArray arreglo de enteros
     * @return promedio de los elementos del arreglo
     */
    public double getAverage(int[] intArray) {
        int sum = 0;
        
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i]; // sum += es lo mismo que sum = sum +
        }
        
        // Lo que hago aquí es un casteo de int a double (sum e intArray.length)
        return (double) sum / (double) intArray.length; 
    }
}
