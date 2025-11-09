
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        // Definimos la palabra que el jugador debe adivinar
        String palabraSecreta = "JAMES";

        // Establecemos el número máximo de intentos permitidos
        int intentosMaximos = 10;

        // Contador de intentos fallidos realizados
        int intentos = 0;

        // Bandera para saber si la palabra ha sido completamente adivinada
        boolean palabraAdivinada = false;

        // Array que almacena las letras adivinadas correctamente (inicialmente con
        // guiones bajos)
        // Array que almacena las letras adivinadas correctamente (inicialmente con
        // guiones bajos)
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Inicializamos el array con guiones bajos para representar letras no
        // adivinadas
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Bucle principal del juego: continúa mientras no se adivine la palabra y haya
        // intentos restantes
        while (!palabraAdivinada && intentos < intentosMaximos) {
            // Mostramos el estado actual de la palabra (letras adivinadas y guiones bajos)
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

            // Solicitamos al usuario que introduzca una letra
            System.out.println("Introduce una letra: ");
            char letra = Character.toUpperCase(sc.next().charAt(0));

            // Bandera para verificar si la letra introducida está en la palabra secreta
            boolean letraCorrecta = false;

            // Recorremos cada letra de la palabra secreta
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Si la letra coincide con la posición actual de la palabra secreta
                if (palabraSecreta.charAt(i) == letra) {
                    // Revelamos la letra en el array de letras adivinadas
                    letrasAdivinadas[i] = letra;
                    // Marcamos que la letra es correcta
                    letraCorrecta = true;
                }
            }

            // Si la letra no está en la palabra secreta
            if (!letraCorrecta) {
                // Incrementamos el contador de intentos fallidos
                intentos++;
                // Informamos al usuario que la letra es incorrecta y cuántos intentos le quedan
                System.out.println("!Letra incorrecta, le quedan: " + (intentosMaximos - intentos) + " intentos.");
            }

            // Verificamos si la palabra ha sido completamente adivinada
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                // Marcamos que la palabra fue adivinada
                palabraAdivinada = true;
                // Mostramos mensaje de felicitación al jugador
                System.out.println("!Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        // Si el jugador agotó todos los intentos sin adivinar la palabra
        if (!palabraAdivinada) {
            System.out.println("!Que pena te has quedado sin intentos!");
        }
        sc.close();
    }
}
