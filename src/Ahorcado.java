import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Declaraciones y Asignaciones:
        String palabraSecreta = "programacion";
        int intentosMaximos = 6;
        int intentosActuales = 0;
        boolean esAdivinada = false;
        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
        System.out.println("Bienvenido al juego del Ahorcado!");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinar la palabra secreta.");
        
        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i] + " ");
        }

        // Estructura de control: Iterativa (Bucle)

        while(!esAdivinada && intentosActuales < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra, por favor.");
            char letraIngresada = scanner.next().charAt(0);
        }


    }
}
