import java.util.*;

public class CopaDoMundo {
    public static void main(String[] args) {
        String analise1 = "A Argentina é freguesa.";
        String analise2 = "O Brasil é favorito.";
        String analise3 = "A França é candidata.";

        ArrayList<String> analise = new ArrayList<>();
        analise.add(analise1);
        analise.add(analise2);
        analise.add(analise3);

        analise.remove(0);

        for(String ana : analise){
            System.out.println("Análise: " +ana);
        }

        System.out.println(analise);

        String primeiraAnalise = analise.get(0);
        System.out.println("A primeira análise é: " +primeiraAnalise);

        analise.add(analise1);

        for(int i = 0; i < analise.size(); ++i){
            System.out.println("Análise " +analise.get(i));
        }

        analise.forEach(ana -> {
            System.out.println("Verficando se : " +ana);
        });
        System.out.println(analise);
        Collections.sort(analise);
        System.out.println(analise);

        Selecao s1 = new Selecao("Brasil", 5);
        Selecao s2 = new Selecao("Argentina", 2);
        Selecao s3 = new Selecao("França", 2);

        ArrayList<Selecao> selecoes = new ArrayList<>();
        selecoes.add(s1);
        selecoes.add(s2);
        selecoes.add(s3);

        System.out.println(selecoes);

        Competicao c1 = new Competicao("Catar", 2022);
        List<Selecao> selecoes2 =  c1.getSelecoes();
        System.out.println(selecoes2);

        selecoes2.add(new Selecao("Inglaterra", 1));
        System.out.println(selecoes2);
        System.out.println(c1.getSelecoes());
        System.out.println(selecoes2 == c1.getSelecoes());

        c1.adiciona(new Selecao("Alemanha", 4));
        System.out.println(c1.getSelecoes());
        System.out.println(c1.getTitulosConquistados());

        Set<String> jogador = new HashSet<>();
        jogador.add("Neymar");
        jogador.add("Casemiro");
        jogador.add("Marquinhos");
        System.out.println(jogador);

        jogador.add("Neymar");

        System.out.println(jogador.size());

        for (String jogadores: jogador) {
            System.out.println(jogadores);
        }

        boolean NeymarConvocado = jogador.contains("Neymar");
        System.out.println(NeymarConvocado);

        Jogador j1 = new Jogador("Richarlison", "Atacante");
        Jogador j2 = new Jogador("Militão", "Zagueiro");
        Jogador j3 = new Jogador("Paquetá", "Meia");

        Map<String, String> tecnico = new HashMap<>();
        tecnico.put("nome", "Tite");
        tecnico.put("equipe", "Brasil");
        System.out.println(tecnico.get("nome"));
        System.out.println(tecnico.get("equipe"));

        for(String chave: tecnico.keySet()){
            System.out.println(chave+ ": " +tecnico.get(chave));
        }

    }
}