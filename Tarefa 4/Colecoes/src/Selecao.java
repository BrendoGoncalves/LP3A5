public class Selecao {

    private String pais;
    private int titulos;

    public Selecao(String pais, int titulos) {
        this.pais = pais;
        this.titulos = titulos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString(){
        return "Seleção: "+this.pais+ " Títulos: "+this.titulos;
    }
}
