import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Chiediamo i km percorsi
            System.out.print("Inserisci il numero di km percorsi: ");
            double km = scanner.nextDouble();

            // Chiediamo i litri di carburante consumati
            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            // Verifichiamo che i litri non siano 0
            if (litri == 0) {
                throw new ArithmeticException("Errore: Divisione per zero. I litri non possono essere 0.");
            }

            // Calcoliamo i km/litro
            double kmPerLitro = km / litri;
            System.out.println("Hai percorso " + kmPerLitro + " km per litro di carburante.");

        } catch (ArithmeticException e) {
            // Gestione dell'errore di divisione per zero
            System.out.println(e.getMessage());
        }
    }
}
