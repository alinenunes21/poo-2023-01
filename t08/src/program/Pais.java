package program;

public class País {
    private String nome;
    private Cidade capital;
    private List<Cidade> cidades;

    public País(String nome) {
        this.nome = nome;
        cidades = new ArrayList<>();
    }

    public void setCapital(Cidade capital) {
        this.capital = capital;
    }

    public Cidade getCapital() {
        return capital;
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public String getNome() {
        return nome;
    }
}

public class Cidade {
    private String nome;
    private País país;

    public Cidade(String nome, País país) {
        this.nome = nome;
        this.país = país;
    }

    public String getNome() {
        return nome;
    }

    public País getPaís() {
        return país;
    }
}


