
public class Habito {

	import java.util.ArrayList;
	import java.util.List;

	public class Pessoa {
	    private String nome;
	    private List<Hábito> hábitos;

	    public Pessoa(String nome) {
	        this.nome = nome;
	        hábitos = new ArrayList<>();
	    }

	    public void adicionarHábito(Hábito hábito) {
	        hábitos.add(hábito);
	    }

	    public List<Hábito> getHábitos() {
	        return hábitos;
	    }

	    public String getNome() {
	        return nome;
	    }
	}

	public class Hábito {
	    private String nome;

	    public Hábito(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Pessoa pessoa = new Pessoa("João");
	        Hábito hábito1 = new Hábito("Correr");
	        Hábito hábito2 = new Hábito("Ler");
	        Hábito hábito3 = new Hábito("Meditar");

	        pessoa.adicionarHábito(hábito1);
	        pessoa.adicionarHábito(hábito2);
	        pessoa.adicionarHábito(hábito3);

	        System.out.println("Pessoa: " + pessoa.getNome());
	        List<Hábito> hábitos = pessoa.getHábitos();
	        System.out.println("Hábitos:");
	        for (Hábito hábito : hábitos) {
	            System.out.println(hábito.getNome());
	        }
	    }
	}
}
