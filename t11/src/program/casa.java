package program;
import java.util.ArrayList;
import java.util.List;

class Casa {
    private List<Quarto> quartos;
    private List<Banheiro> banheiros;
    private List<Sala> salas;
    private List<Area> areas;
    private List<Garagem> garagens;

    public Casa() {
        this.quartos = new ArrayList<>();
        this.banheiros = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.areas = new ArrayList<>();
        this.garagens = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void adicionarBanheiro(Banheiro banheiro) {
        banheiros.add(banheiro);
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public void adicionarArea(Area area) {
        areas.add(area);
    }

    public void adicionarGaragem(Garagem garagem) {
        garagens.add(garagem);
    }

    

