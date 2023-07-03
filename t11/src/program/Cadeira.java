package program;
public class Cadeira {
    private Pessoa proprietario;

    public Cadeira() {
        this.proprietario = null;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Cadeira cadeira = new Cadeira();

        Pessoa mulher = new Pessoa("Maria");
        Pessoa homem = new Pessoa("João");

        cadeira.setProprietario(mulher); // Atribui uma mulher como proprietária da cadeira

        // Ou

        cadeira.setProprietario(homem); // Atribui um homem como proprietário da cadeira
    }
}
