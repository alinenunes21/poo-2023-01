package program;
import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private List<Funcionario> funcionarios;

    public Lanchonete() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public boolean possuiGerente() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                return true;
            }
        }
        return false;
    }
}

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Lanchonete lanchonete = new Lanchonete();

        Funcionario funcionario1 = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Maria");
        Gerente gerente = new Gerente("Carlos");

        lanchonete.adicionarFuncionario(funcionario1);
        lanchonete.adicionarFuncionario(funcionario2);
        lanchonete.adicionarFuncionario(gerente);

        List<Funcionario> funcionarios = lanchonete.getFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
        }

        boolean possuiGerente = lanchonete.possuiGerente();
        System.out.println("Possui gerente: " + (possuiGerente ? "Sim" : "Não"));
    }
}
