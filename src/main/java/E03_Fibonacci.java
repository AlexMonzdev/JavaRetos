public class E03_Fibonacci {

    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public void fibonacci() {
        int suma = 0;

        for (int i = 0; i < 8; i++) {
           suma += i + i-1;
        }
        System.out.println(suma);

    }
}
