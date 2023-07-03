package program;
public class Preco {
    private double valor;
    private String moeda;

    public Preco(double valor, String moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public String getMoeda() {
        return moeda;
    }

    @Override
    public String toString() {
        return valor + " " + moeda;
    }
}

public class Main {
    public static void main(String[] args) {
        Preco preco = new Preco(10.0, "dólar");
        System.out.println("Preço: " + preco);
    }
}
