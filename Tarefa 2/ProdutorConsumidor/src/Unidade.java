public class Unidade {
    private int conteudo;
    private boolean disponivel = false;
    public synchronized int captura() {
        while (disponivel == false) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        disponivel = false;
        notifyAll();
        return conteudo;
    }
    public synchronized void disponibiliza(int value) {
        while (disponivel == true) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        conteudo = value;
        disponivel = true;
        notifyAll();
    }
}
