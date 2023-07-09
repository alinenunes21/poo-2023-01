import java.util.ArrayList;
import java.util.List;

public class Casa {
    public static void main(String[] args) {
        // Criar uma lista de cômodos da casa
        List<String> comodos = new ArrayList<>();

        // Adicionar cômodos à lista
        comodos.add("Sala de estar");
        comodos.add("Cozinha");
        comodos.add("Quarto principal");
        comodos.add("Quarto de hóspedes");
        comodos.add("Banheiro");
        comodos.add("Escritório");
        comodos.add("Área de serviço");

        // Imprimir a lista de cômodos
        System.out.println("Lista de cômodos da casa:");
        for (String comodo : comodos) {
            System.out.println(comodo);
        }
    }
}
