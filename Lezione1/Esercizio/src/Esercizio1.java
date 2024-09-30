import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        // Inizializziamo l'array
        int[] array = new int[5];
        Random random = new Random();

        // Popoliamo l'array con numeri casuali tra 1 e 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1; // Genera numeri tra 1 e 10
        }

        // Mostriamo l'array all'utente
        System.out.println("Array iniziale:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Chiediamo la posizione e il numero da inserire
                System.out.println("Inserisci la posizione (0-4) dove vuoi inserire il numero (o 0 per uscire): ");
                int posizione = scanner.nextInt();
                if (posizione == 0) {
                    break;  // Esci se l'utente inserisce 0
                }

                System.out.println("Inserisci il numero da inserire nella posizione " + posizione + ": ");
                int numero = scanner.nextInt();

                // Proviamo a inserire il numero nell'array
                array[posizione] = numero;

                // Mostriamo il nuovo stato dell'array
                System.out.println("Nuovo stato dell'array:");
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: posizione non valida. Riprovare.");
            }
        }
    }
}
