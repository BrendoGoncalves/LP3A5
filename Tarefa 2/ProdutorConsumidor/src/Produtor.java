public class Produtor extends Thread{
    private Unidade elemento;
    private int numero;

    public Produtor(Unidade u, int numero) {
        elemento = u;
        this.numero = numero;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            elemento.disponibiliza(i);
            System.out.println(" Coloca: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}
