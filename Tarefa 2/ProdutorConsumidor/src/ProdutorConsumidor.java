/* Fonte de Pesquisa: http://www.w3big.com/pt/html/thread-procon.html#gsc.tab=0
 * Professor: Diego Caldas Chaves
 * Aluno: Brendo Oliveira SP3047237
*/
public class ProdutorConsumidor {
    public static void main(String[] args) {
        Unidade u = new Unidade();
        Produtor p1 = new Produtor(u, 1);
        Consumidor c1 = new Consumidor(u, 1);
        p1.start();
        c1.start();
    }
}
