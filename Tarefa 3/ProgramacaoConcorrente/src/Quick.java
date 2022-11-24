public class Quick {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        vetor[0] = 3;
        vetor[1] = 5;
        vetor[2] = 2;
        vetor[3] = 4;
        vetor[4] = 1;
        QuicksortForkJoin q = new QuicksortForkJoin(vetor);
        q.compute();
        q.exibe();
    }
}
