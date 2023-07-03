package program;

import java.time.LocalDate;

public class Periodo {
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Periodo(LocalDate dataInicial, LocalDate dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public String toString() {
        return "De " + dataInicial + " até " + dataFinal;
    }
}

public class Main {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(2023, 1, 1);
        LocalDate dataFinal = LocalDate.of(2023, 12, 31);

        Periodo periodo = new Periodo(dataInicial, dataFinal);
        System.out.println("Período: " + periodo);
    }
}
