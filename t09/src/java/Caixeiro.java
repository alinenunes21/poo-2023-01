package java;

public class Caixeiro {

{
    private List<Viagem> viagens;

    public Caixeiro() {
        viagens = new ArrayList<>();
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    // Outros métodos e funcionalidades do caixeiro
}

public class Viagem {
    private List<Cidade> cidades;

    public Viagem() {
        cidades = new ArrayList<>();
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    // Outros métodos e funcionalidades da Viagem
}

public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    // Outros métodos e funcionalidades da Cidade
}
