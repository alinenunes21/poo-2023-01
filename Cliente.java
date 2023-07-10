public class Cliente {

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
}
