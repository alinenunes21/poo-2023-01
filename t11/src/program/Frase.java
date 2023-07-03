package program;
public class Frase {
    private String[] palavras;

    public Frase(String frase) {
        palavras = frase.split(" ");
    }

    public String[] getPalavras() {
        return palavras;
    }
}

public class Main {
    public static void main(String[] args) {
        String frase = "Uma frase de exemplo";
        Frase minhaFrase = new Frase(frase);

        String[] palavras = minhaFrase.getPalavras();
        System.out.println("Palavras da frase:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
