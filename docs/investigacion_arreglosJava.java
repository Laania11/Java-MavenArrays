package segundoMayoryMenor;

	/*
	 * INVESTIGACIÓN: ARREGLOS EN JAVA
	 * 
	 * Tema 4: Arreglos, métodos de Arrays, recorridos y comparación con ArrayList.
	 * 
	 * Esta clase contiene TODOS los ejemplos solicitados,
	 * organizados y comentados para su correcta comprensión.
	 */

	// Importamos las clases necesarias
	import java.util.Arrays;      // Clase que contiene métodos útiles para arreglos
	import java.util.ArrayList;   // Clase para listas dinámicas

	public class investigacion_arreglosJava {

	    public static void main(String[] args) {

	        // =========================================================
	        // 4.1 ¿CÓMO SE DECLARA UN ARREGLO EN JAVA?
	        // =========================================================
	        
	        System.out.println("===== 4.1 DECLARACIÓN DE ARREGLOS =====");
	        
	        // Forma 1: Declaración con tamaño definido
	        int[] numeros = new int[5]; // Se crea un arreglo de 5 posiciones
	        
	        // Asignamos valores manualmente (los índices empiezan en 0)
	        numeros[0] = 10;
	        numeros[1] = 20;
	        numeros[2] = 30;
	        numeros[3] = 40;
	        numeros[4] = 50;
	        
	        System.out.println("Primer elemento del arreglo numeros: " + numeros[0]);
	        System.out.println("Tamaño del arreglo numeros: " + numeros.length);

	        
	        // Forma 2: Declaración e inicialización directa
	        int[] valores = {5, 2, 8, 1, 3}; // Java asigna automáticamente el tamaño
	        
	        System.out.println("Arreglo valores original: " + Arrays.toString(valores));
	        
	        
	        // =========================================================
	        // 4.2 MÉTODOS PRINCIPALES DE Arrays
	        // =========================================================
	        
	        System.out.println("\n===== 4.2 MÉTODOS DE ARRAYS =====");
	        
	        // 1. Arrays.sort() -> Ordena el arreglo de menor a mayor
	        Arrays.sort(valores);
	        System.out.println("Arreglo ordenado con sort(): " + Arrays.toString(valores));
	        
	        
	        // 2. Arrays.binarySearch() -> Busca un elemento (requiere arreglo ordenado)
	        int posicion = Arrays.binarySearch(valores, 3);
	        System.out.println("Posición del número 3 usando binarySearch(): " + posicion);
	        
	        
	        // 3. Arrays.copyOf() -> Crea una copia del arreglo
	        int[] copia = Arrays.copyOf(valores, valores.length);
	        System.out.println("Copia del arreglo con copyOf(): " + Arrays.toString(copia));
	        
	        
	        // 4. Arrays.fill() -> Llena el arreglo con un valor específico
	        int[] arregloRelleno = new int[4];
	        Arrays.fill(arregloRelleno, 7);
	        System.out.println("Arreglo después de fill(): " + Arrays.toString(arregloRelleno));
	        
	        
	        // 5. Arrays.equals() -> Compara dos arreglos
	        boolean sonIguales = Arrays.equals(valores, copia);
	        System.out.println("¿valores y copia son iguales?: " + sonIguales);
	        
	        
	        // 6. Arrays.toString() -> Convierte el arreglo a texto (ya usado arriba)
	        System.out.println("Uso directo de toString(): " + Arrays.toString(valores));
	        
	        
	        // 7. Arrays.stream() -> Permite trabajar con programación funcional
	        System.out.println("Recorrido con stream():");
	        Arrays.stream(valores).forEach(n -> System.out.println(n));
	        
	        
	        // =========================================================
	        // 4.3 FORMAS DE RECORRER UN ARREGLO
	        // =========================================================
	        
	        System.out.println("\n===== 4.3 RECORRIDO DE ARREGLOS =====");
	        
	        // 1. For tradicional (usando índices)
	        System.out.println("Recorrido con for tradicional:");
	        for (int i = 0; i < valores.length; i++) {
	            System.out.println("Índice " + i + ": " + valores[i]);
	        }
	        
	        
	        // 2. For-each (for mejorado)
	        System.out.println("\nRecorrido con for-each:");
	        for (int numero : valores) {
	            System.out.println(numero);
	        }
	        
	        
	        // 3. Stream
	        System.out.println("\nRecorrido con stream:");
	        Arrays.stream(valores).forEach(System.out::println);
	        
	        
	        // =========================================================
	        // 4.4 DIFERENCIAS ENTRE ARREGLOS Y ArrayList
	        // =========================================================
	        
	        System.out.println("\n===== 4.4 ARREGLOS vs ARRAYLIST =====");
	        
	        // Arreglo (tamaño fijo)
	        int[] arregloFijo = new int[3]; // No puede cambiar su tamaño
	        
	        // ArrayList (tamaño dinámico)
	        ArrayList<Integer> lista = new ArrayList<>();
	        
	        // add() -> Agrega elementos
	        lista.add(10);
	        lista.add(20);
	        lista.add(30);
	        
	        System.out.println("ArrayList después de add(): " + lista);
	        
	        // remove() -> Elimina un elemento
	        lista.remove(Integer.valueOf(20));
	        System.out.println("ArrayList después de remove(): " + lista);
	        
	        // size() -> Devuelve el tamaño actual
	        System.out.println("Tamaño actual del ArrayList: " + lista.size());
	        
	        
	        /*
	         * DIFERENCIAS IMPORTANTES:
	         * 
	         * 1. Tamaño:
	         *    - Arreglos: tamaño fijo.
	         *    - ArrayList: tamaño dinámico.
	         * 
	         * 2. Tipos:
	         *    - Arreglos: pueden usar tipos primitivos (int, double, etc).
	         *    - ArrayList: usa clases envolventes (Integer, Double).
	         * 
	         * 3. Métodos:
	         *    - Arreglos: usan .length
	         *    - ArrayList: usan add(), remove(), size()
	         * 
	         * 4. Rendimiento:
	         *    - Arreglos: más rápidos y consumen menos memoria.
	         *    - ArrayList: más flexibles pero ligeramente más lentos.
	         * 
	         * ¿Cuándo usar cada uno?
	         *    - Usa arreglos cuando el tamaño es fijo y necesitas mayor rendimiento.
	         *    - Usa ArrayList cuando el tamaño puede cambiar dinámicamente.
	         */
	        
	        System.out.println("\n===== FIN DE LA INVESTIGACIÓN =====");
	    }
	}


