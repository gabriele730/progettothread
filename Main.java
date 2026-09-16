// Modificato in 'Main' con la lettera maiuscola
public class Main {
    public static void main(String[] args) {
        // 1. Istanzia due oggetti di tipo corridore
        Corridore corridoreA = new Corridore("Corridore A");
        Corridore corridoreB = new Corridore("Corridore B");

        System.out.println("--- La gara sta per iniziare! ---");

        // 2. Avvia entrambi i thread in parallelo
        corridoreA.start();
        corridoreB.start();

        // 3. Il main attende che entrambi i thread finiscano l'esecuzione
        try {
            corridoreA.join();
            corridoreB.join();
        } catch (InterruptedException e) {
            System.out.println("Il thread principale è stato interrotto.");
        }

        // 4. Frase finale stampata solo dopo il completamento di entrambi i thread
        System.out.println("--- Gara terminata! ---");
    }
}
