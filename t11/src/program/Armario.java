package program;

import java.util.ArrayList;


import java.util.List;

public class Armario {
    private List<Prateleira> prateleiras;

    public Armario() {
        prateleiras = new ArrayList<>();
    }

    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }

    public List<Prateleira> getPrateleiras() {
        return prateleiras;
    }
}

public class Prateleira {
    private List<Compartimento> compartimentos;

    public Prateleira() {
        compartimentos = new ArrayList<>();
    }

    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
    }

    public List<Compartimento> getCompartimentos() {
        return compartimentos;
    }
}

public class Compartimento {
    private List<String> livros;
    private List<String> cds;

    public Compartimento() {
        livros = new ArrayList<>();
        cds = new ArrayList<>();
    }