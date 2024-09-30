import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente conto = new ContoCorrente("Mario Rossi", 1000);
        ContoOnLine contoOnline = new ContoOnLine("Luigi Bianchi", 500, 200);

        // Chiediamo all'utente di prelevare dal conto
        try {
            System.out.println("Effettua un prelievo dal conto di Mario Rossi:");
            double importo = scanner.nextDouble();
            conto.preleva(importo);
            conto.stampaSaldo();

            System.out.println("Effettua un prelievo dal conto online di Luigi Bianchi:");
            double importoOnline = scanner.nextDouble();
            contoOnline.preleva(importoOnline);
            contoOnline.stampaSaldo();

        } catch (BancaException e) {
            // Gestiamo l'eccezione di prelievo
            System.out.println(e.getMessage());
        }
    }
}
