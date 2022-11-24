import java.util.LinkedList;
import java.util.List;

public class Competicao {
    private String local;
    private int ano;
    private List<Selecao> selecoes = new LinkedList<Selecao>();

    public List<Selecao> getSelecoes(){
        return selecoes;
    }

    public Competicao(String local, int ano) {
        this.local = local;
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public int getAno() {
        return ano;
    }

    public void adiciona(Selecao selecao){
        this.selecoes.add(selecao);
    }

    public int getTitulosConquistados(){
        int titulosTotais = 0;
        for(Selecao selecao: selecoes){
            titulosTotais += selecao.getTitulos();
        }
        return titulosTotais;
    }
}
