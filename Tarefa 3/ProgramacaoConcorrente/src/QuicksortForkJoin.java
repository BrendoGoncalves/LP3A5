/* Fonte de Pesquisa: https://www.blogcyberini.com/  GitHub: HenriqueIni
 * Professor: Diego Caldas Chaves
 * Aluno: Brendo Oliveira SP3047237
 */

import java.util.concurrent.RecursiveAction;
public class QuicksortForkJoin extends RecursiveAction {
    private int[] vetor;
    private int comeco;
    private int termino;
    public QuicksortForkJoin(int[] vetorParcial, int comeco, int termino){
        this.vetor = vetorParcial;
        this.comeco = comeco;
        this.termino = termino;
    }
    public QuicksortForkJoin(int[] vetorCompleto){
        this(vetorCompleto, 0, vetorCompleto.length - 1);
    }
    @Override
    protected void compute() {
        if(comeco < termino){
            int q = partition(vetor, comeco, termino);
            invokeAll(new QuicksortForkJoin(vetor, comeco, q - 1),
                    new QuicksortForkJoin(vetor, q + 1, termino));
        }
    }
    private static int partition(int[] A, int inicio, int fim){
        int elementoFinal = A[fim];
        int i = inicio - 1;

        for(int j = inicio; j <= fim - 1; j++){
            if(A[j] <= elementoFinal){
                i = i + 1;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, fim);
        return i + 1;
    }
    private static void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    public void exibe(){
        int n;
        for(n=0; n < 5; n++){
            System.out.println(vetor[n]);
        }
    }
}