public class CriadorVida extends Criador {

    private String segurado;
    private double capitalSegurado;
    private boolean possuiAtestado;

    public CriadorVida(String segurado, int idade, double capitalSegurado, boolean possuiAtestado) {
        this.segurado = segurado;
        this.capitalSegurado = capitalSegurado;
        this.possuiAtestado = possuiAtestado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida("VID-", segurado, capitalSegurado, possuiAtestado);
    }
}
