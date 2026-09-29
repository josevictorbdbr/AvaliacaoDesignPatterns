public class CriadorAuto extends Criador {

    private String segurado;
    private double CRLV;
    private int CNH;
    private boolean possuiDocumento;

    public CriadorAuto(String segurado, double CRLV, int CNH, boolean possuiDocumento){
        this.segurado = segurado;
        this.CRLV = CRLV;
        this.CNH = CNH;
        this.possuiDocumento = possuiDocumento;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto("AUTO-", segurado, CRLV, CNH, possuiDocumento);
    }
}
