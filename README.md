# Estructura de Datos
Bienvenidos. Este pequeño espacio es para los que deseen reforzar sus clases de estructura de datos.

## Arreglos
Empecemos. :raised_hands:

¿Qué es un arreglo?

Bueno en términos simples y para no aburrirlos:

![image](https://upload.wikimedia.org/wikipedia/commons/0/01/Array_of_array_storage.svg)

Son cajas, en donde se almacena información. Básicamente estas cajas están destinados para un solo tipo de dato u objeto, dichas cajas tienen una longitud que no es variable, dichas cajas ocupan un espacio fijo en memoria. Ejemplo:

```java
int[] arr1 = new int[3];
double[] arr2 = new double[5];
String[] arr3 = new String[10];
```

Como pueden observar, el arreglo ```arr1``` es del tipo de dato int, es decir, solo puede albergar enteros. Esto quiere decir que no se puede introducir un ```double``` ni tampoco se puede cambiar el tipo de dato una vez *instanciado*. De igual forma con los otros arreglos, ```arr2``` es para ```double``` solamente y ```arr3```, para ```String```. Con *instanciado* me refiero a que se utiliza ```new``` para darle vida esta estructura.

**OJO** esta es solamente una estructura de datos, no es una clase propiamente dicha, solo es una estructura donde se almacenan datos ya que no se puede heredar ni sobreescribir sus métodos ni su único atributo: ```length```.

Otra cosa muy importante sobre los arreglos, es que se puede acceder a sus elementos

- Profe, ¿Y cómo?
- Pues muy sencillo

De la siguiente manera:

1. Primero que nada, todo arreglo tiene un número de elementos, ya vimos que cuando *instanciamos* el arreglo, ponemos un número ¿Cierto?. Bueno, ese es el número de elementos que puede contener.
2. Segundo, todo arreglo tiene un índice, por el cuál podemos acceder a los elementos, como si fuera un número de orden de la primaria y secundaria.
3. Tercero, el índice siempre va a ser menos que la longitud, es decir si yo quiero acceder al último elemento de un arreglo que tiene 100 de longitud, pues el índice será 99. De igual forma si quiero acceder al primero, entonces el índice será 0.

Pues bien, dicho esto, proseguimos a acceder al elemento:

```java
int[] ejemplo = {1, 3, 5}; // Este es un arreglo estático
// No se pone la longitud porque se sobreentiende y como mencioné antes, la longitud no varía

// Entonces para acceder al arreglo, solo basta saber qué elemento quiero, contar en qué posición está y restar 1 para saber el índice
int elem = ejemplo[1]; // Y para este caso escojo el segundo elemento, posición = 2 => indice = 1
```

Otro tópico que hay que revisar es el acceso a todos los elementos:
Si yo tengo un objeto de la clase Persona y quiero guardar 5 personas en un arreglo para luego imprimir sus nombres se haría de la siguiente manera:

```java
for(i = 0; i < arr.length; i++) {
  System.out.println("Persona %d: " + arr[i].Nombre, i + 1);
}
```

En el proyecto podrán encontrar más ejemplos.

Atte. Carlos Jara.
