public class CriadorResidencial extends Criador{

    private String segurado;
    private double valorImovel;
    private boolean possuiDocumentoImovel;

    public CriadorResidencial(String segurado, double valorImovel, boolean possuiEscritura){
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.possuiDocumentoImovel = possuiDocumentoImovel;
    }

    @Override
    protected Apolice criarApolice(){
        return new ApoliceResidencial("RES-",segurado, valorImovel, possuiDocumentoImovel);
    }
}
