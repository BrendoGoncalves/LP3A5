package filosafo;

public class Mesa extends AbstractMesa {

    public Mesa(int qtdFilosofos) {
        super(qtdFilosofos, new RoteiroGuloso());
    }
    public void pegaGarfosGuloso(Filosofo filosofo) throws InterruptedException {
        int qtdGarfos = 0;

        while( qtdGarfos < 2) {
            while ( !pegaUmGarfo(filosofo) ) {

                System.out.println(filosofo.getIdFilosofo() + " está aguardando por um garfo..");
                log.fine( this.getMsgGarfos() );
                filosofo.aguarda();
            }
            qtdGarfos++;
            log.fine(filosofo.getIdFilosofo() + " está com " + qtdGarfos + " garfos.");
        }
    }

    private boolean pegaUmGarfo(Filosofo filosofo) {
        final Garfo garfoEsquerdo = escolheGarfoEsquerdo(filosofo);
        if ( garfoEsquerdo.isDisponivel() ) {
            return garfoEsquerdo.pegar(filosofo);
        }

        final Garfo garfoDireito = escolheGarfoDireito(filosofo);
        if ( garfoDireito.isDisponivel() ) {
            return garfoDireito.pegar(filosofo);
        }

        return false;
    }

    public void devolveGarfos(Filosofo filosofo) {
        escolheGarfoEsquerdo(filosofo).devolver();
        escolheGarfoDireito(filosofo).devolver();
        log.fine( this.getMsgGarfos() );
    }

    @Override
    public boolean pegaGarfosComplacente(Filosofo filosofo) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
}