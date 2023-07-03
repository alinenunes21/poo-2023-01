package program;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private List<LinguagemProgramacao> linguagens;

    public Projeto() {
        linguagens = new ArrayList<>();
    }

    public void adicionarLinguagem(LinguagemProgramacao linguagem) {
        linguagens.add(linguagem);
    }

    public List<LinguagemProgramacao> getLinguagens() {
        return linguagens;
    }
}

public class LinguagemProgramacao {
    private String nome;

    public LinguagemProgramacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        LinguagemProgramacao linguagem1 = new LinguagemProgramacao("Java");
        LinguagemProgramacao linguagem2 = new LinguagemProgramacao("Python");

        Projeto projeto = new Projeto();
        projeto.adicionarLinguagem(linguagem1);
        projeto.adicionarLinguagem(linguagem2);

        List<LinguagemProgramacao> linguagens = projeto.getLinguagens();
        System.out.println("Linguagens do projeto:");
        for (LinguagemProgramacao linguagem : linguagens) {
            System.out.println(linguagem.getNome());
        }
    }
}
