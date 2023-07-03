
public class Conteiner {
	
	    private List<Elemento> elementos;

	    public Conteiner() {
	        elementos = new ArrayList<>();
	    }

	    public void adicionarElemento(Elemento elemento) {
	        elementos.add(elemento);
	    }

	    // Outros métodos e funcionalidades do Contêiner
	}

	public abstract class Elemento {
	    // Atributos e métodos comuns a todos os Elementos
	}

	public class Objeto extends Elemento {
	    // Atributos e métodos específicos de Objeto
	}

	public class Conteiner extends Elemento {
	    private List<Elemento> elementos;

	    public Conteiner() {
	        elementos = new ArrayList<>();
	    }

	    public void adicionarElemento(Elemento elemento) {
	        elementos.add(elemento);
	    }

	    // Outros métodos e funcionalidades do Contêiner
	}

}
