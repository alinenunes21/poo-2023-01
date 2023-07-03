package t10;
import java.util.ArrayList;
import java.util.List;
  

public  class Oficina {
	public String nome;
	public String endereco;
	public short tel;
}
	

	class Bicicleta {
	    private String marca;
	    private String modelo;
	    private String cor;
	    private String tamanho;
	    private String numeroSerie;
}
	class Cliente {
	    private String nome;
	    private String endereco;
	    private String telefone;
	    private String email;
	    private List<Bicicleta> bicicletas;

	    public Cliente(String nome, String endereco, String telefone, String email) {
	        this.nome = nome;
	        this.endereco = endereco;
	        this.telefone = telefone;
	        this.email = email;
	        this.bicicletas = new ArrayList<>();
	    }