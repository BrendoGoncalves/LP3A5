package filosafo;

public class RoteiroGuloso implements IRoteiroJantar {
    public void jantarPensante(Filosofo filosofo) throws InterruptedException {
        filosofo.pensa();
        filosofo.getMesa().pegaGarfosGuloso(filosofo);
        filosofo.come();
        filosofo.devolveGarfos();
    }

}
