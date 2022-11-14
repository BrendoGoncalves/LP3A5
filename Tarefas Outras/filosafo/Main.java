package filosafo;
import javax.swing.*;
import java.util.logging.Logger;

public class Main {

    //usa logging.handler para poder printar no painel
    final static Logger log = Logger.getLogger("logging.handler");


    public static void createAndShowGui(JPanel panel) {
        final JFrame frame = new JFrame("Start Stop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void initialize(AbstractMesa mesa) {
        final ICicloDeVida jantar = new Jantar( mesa );
        final JanelaStartStop panel = new JanelaStartStop(jantar);
        final LogPanelHandler handler = LogPanelHandler.getInstance(panel);
        log.addHandler(handler);
        SwingUtilities.invokeLater(() -> createAndShowGui(panel));

    }

    public static void testeDeadlock() {
        initialize(new Mesa(5));
        log.info("TESTE DEADLOCK");
        log.info("Neste exemplo o filósofo fica com um garfo na mão à "
                + "espera que o segundo garfo libere e ele possa comer. "
                + "Depois de um tempo gera uma situação de deadlock quando "
                + "todos os filósofos ficam aguardando, sem comer ou "
                + "liberar o talher para os demais.");
    }

    public static void main(String[] args) {
        testeDeadlock();
    }
}