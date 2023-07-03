package program;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private List<Arvore> arvores;

    public Floresta() {
        arvores = new ArrayList<>();
    }

    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }

    public List<Arvore> getArvores() {
        return arvores;
    }
}

public class Arvore {
    private List<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public List<Folha> getFolhas() {
        return folhas;
    }
}

public class Folha {
    private TipoFolha tipo;

    public Folha(TipoFolha tipo) {
        this.tipo = tipo;
    }

    public TipoFolha getTipo() {
        return tipo;
    }
}

public class TipoFolha {
    private String forma;

    public TipoFolha(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }
}

public class Main {
    public static void main(String[] args) {
        TipoFolha tipo1 = new TipoFolha("Forma 1");
        TipoFolha tipo2 = new TipoFolha("Forma 2");

        Folha folha1 = new Folha(tipo1);
        Folha folha2 = new Folha(tipo2);

        Arvore arvore = new Arvore();
        arvore.adicionarFolha(folha1);
        arvore.adicionarFolha(folha2);

        Floresta floresta = new Floresta();
        floresta.adicionarArvore(arvore);

        List<Arvore> arvores = floresta.getArvores();
        for (Arvore a : arvores) {
            System.out.println("Árvore:");
            List<Folha> folhas = a.getFolhas();
            for (Folha f : folhas) {
                TipoFolha tipo = f.getTipo();
                System.out.println("Folha: " + tipo.getForma());
            }
        }
    }
}
