package program;

import java.util.ArrayList;
import java.util.List;

public class Texto {
    private List<Paragrafo> paragrafos;

    public Texto() {
        paragrafos = new ArrayList<>();
    }

    public void adicionarParagrafo(Paragrafo paragrafo) {
        paragrafos.add(paragrafo);
    }

    public List<Paragrafo> getParagrafos() {
        return paragrafos;
    }
}

public class Paragrafo {
    private List<Sentenca> sentencas;

    public Paragrafo() {
        sentencas = new ArrayList<>();
    }

    public void adicionarSentenca(Sentenca sentenca) {
        sentencas.add(sentenca);
    }

    public List<Sentenca> getSentencas() {
        return sentencas;
    }
}

public class Sentenca {
    private String conteudo;

    public Sentenca(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}

public class Main {
    public static void main(String[] args) {
        Sentenca sentenca1 = new Sentenca("Esta é a primeira sentença.");
        Sentenca sentenca2 = new Sentenca("Esta é a segunda sentença.");

        Paragrafo paragrafo1 = new Paragrafo();
        paragrafo1.adicionarSentenca(sentenca1);

        Paragrafo paragrafo2 = new Paragrafo();
        paragrafo2.adicionarSentenca(sentenca2);

        Texto texto = new Texto();
        texto.adicionarParagrafo(paragrafo1);
        texto.adicionarParagrafo(paragrafo2);

        List<Paragrafo> paragrafos = texto.getParagrafos();
        for (Paragrafo paragrafo : paragrafos) {
            System.out.println("Parágrafo:");
            List<Sentenca> sentencas = paragrafo.getSentencas();
            for (Sentenca sentenca : sentencas) {
                System.out.println("Sentença: " + sentenca.getConteudo());
            }
        }
    }
}
