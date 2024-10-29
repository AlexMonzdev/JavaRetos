import java.util.Arrays;

public class E02_Anagrama {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */

    public boolean palabras(String uno, String dos) {
        boolean condition;
        char[] unoOrdenado = uno.toCharArray();
        Arrays.sort(unoOrdenado);
        String palabraUnoOrdenda = new String(unoOrdenado);

        char[] dosOrdendado = dos.toCharArray();
        Arrays.sort(dosOrdendado);
        String palabraDosOrdendada = new String(dosOrdendado);

        if (palabraUnoOrdenda.equals(palabraDosOrdendada)) {
            condition = true;
        } else {
            condition = false;
        }
        return condition;
    }


    // metodo a capon sin utilizar metodos con el Algorimo de la burbuja.
    public void ordenar(String arrayuno, String arraydos) {

        char[] arraycharUno = arrayuno.toCharArray();
        char[] arraycharDos = arraydos.toCharArray();

        for (int i = 0; i < arraycharUno.length - 1; i++) {
            for (int j = 0; j < arraycharUno.length - 1; j++) {
                char temp;
                if (arraycharUno[j] > arraycharUno[j + 1]) {
                    temp = arraycharUno[j];
                    arraycharUno[j] = arraycharUno[j + 1];
                    arraycharUno[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < arraycharDos.length - 1; k++) {
            for (int j = 0; j < arraycharDos.length - 1; j++) {
                char temp;
                if (arraycharDos[j] > arraycharDos[j + 1]) {
                    temp = arraycharDos[j];
                    arraycharDos[j] = arraycharDos[j + 1];
                    arraycharDos[j + 1] = temp;
                }
            }
        }

        if (Arrays.equals(arraycharUno, arraycharDos)) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }


    }
    // Streams
    public boolean isAnagrama(String uno, String dos) {
        char[] a = uno.toLowerCase().toCharArray();
        char[] b = dos.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }


}
