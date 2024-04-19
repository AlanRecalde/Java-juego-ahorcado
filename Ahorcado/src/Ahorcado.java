import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase Scanner que nos permite que el usuario escriba 
        Scanner scanner = new Scanner(System.in);
        //Declaraciones y asignaciones 
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean estaAdivinada = false;

        //Arreglos

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control: iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!estaAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");

            System.out.println("Introduce una letra, por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta, te quedan " + (intentosMaximos - intentos) + " intentos.");
            }    

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                estaAdivinada = true;
                System.out.println("¡Felicidades! Adivinaste la palabra secreta. La palabra secreta era: " + palabraSecreta);
            }
                
        
             
        }
        if(!estaAdivinada){
            System.out.println("¡Que pena! Te has quedado sin intentos. Game Over");
        }
        
        scanner.close();

    }
}
