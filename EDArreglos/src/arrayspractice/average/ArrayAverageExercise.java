package arrayspractice.average;

import java.util.Scanner;

/**
 * Ejercicio de promedio de un arreglo de enteros
 * @author Carlos Jara - Bachiller en Ingeniería de Software UPAO
 */
public class ArrayAverageExercise {
    /**
     * Veamos, es hora de añadir Programación Orientada a Objetos al tema de
     * arreglos, por lo tanto, con ello crearemos una clase de la cual podremos
     * saber cuál es el promedio de un arreglo de números enteros
     */
    
    // Para la lectura de datos se puede usar Scanner o BufferedReader
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Empecemos por declarar las variables que vamos a usar
        int cantNumeros;
        int[] intArray;
        ArrayMethods arrayMethods;
        
        /**
         * Hay que pedirle al usuario la cantidad de números de los cuales
         * desea que se le halle el promedio
         */
        System.out.print("Ingrese la cantidad de números a sacar el promedio: ");
        // Leamos el dato
        cantNumeros = sc.nextInt();
        // Instanciemos el objeto
        arrayMethods = new ArrayMethods();
        // Ahora obtengamos los números que van a estar en el arreglo
        intArray = arrayMethods.getIntegers(cantNumeros);
        // Luego imprimimos el arreglo completo
        arrayMethods.printArray(intArray);
        // Y finalmente imprimimos el promedio
        System.out.println("El promedio de los elementos del arreglo es: " + arrayMethods.getAverage(intArray));
    }
}
