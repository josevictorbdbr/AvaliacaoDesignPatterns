public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Criador auto = new CriadorAuto(
                "Vandercleiton automoveis",
                60000,
                24,
                true
        );

        Criador residencial = new CriadorResidencial(
                "Vandercleiton residencias",
                400000,
                true
        );

        Criador vida = new CriadorVida(
                "Vandercleiton Vida",
                35,
                300000,
                false
        );

        System.out.println("\nApolice auto: ");
        System.out.println(cliente.emitirApolice(auto));

        System.out.println("\nApolice residencial: ");
        System.out.println(cliente.emitirApolice(residencial));

        System.out.println("\napolice vida: ");
        System.out.println(cliente.emitirApolice(vida));
    }
}
