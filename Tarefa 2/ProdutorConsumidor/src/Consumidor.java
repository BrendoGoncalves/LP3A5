public class Consumidor extends Thread{
    private Unidade elemento;
    private int numero;
    public Consumidor(Unidade u, int numero) {
        elemento = u;
        this.numero = numero;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = elemento.captura();
            System.out.println(" Pega: " + value);
        }
    }
}
