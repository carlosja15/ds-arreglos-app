package arraysexamples;

/**
 * Ejemplo en método main para acceso a arreglos
 * @author Carlos Jara - Bachiller en Ingeniería de Software UPAO
 */
public class ArraysExamples {
    public static void main(String[] args) {
        // Pues bien, tenemos 3 formas de instanciar un arreglo
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // De manera estática
        int[] arr2 = new int[10]; // Instanciando en linea
        int[] arr3;
        arr3 = new int[10]; // Instanciando desde un arreglo declarado anteriormente
        
        // Para añadir elementos a un arreglo:
        arr2[0] = 120; // Directamente señalando con el índice la posición
        
        for (int i = 0; i < arr3.length; i++) { // Recorriendo el arreglo
            arr3[i] = i + 1;
        }
        
        // También se pueden modificar los espacios:
        System.out.printf("Valor inicial: %d%n", arr1[0]); // El antes
        arr1[0] = 50; // En este caso se cambiará el valor "1" por "50"
        System.out.printf("Valor inicial: %d%n", arr1[0]); // El después
        
        for (int i = 0; i < arr3.length; i++) { // Ahora se cambiarán por numeros negativos
            arr3[i] = i - 1;
        }
        
        // Para "eliminar" el valor, simplemente debe asignarse null al valor
        // En el caso de los arreglos de enteros, se debe poner 0 (cero)
        // Para los arreglos double, se pone 0.0
        // Para booleanos, false
        // Para floats, 0.0f
        // Dado que String es una clase en Java, se le puede asignar null, ya que
        // la cadena vacía ("") es un valor para String, no se toma como nulo
        arr2[0] = 0;
    }
}
