public class Corridore extends Thread {
    
    // Attributo rinominato semplicemente in 'nome'
    private String nome;

    // Costruttore aggiornato
    public Corridore(String nome) {
        this.nome = nome;
    }

    // Sovrascrittura del metodo run()
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Utilizzo del nuovo attributo 'nome'
            System.out.println(nome + " ha fatto il passo " + i);
            
            try {
                // Pausa casuale tra 200 e 800 millisecondi
                long pausa = (long) (Math.random() * (800 - 200) + 200);
                Thread.sleep(pausa);
                
            } catch (InterruptedException e) {
                System.out.println(nome + " è stato interrotto durante la corsa!");
                return;
            }
        }
        System.out.println("🏁 " + nome + " ha tagliato il traguardo!");
    }
}
